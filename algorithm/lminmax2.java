import java.util.ArrayList;
import java.util.stream.Stream;

public class lminmax2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(); // Test input
        arr.add(4);
        arr.add(7);
        arr.add(3);
        arr.add(9);
        arr.add(2);
        arr.add(1);

        CMP find = new CMP(); // CMP is just a class that contain lambda function
        System.out.println(find.MAX(arr));
        System.out.println(find.MIN(arr));

        Stream<Integer> stream = Stream.of(2,5,8,7,4,1,9,6,3,0);
        stream.forEach(System.out::print);

    }   
}

class CMP{
    private Ops2 max; //declare Ops and rank
    private Ops2 min; 
    private Rank r; 

    //setup lambda function
    public CMP(){
        
        //setup min and max function
        max = (a,b) -> {return a>b?a:b;};
        min = (a,b) -> {return a<b?a:b;};

        //setup iterator
        r = (array,fun)->{
            int temp = array.get(0);
            for(int i : array){
                temp = fun.cmp(temp, i);
            }   
            return temp;   
        };
    }

    // declare traditional method
    public int MIN(ArrayList<Integer> arr){
        return r.rank(arr, min);
    }

    public int MAX(ArrayList<Integer> arr){
        return r.rank(arr, max);
    }

}

//setup Ops template
interface Ops2{
    int cmp(int a,int b);
}

//setup Rank template
interface Rank{
    int rank(ArrayList<Integer> arr,Ops2 fun);
}