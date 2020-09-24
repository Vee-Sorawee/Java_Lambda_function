import java.util.Scanner;
import java.util.ArrayList;
public class lminmax {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        int t = in.nextInt();
        ArrayList<Integer> num = new ArrayList<>();
        while(t-- > 0){
            int n = in.nextInt();
            num.add(n);
        } 
        int min = num.get(0);
        int max = num.get(0);
        num.forEach((i) -> {
            i=i*2;
            System.out.println(i);
        });
    } 
}
