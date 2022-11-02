package problem;
import java.util.Scanner;
import java.util.Set;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class LoobLike {
    public static void main(String[] args) {
        solution(getInput());
    }

    private static List<Integer> getInput() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++) {
            arr.add(in.nextInt());
        }
        in.close();
        return arr;
    }

    private static void solution(List<Integer> arr){
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = arr.stream().collect(Collectors.toSet());

        for(Integer n : set) {
            map.put(n, Collections.frequency(arr, n));
        }

        Integer max = map.values().stream().max(Integer::compareTo).orElse(-1);


        List<Integer> result = map.entrySet().stream()
            .filter(entry -> entry.getValue() == max)
            .map(entry -> entry.getKey())
            .collect(Collectors.toList());

        result.forEach(n -> System.out.print(n + " "));

    }
}
