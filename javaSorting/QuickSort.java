package javaSorting;

public class QuickSort {
    public static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    public static int partition(int[] A, int start, int end){
        int pivot = A[start];
        int trackIndex = start+1;
        int i;
        for(i = start+1; i <= end; i++){
            if(A[i] < pivot){
                swap(A, i, trackIndex);
                trackIndex++;
            }
        }
        trackIndex--;
        swap(A, start, trackIndex);
        return trackIndex;
    }
    public static void quickSort(int[] A, int start, int end){
        if(start < end){
            int pi = partition(A, start, end);
            quickSort(A, start, pi-1);
            quickSort(A, pi+1, end);
        }
    }
}