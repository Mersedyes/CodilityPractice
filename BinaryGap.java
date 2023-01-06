public class BinaryGap {
    public static void main(String[] args) {
        BinaryGap binaryGap = new BinaryGap();
        int N = 1041;
        int result = binaryGap.solution(N);
        System.out.println(result);
    }

    public int solution(int N) {
        //convert string to integer
        String binary = Integer.toBinaryString(N);
        int maxGap = 0;
        int currentGap = 0;

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1'){
                currentGap = 0;
            } else if (binary.charAt(i) == '0'){
                currentGap++;
                maxGap = Math.max(maxGap, currentGap);
            }
        }
        return maxGap;
    }
}
