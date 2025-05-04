import java.util.Arrays;

public class LongestCommonPrefix {
    // Melhor solução que encontrei, além de simples de entender, não me lembrava do método substring direito
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        int i = 0;
        while(i < first.length() && i < last.length()){
            if(first.charAt(i) == last.charAt(i)){
                i++;
            } else {
                break;
            }
        }
        return first.substring(0, i);
    }

    public static void main(String[] args) {
        LongestCommonPrefix solver = new LongestCommonPrefix();

        String[][] testCases = {
                { "flower", "flow", "flight" }, // Teste 1
                { "dog", "racecar", "car" }, // Teste 2
                { "test", "test", "test" }, // Teste 3
                { "", "abc", "abd" }, // Teste 4
                { "alone" }, // Teste 5
                { "a", "ab", "abc" }, // Teste 6
                { "pre", "prefix", "presto" } // Teste 7
        };

        for (int i = 0; i < testCases.length; i++) {
            String[] input = testCases[i];
            System.out.println("Teste " + (i + 1) + ": " + Arrays.toString(input));
            String resultado = solver.longestCommonPrefix(input);
            System.out.println("Resultado: \"" + resultado + "\"\n");
        }
    }
}
