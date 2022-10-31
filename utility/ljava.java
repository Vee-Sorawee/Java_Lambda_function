import java.util.ArrayList;
public class ljava{
    public static void main(String[] args){
        ArrayList<String> word = new ArrayList<>();
        word.add("oat");
        word.add("is");
        word.add("real");
        word.add("eiei");
        word.forEach((n)->{System.out.println(n);});
    }
}