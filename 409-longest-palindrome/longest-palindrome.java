class Solution {
    public int longestPalindrome(String s) {
        int[] lower = new int[26];
        int[] upper = new int[26];

        // Count frequencies
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                lower[c - 'a']++;
            } else {
                upper[c - 'A']++;
            }
        }

        int count = 0;
        int odd = 0;

        // Count lowercase characters
        for (int i = 0; i < 26; i++) {
            if (lower[i] % 2 == 0)
                count += lower[i];
            else {
                count += lower[i] - 1;
                odd = 1;
            }
        }

        // Count uppercase characters
        for (int i = 0; i < 26; i++) {
            if (upper[i] % 2 == 0)
                count += upper[i];
            else {
                count += upper[i] - 1;
                odd = 1;
            }
        }

        return count + odd; // one odd center allowed
    }
}
