import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Random;

public class AJava {
    private static final Random random = new Random();
    public static void main(String[] args) {
        List<Integer> arr = generateRandomNumber();
        Integer amount = 3;
        arr = arr.stream().map(n -> n*amount).sorted().collect(Collectors.toList());
        System.out.println("arr: ");
        arr.forEach(n -> System.out.print(n + " "));
    }

    private static List<Integer> generateRandomNumber() {
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<10;i++) {
            arr.add(random.nextInt(100));
        }
        System.out.println("Generated random number: ");
        arr.forEach(n->System.out.print(n + " "));
        System.out.println();
        return arr;
    }
}
