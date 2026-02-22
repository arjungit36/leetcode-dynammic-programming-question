class Solution {
    public int binaryGap(int n) {
        int ans = 0;
        int prev = -1;   // index of previous '1'
        int i = 0;       // current bit position

        // skip trailing zeros to start from first '1'
        while ((n & 1) == 0) {
            i++;
            n >>= 1;
        }

        prev = i;  // first '1' found

        while (n > 0) {
            if ((n & 1) == 1) {          // found a '1'
                ans = Math.max(ans, i - prev);  
                prev = i;                
            }

            i++;       
            n >>= 1;   
        }

        return ans;
    }
}