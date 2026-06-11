
class Solution {
    public int[] sortedSquares(int[] nums) {

        int ni = nums.length;
        int m = 0, n = 0;

        for (int i = 0; i < ni; i++) {
            if (nums[i] >= 0) m++;
            else n++;
        }

        int[] A = new int[m];
        int[] B = new int[n];

        int j = 0, k = 0;

        for (int i = 0; i < ni; i++) {
            if (nums[i] >= 0)
                A[j++] = nums[i];
            else
                B[k++] = nums[i];
        }

        // Square elements
        for (int i = 0; i < m; i++) {
            A[i] = A[i] * A[i];
        }

        for (int i = 0; i < n; i++) {
            B[i] = B[i] * B[i];
        }

        // Reverse B
        int left = 0, right = n - 1;
        while (left < right) {
            int temp = B[left];
            B[left] = B[right];
            B[right] = temp;
            left++;
            right--;
        }

        int[] fin = new int[m + n];

        int i = 0;
        j = 0;
        k = 0;

        // Merge
        while (i < m && j < n) {
            if (A[i] < B[j]) {
                fin[k++] = A[i++];
            } else {
                fin[k++] = B[j++];
            }
        }

        while (i < m) {
            fin[k++] = A[i++];
        }

        while (j < n) {
            fin[k++] = B[j++];
        }

        return fin;
    }
}