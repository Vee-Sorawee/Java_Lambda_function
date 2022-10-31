package problem;
import java.util.Arrays;
import java.util.Scanner;

public class Pet {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        Integer[][] scores = new Integer[5][4];
        for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                scores[i][j] = in.nextInt();
            }
        }
        System.out.println(solution(scores));
    }

    private static String solution(Integer[][] scores){
        Integer max = findMax(scores);
        Integer winner = findWinner(scores, max);
        return winner + " " + max;
    }

    private static Integer findMax(Integer[][] scores){
        return Arrays.stream(scores).mapToInt(
            score -> Arrays.stream(score)
                .mapToInt(Integer::intValue)
                .sum()
        ).max().orElse(-1);
    }

    private static Integer findWinner(Integer[][] scores, Integer max){
        for(int i=0;i<scores.length;i++){
            int sum = sum(scores[i]);
            if(sum == max){
                return i+1;
            }
        }
        return -1;
    }

    private static Integer sum(Integer[] score){
        return Arrays.stream(score)
            .mapToInt(Integer::intValue)
            .sum();
    }
}
