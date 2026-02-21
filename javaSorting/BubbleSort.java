package javaSorting;
public class BubbleSort {
    // Function for swapping 2 number if they are in the wrong order.
    public static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    // Main bubble sort function to call swap function if the numbers in a wrong orderr
    public static void bubbleSort(int[] A){
        int n = A.length;
        boolean sorted = false;
        int j = n-1;
        while(!sorted){
            sorted = true;
            for(int i = 0; i < j; i++){
                if(A[i] > A[i+1]){
                    swap(A, i, i+1);
                    sorted = false;
                }
            }
            j--;
        }
    }
}
