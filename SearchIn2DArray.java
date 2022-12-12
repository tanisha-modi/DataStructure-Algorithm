// import javax.swing.plaf.synth.SynthScrollBarUI;
import java.util.Arrays;


public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = { 
            {12, 56, 8},
            {67, 35},
            {23, 78, 3, 67}
        };
        int target = 78;
        int[] ans =  search(arr, target) ;
        System.out.println(Arrays.toString(ans));

        int res =  searchMax(arr) ;
        System.out.println("MAX : " + res);
        int maxi =  searchMax2(arr) ;
        System.out.println("MAX : " + maxi);
    }

    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                 if (arr[row][col] == target ) {
                    return new int[]{row, col};   // new keyworw is required 
                 }    
            }
        }
        return new int[]{-1,-1};
    }
    static int searchMax(int[][] arr){
        int max = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                 if (arr[row][col] > max ) {
                     max = arr[row][col];
                 }    
            }
        }
        return max;
    }
    static int searchMax2(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                 if (element > max ) {
                     max = element;
                 }    
            }
        }
        return max;
    }
}
