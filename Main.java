import javaSorting.*;
public class Main {
    public static void main(String[] args){
        int[][] A = {
            {1, 2, 3}, {1, 3, 2}, {2, 1, 3}, {2, 3, 1}, {3, 1, 2}, {3, 2, 1}
        };
        for(int i = 0; i < 6; i++){
            BubbleSort.bubbleSort(A[i]);
        }
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}