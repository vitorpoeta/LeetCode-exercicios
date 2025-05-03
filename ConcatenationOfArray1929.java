public class ConcatenationOfArray1929 {
    public int[] getConcatenation(int[] nums) {
        int[] numTotal = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            numTotal[i] = nums[i];
            numTotal[i + nums.length] = nums[i];
        }
        return numTotal;
    }

    public static void main(String[] args) {
        ConcatenationOfArray1929 sol = new ConcatenationOfArray1929();

        int[] nums1 = { 1, 2, 1 };
        int[] result1 = sol.getConcatenation(nums1);
        System.out.print("Caso: ");
        for (int num : result1) {
            System.out.print(num + " ");
        }
    }
}
