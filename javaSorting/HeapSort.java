package javaSorting;
public class HeapSort {
    // Function to swap the numbers if they are in the wrong order.
    public static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    // Main function to keep numbers in a heap format in order to sort it se heap sort
    public static void heapify(int[] A, int i, int heapSize){
        int L = i*2 + 1;
        int R = i*2 + 2;
        int largest = i;
        
        if(L < heapSize && A[largest] < A[L])
            largest = L;
        if(R < heapSize && A[largest] < A[R])
            largest = R;
        
        if(largest != i){
            swap(A, i, largest);
            heapify(A, largest, heapSize);
        }
    }
    public static void heapSort(int[] A){
        int n = A.length;
        for(int i = (n-2)/2; i >= 0; i--)
            heapify(A, i, n);

        for(int heapSize = n; heapSize >1; ){
            int temp = A[0];
            A[0] = A[heapSize-1];
            A[heapSize-1] = temp;
            heapSize--;
            heapify(A, 0, heapSize);
        }
    }
}
