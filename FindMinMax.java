// package DSA.Searching;

public class FindMinMax {
    public static void main(String[] args) {
        int[] arr = {12, 46, 23, 8, 3 ,79};
        System.out.println(min(arr));
        System.out.println(max(arr));
    }

    static int min(int[] arr){
        int mini = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < mini) {
                mini = arr[i];
            }
        }
        return mini;
    }
    static int max(int[] arr){
        int maxi = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
        }
        return maxi;
    }
}
