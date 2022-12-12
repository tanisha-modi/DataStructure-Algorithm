public class MaxWealth {
    public static void main(String[] args) {
        int[][] array = {
            {7,8},
            {2,6,7},
            {5,9,12}
        };
        System.out.println(wealth(array));

    }

    static int wealth(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] person : arr) {

            int wealth = 0;
            for (int element : person) {
                wealth = wealth + element;
            }
            if (wealth > max) {
                max = wealth;
            }
        }
        return max;
    }
}
