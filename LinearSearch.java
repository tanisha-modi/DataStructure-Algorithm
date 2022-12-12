import java.time.chrono.MinguoChronology;

import javax.swing.plaf.synth.SynthDesktopIconUI;

// public class LinearSearch {
//     public static void main(String[] args) {
//         int[] arr = {12, 45, 34, 87, 89};
//         int target = 72;
//         int ans = linearSearch(arr, target);
//         System.out.println(ans);
//     }

//     static int linearSearch(int[] arr, int target){
//         if(arr.length == 0 ){
//             return -1;
//         }

//         for (int index = 0; index < arr.length; index++) {
//             int element = arr[index];
//             if(element == target){
//                 return index;
//             }
//         }
//         return -1;  // this line is executed when none of the above return statement have executed 
//                     // hence target not found 

//     }
// }


public class LinearSearch{
    public static void main(String[] args) {
        int[] arr = {12, 45, 56, 34, 90};
        int target = 13;
        // boolean res = linearSearch3(arr, target);
        int res = linearSearch(arr, target);
        System.out.println(res);
    }

    static int linearSearch(int[] arr, int target){
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            if(target == arr[index]){
                return index;
            }
        }
        return -1;
    }

    // if u need to return element

    static int linearSearch2(int[] arr, int target){
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }

        for (int element : arr) {
            if(target  == element){
                return element;  
            }
        }
        return Integer.MAX_VALUE;
    }

    // static boolean linearSearch3(int[] arr, int target){
    //     if (arr.length == 0) {
    //         return false;
    //     }

    //     for (int index = 0; index < arr.length; index++) {
    //         if(target == arr[index]){
    //             return true;
    //         }
    //         else{
    //             return false;
    //         }
    //     }
 
    //     return false;
    // }
}