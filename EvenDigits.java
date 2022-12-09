import java.util.Scanner;

public class EvenDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = {12,45,645,3435,564,0,1,-1};
        // System.out.println(evenNum(array));
        System.out.println(findNum(array));
        System.out.println(digits(3783586 ));
    }

    // static int evenNum(int[] arr){
    //     int count = 0;
    //     int ans = 0;
    //     for (int element : arr) {
    //          while (element != 0) {
    //              element = element/10;
    //              count++;
    //          }
    //          if(count%2 == 0){
    //             ans++;
    //          }
    //     }
    //     return ans;
    // }

    // function to count the number of elements with even digits
    static int findNum(int[] arr){
        int count = 0;

        for (int element : arr) {
             if(even(element)){
                count++;
             }
        }
        return count;
    }
    
    // function to check whether a number contains even digits or not
    static boolean even(int num){
        int numberOfDigits = digits(num);
        
        // if(numberOfDigits%2 == 0){
        //     return true;
        //  }

         return numberOfDigits%2 == 0;  // directly write condition in return statement // returns true or false 
    }
    
    // function to count number of digits 
    static int digits(int number){
        int count = 0;
        
        // if number is negative 
        if (number < 0) {
            number = number * -1; 
        }
        else if(number == 0 ){
            return 1; 
        }
        
        while (number != 0) {
            number = number/10;
            count++;
        }
        return count;
        // return (int)(math.log10(number)) +1;
   }
}
