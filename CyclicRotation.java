/* The APPROACH
* ARRAY A CANNOT BE NULL AND HAS TO HAVE AT LEAST ONE ELEMENT
* IF K IS 0 OR THE LENGTH OF THE ARRAY IS ONLY 1, RETURN THE ARRAY
* CALCULATE THE ACTUAL NUMBER OF ROTATIONS TO PERFORM
* ROTATE THE ARRAY
* RETURN THE ROTATED ARRAY
*
* CONSTRAINTS
* N AND K ARE INTEGERS WITHIN 0-100
* EACH ELEMENT OF THE ARRAY A IS AN INTEGER WITHIN THE RANGE -1000 TO 1000*/

import static java.util.Collections.reverse;

public class CyclicRotation {
    public int[] solution(int[] A, int K){
        
    }
    //ORIGINAL SOLUTION TO PROBLEM
//    public static void main(String[] args) {
//        System.out.println(CyclicRotation);
//    }
//    public int[] solution(int[] A, int K) {
//        if (A == null || A.length == 0 || K == 0 || A.length == 1){
//            return A;
//        } else if (K < 0 || K > 100){
//            throw new IllegalArgumentException("K must be an integer between 0 and 100");
//        } else {
//            K = K % A.length;
//            if (K < 0){
//                K += A.length;
//            }
//        }
//        return A;
//    }
}
