import java.util.Scanner;
import java.util.ArrayList;
import java.util.NoSuchElementException;
interface Ops{
    int cmp(ArrayList<Integer> a,int b);
}
public class lminmax {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        int t = in.nextInt();
        ArrayList<Integer> num = new ArrayList<>();
        while(t-- > 0){
            int n = in.nextInt();
            num.add(n);
        } 
        Integer max = num.stream().mapToInt(a -> a).max().orElseThrow(NoSuchElementException::new);
        Integer min = num.stream().mapToInt(a -> a).min().orElseThrow(NoSuchElementException::new); 
        System.out.println(max + " " + min);
    } 
}
