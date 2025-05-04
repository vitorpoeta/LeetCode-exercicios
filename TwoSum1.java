import java.util.Arrays;
import java.util.HashMap;

public class TwoSum1 {
    // Minha primeira solução 
    /*public int[] twoSum(int[] nums, int target) {
        int[] resultado = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i] + nums[j]) == target){
                    resultado[0] = i;
                    resultado[1] = j;
                    return resultado;
                }
            }
        }
        return resultado;
    }*/
    // Solução que encontrei na internet
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int numeroBuscar = target - nums[i];
            if(map.containsKey(numeroBuscar)){
                return new int[] {map.get(numeroBuscar), i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum1 teste = new TwoSum1();
        // Teste 1
        int[] nums1 = { 2, 7, 11, 15 };
        int target1 = 9;
        System.out.println("Teste 1: " + Arrays.toString(nums1) + ", target = " + target1);
        int[] result1 = teste.twoSum(nums1, target1);
        System.out.println(Arrays.toString(result1));
        // Teste 2
        int[] nums2 = { 3, 2, 4 };
        int target2 = 6;
        System.out.println("Teste 2: " + Arrays.toString(nums2) + ", target = " + target2);
        int[] result2 = teste.twoSum(nums2, target2);
        System.out.println(Arrays.toString(result2));
        // Teste 3
        int[] nums3 = { 3, 3 };
        int target3 = 6;
        System.out.println("Teste 3: " + Arrays.toString(nums3) + ", target = " + target3);
        int[] result3 = teste.twoSum(nums3, target3);
        System.out.println(Arrays.toString(result3));
        // Teste 4: negativos e zero
        int[] nums4 = { -1, 0, 1, 2 };
        int target4 = 1;
        System.out.println("Teste 4: " + Arrays.toString(nums4) + ", target = " + target4);
        int[] result4 = teste.twoSum(nums4, target4);
        System.out.println(Arrays.toString(result4));
        // Teste 5: números repetidos
        int[] nums5 = { 1, 5, 1, 5 };
        int target5 = 10;
        System.out.println("Teste 5: " + Arrays.toString(nums5) + ", target = " + target5);
        int[] result5 = teste.twoSum(nums5, target5);
        System.out.println(Arrays.toString(result5));
    }
}
