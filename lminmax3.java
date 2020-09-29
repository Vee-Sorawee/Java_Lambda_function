import java.util.ArrayList;

public class lminmax3{
    static Integer min;
    static Integer max;
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);list.add(7);list.add(3);list.add(9);list.add(2);list.add(1);
        
        min = list.get(0);
        max = list.get(0);
        list.forEach((i)->{
            min = min>i?i:min;
            max = max<i?i:max;
        });

        System.out.println(min);
        System.out.println(max);
    }
}