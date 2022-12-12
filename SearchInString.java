// package DSA.Searching.LinearSearch;
import java.util.Arrays;


public class SearchInString {
    public static void main(String[] args) {
        String name = "tanisha";
        char target = 'i';
        // System.out.println( Arrays.toString(name.toCharArray()));
        System.out.println(search(name, target));
        System.out.println(search1(name, target));
    }

    static int search(String name, char target){
        if(name.length() == 0){                   // String.length() is a function while array.length is a variable
            return -1; 
        }

        for (int index = 0; index < name.length(); index++) {
            if (target == name.charAt(index)) {       // String.charAt(index)   -->  return character at that index 
                return index;
            }
        }
        return -1;
    }
    static boolean search1(String name, char target){ 
        if(name.length() == 0){                   // String.length() is a function while array.length is a variable
            return false; 
        }

        for (int index = 0; index < name.length(); index++) {
            if (target == name.charAt(index)) {       // String.charAt(index)   -->  return character at that index 
                return true;
            }
        }
        return false;
    }
    // static boolean search2(String name, char target){
    //     if(name.length() == 0){                   // String.length() is a function while array.length is a variable
    //         return false; 
    //     }

    //     for (char ch : name.toCharArray()) {
    //         if (target == target) {       // String.charAt(index)   -->  return character at that index 
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    
}
