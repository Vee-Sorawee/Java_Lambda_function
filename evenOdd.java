import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
interface Check{
    String isEven(int num);
}
public class evenOdd{
    private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        int number = Integer.parseInt(in.readLine());
        Check chk = (num) -> {return num%2==0?"Eveb":"Odd";}; 

        System.out.println(fun(number,chk)); 
        System.out.println(fun(12,chk)); 
        System.out.println(fun(13,chk));
    
    }

    public static String fun(int num,Check run){
        return run.isEven(num);
    }

}