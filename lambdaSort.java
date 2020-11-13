public class lambdaSort {
    public static void main(String[] args) {
        int[] Arr = {4,3,5,1,2,8,9,6,0,7};

        CMP c = (arr,i)->{
            int min = arr[i];
            int p = i; 
            for(int j=i;j<arr.length;j++){
                if(min > arr[j]){
                    min = arr[j];
                    p = j;
                }   
            }
            int temp = arr[i];
            arr[i] = arr[p];
            arr[p] = temp;
            return arr;
        };

        SHOW s = (arr)->{
            for(int i : arr){System.out.print(i + " ");}
        };

        for(int i=0;i<Arr.length;i++){
            Arr = c.cmp(Arr,i);
        }

        s.show(Arr);
    }
}

interface CMP {
    int[] cmp(int[] arr, int i);
}

interface SHOW {
    void show(int[] arr);
}
