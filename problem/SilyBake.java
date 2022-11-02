package problem;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.Arrays;

public class SilyBake {
    private static final Double[] cakeRatio = {1.0,0.75,0.5,0.25,0.125};
    public static void main(String[] args) {
        System.out.println(solution(getInput()));
    }

    private static Integer[][] getInput(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[][] cakes = new Integer[n][5];
        for(int i=0;i<n;i++){
            Integer[] cake = new Integer[5];
            for(int j=0;j<5;j++){
                cake[j] = in.nextInt();
            }
            cakes[i] = cake;
        }
        in.close();
        return cakes;
    }

    private static Integer solution(Integer[][] cakes) {
        return (int) Math.ceil(
            Arrays.stream(cakes).mapToDouble(
                cake -> IntStream.range(0, cake.length)
                    .mapToDouble(j -> cakeRatio[j] * cake[j])
                    .sum()
            ).sum()
        );
    }
}
