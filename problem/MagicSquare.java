package problem;

import java.util.Scanner;
import java.util.Arrays;

public class MagicSquare {

    private static Integer[][] square;
    private static Integer sum;
    public static void main(String[] args) {
        square = getInput();
        sum = Arrays.stream(square[0]).mapToInt(Integer::intValue).sum();
        System.out.println(solution());
    }

    private static String solution() {
        if(isDuplicate()) return "No";
        return checkRow() && checkColumn() && checkDownDiagonal() && checkUpDiagonal() ? "Yes" : "No";
    }

    private static Boolean isDuplicate(){
        Integer[] checkArray = Arrays.stream(square)
                .flatMap(Arrays::stream)
                .toArray(Integer[]::new);
        return Arrays.stream(checkArray).distinct().count() != checkArray.length;
    }

    private static Integer[][] getInput(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[][] square = new Integer[n][n];
        for(int i=0;i<n;i++){
            Integer[] row = new Integer[n];
            for(int j=0;j<n;j++){
                row[j] = in.nextInt();
            }
            square[i] = row;
        }
        in.close();
        return square;
    }

    private static Boolean checkRow(){
        for(Integer[] row : square){
            if(Arrays.stream(row).mapToInt(Integer::intValue).sum() != sum){
                return false;
            }
        }
        return true;
    }

    private static Boolean checkColumn(){
        int n = square.length;
        for(int i=0;i<n;i++){
            int s = 0;
            for(int j=0;j<n;j++){
                s += square[j][i];
            }
            if(s != sum){
                return false;
            }
        }
        return true;
    }

    private static Boolean checkDownDiagonal(){
        int n = square.length;
        int s = 0;
        for(int i=0;i<n;i++){
            s += square[i][i];
        }
        return s == sum;
    }

    private static Boolean checkUpDiagonal(){
        int n = square.length;
        int s = 0;
        for(int i=0;i<n;i++){
            s += square[i][n-i-1];
        }
        return s == sum;
    }
}
