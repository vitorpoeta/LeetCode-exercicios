import java.util.HashSet;

public class ContainsDuplicate217 {
    // Como eu fiz de solução de primeira, passou nos testes, mas com número
    // extremamente alto deu time limit error
    /*
     * public boolean containsDuplicate(int[] nums) {
     * for (int i = 0; i < nums.length; i++) {
     * for (int j = i + 1; j < nums.length; j++) {
     * if (nums[i] == nums[j]) {
     * return true;
     * }
     * }
     * }
     * return false;
     * }
     */

    // Solução que achei mais interessante

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate217 sol = new ContainsDuplicate217();

        int[] nums1 = { 1, 2, 3, 1 };
        System.out.println("Resultado 1: " + sol.containsDuplicate(nums1)); // true

        int[] nums2 = { 1, 2, 3, 4 };
        System.out.println("Resultado 2: " + sol.containsDuplicate(nums2)); // false

        int[] nums3 = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        System.out.println("Resultado 3: " + sol.containsDuplicate(nums3)); // true
    }
}
