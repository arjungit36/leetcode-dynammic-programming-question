class Solution {
    public int compress(char[] chars) {
   int n = chars.length;
        StringBuilder s = new StringBuilder();

        int i = 0, j = 0, c = 0;

        while (j < n) {

            if (chars[i] == chars[j]) {
                c++;
                j++;
            } else {

                s.append(chars[i]);

                if (c > 1) {
                    s.append(c);
                }

                i = j;
                c = 0;
            }
        }

        // last group
        s.append(chars[i]);

        if (c > 1) {
            s.append(c);
        }

        String h = s.toString();

        for (int k = 0; k < h.length(); k++) {
            chars[k] = h.charAt(k);
        }

        return h.length();
    }
}