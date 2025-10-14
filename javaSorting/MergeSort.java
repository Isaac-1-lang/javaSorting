package javaSorting;

public class MergeSort {
    public static void merge(int A[], int start, int mid , int end){
        int n = mid - start + 1;
        int m = end - mid;
        
        int[] L = new int[n];
        int[] R = new int[m];

        int i, j, k;

        for(i = 0; i < n; i++)
            L[i] = A[i+start];

        for(j = 0; j < m; j++)
            R[j] = A[j+mid+1];
        
        i = j = 0;
        k = start;
        while(i < n && j < m){
            if(L[i] <= R[j]){
                A[k] = L[i];
                k++;
                i++;
            } else {
                A[k] = R[j];
                k++;
                j++;
            }
        }
        while(i < n){
            A[k] = L[i];
            k++;
            i++;
        }
        while(j < m){
            A[k] = R[j];
            k++;
            j++;
        }
    }
    public static void mergeSort(int A[], int start , int end){
        if(start < end){
            int mid = (start + end)/2;
            mergeSort(A, start, mid);
            mergeSort(A, mid+1, end);
            merge(A, start, mid, end);
        }
    }
}