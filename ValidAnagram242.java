import java.util.Arrays;

public class ValidAnagram242 {
    // Solução que fiz
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sortTeste1 = s.toCharArray();
        char[] sortTeste2 = t.toCharArray();
        Arrays.sort(sortTeste1);
        Arrays.sort(sortTeste2);
        if (new String(sortTeste1).equals(new String(sortTeste2))) {
            return true;
        }
        return false;
    }

    // Solução que achei na internet
    /*
     * public class Solution {
     * public boolean isAnagram(String s, String t) {
     * int[] alphabet = new int[26];
     * for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
     * for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
     * for (int i : alphabet) if (i != 0) return false;
     * return true;
     * }
     * }
     */
    public static void main(String[] args) {
        ValidAnagram242 sol = new ValidAnagram242();

        // Casos de teste
        System.out.println(sol.isAnagram("anagram", "nagaram")); // true
        System.out.println(sol.isAnagram("rat", "car")); // false
        System.out.println(sol.isAnagram("a", "a")); // true
        System.out.println(sol.isAnagram("ab", "ba")); // true
        System.out.println(sol.isAnagram("hello", "bello")); // false
    }
}
