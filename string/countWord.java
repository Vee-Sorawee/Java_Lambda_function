import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.regex.Pattern;
import java.io.BufferedReader;
public class countWord {
    private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        double start = System.currentTimeMillis(); 
        
        String word = "Sahachan Tippimwong Oat I live in Kamphanegphet I really love Grape and Tomato"; 
        String test = word.toUpperCase();
        test.replaceAll("[^A-Z]","");

        Pattern pattern = Pattern.compile(" ");

        HashMap<String, Integer> wordCount = (HashMap<String, Integer>) pattern.splitAsStream(test);

        double end = System.currentTimeMillis(); 
        System.out.println(end - start);
    }    
}
