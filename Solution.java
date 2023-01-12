import java.util.BitSet;

public class Solution {
    //100% performance 20% correctness --> efficiency does not equal correctness
//    public int solution(int[] A){
//        //write a simple and efficient algorithm using bitset instead of boolean array
//        BitSet bitSet = new BitSet(A.length);
//        int max = 0;
//
//        for (int i = 0; i < A.length; i++){
//            if (A[i] > 0 && A[i] <= A.length){
//                bitSet.set(A[i] - 1);
//            }
//            max = Math.max(max, A[i]);
//        }
//        for (int i = 0; i < bitSet.length(); i++){
//            if (!bitSet.get(i)) {
//                return i + 1;
//            }
//        }
//        return max+1;
//    }
//public static void main(String[] args) {
//    Solution solution = new Solution();
//    int N = 1990;
//    int result = solution.solution(N);
//    System.out.println(result);
//}
//    //write a function which, given an integer N, returns the smallest integer that is greater than N and the sum of whose digits is equal to the sume of the digits of N
//    public int solution(int N) {
//        //initialise the result to N+1
//        int result = N + 1;
//
//        while (true) {
//            int sum = 0;
//            int temp = result;
//            while (temp > 0) {
//                sum += temp % 10;
//                temp /= 10;
//            }
//            if (sum == sumOfDigits(N)) {
//                return result;
//            }
//            result++;
//        }
//    }
//
//    //write a helper function to calculate the sum of digits of N
//    private int sumOfDigits(int number) {
//        int sum = 0;
//        while (number > 0) {
//            sum += number % 10;
//            number /= 10;
//        }
//        return sum;
//    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] A = {"0-0","0-1","2-3","2-0"};
        String result = solution.solution(A);
        System.out.println(result);
    }
    //write a function which, given an integer N, returns the smallest integer that is greater than N and the sum of whose digits is equal to the sume of the digits of N
    public String solution(String[] A) {
        //iterate through all possibilities for a domino tile
        for (int x = 0; x <= 6; x++){
            for (int y = 0; y <= 6; y++){
                String dominoTile = x + "-" + y;
                if (!isInArray(dominoTile, A)){
                    return dominoTile;
                }
            }
        }
        return "";
    }

    //write a helper function to check if a domino tile is in the array
    private boolean isInArray(String dominoTile, String[] list){
        for (String tile : list){
            if (tile.equals(dominoTile) || tile.equals(new StringBuilder(dominoTile).reverse().toString())){
                return true;
            }
        }
        return false;
    }
}
