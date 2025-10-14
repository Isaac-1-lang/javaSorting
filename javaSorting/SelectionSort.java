package javaSorting;

public class SelectionSort {
    public static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    public static void selectionSort(int[] A){
        int n = A.length;
        for(int i = 0; i < n-1; i++){
            int minIndex = i;
            for(int j = i+1; j < n; j++){
                if(A[j] < A[minIndex])
                    minIndex = j;
            }
            swap(A, minIndex, i);
        }
    }
}