package practice.DSA.SortCharInWord;

import java.util.Vector;

public class Solution {
    
    Vector<Integer> CH = new Vector<>(26); // uppercase counts
    Vector<Integer> ch = new Vector<>(26); // lowercase counts

    // Constructor to initialize with zeros
    public Solution() {
        for (int i = 0; i < 26; i++) {
            CH.add(0);
            ch.add(0);
        }
    }

    public String caseSort(String s) {
        // Count frequencies
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            if (c >= 'A' && c <= 'Z') {
                CH.set(c - 'A', CH.get(c - 'A') + 1);
            } else if (c >= 'a' && c <= 'z') {
                ch.set(c - 'a', ch.get(c - 'a') + 1);
            }
        }

        // Build result string
        StringBuilder str = new StringBuilder();
        for (int j = 0; j < 26; j++) {
            int upperCount = CH.get(j);
            int lowerCount = ch.get(j);

            // Append uppercase first
            while (upperCount-- > 0) {
                str.append((char)(j + 'A'));
            }
            // Then lowercase
            while (lowerCount-- > 0) {
                str.append((char)(j + 'a'));
            }
        }

        return str.toString();
    }

    // For testing
    public static void main(String[] args) {
        Solution sol = new Solution();
        String input = "dcbaDCBA";
        System.out.println("Input: " + input);
        System.out.println("Output: " + sol.caseSort(input));
    }
}
