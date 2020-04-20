package AlgStruct.Alg.Sort;

public class Sort {
    public int[] selectionSort(int[] a){
        for (int i = 0; i <a.length ; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]>a[j]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        return a;
    }

    public int[] bubbleSort(int[] a){
        for (int i = 0; i <a.length-1 ; i++) {
            for (int j = 0; j < a.length-i-1; j++) {
                if (a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }


    public static void main(String[] args) {
        Sort b =new Sort();
        int[] test = {7,3,5,2,4};
        for (int a :b.bubbleSort(test)) {
            System.out.println(a);
        }
    }
}
