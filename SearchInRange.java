import java.io.LineNumberReader;

// package DSA.Searching.LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {12, 45, 654, 34, 64 ,2};
        int target = 64;
        int start = 1, end = 3;
        System.err.println(linearSearch(arr, target, start, end));
    }

    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }

        for(int i = start; i <= end; i++ ){
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
