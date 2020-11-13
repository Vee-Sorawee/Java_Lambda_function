public class lambdaSort2 {
    public static void main(String[] args) {
        int[] Arr = { 4, 3, 5, 1, 2, 8, 9, 6, 0, 7 };

        for (int I = 0; I < Arr.length; I++) {
            Arr = partOfSelection(Arr, I, (arr, i) -> {
                int min = arr[i];
                int p = i;
                for (int j = i; j < arr.length; j++) {
                    if (min > arr[j]) {
                        min = arr[j];
                        p = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[p];
                arr[p] = temp;
                return arr;
            });
        }
        show(Arr,(arr)->{
            for (int i : arr) {
                System.out.print(i + " ");
            }
        });
    }

    public static int[] partOfSelection(int[] Arr, int I, CMP2 cmp) {
        return cmp.cmp(Arr, I);
    }

    public static void show(int[] arr,SHOW2 s) {
        s.show(arr);
    }
}

interface CMP2 {
    int[] cmp(int[] arr, int i);
}

interface SHOW2 {
    void show(int[] arr);
}