class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if (n == 0) return 0;

        int maxHeight = height[0];
        int index = 0;
        int water = 0;

        // Find the index of the tallest bar
        for (int i = 1; i < n; i++) {
            if (height[i] > maxHeight) {
                maxHeight = height[i];
                index = i;
            }
        }

        // Calculate water on the left side of the tallest bar
        int leftMax = height[0];
        for (int i = 1; i < index; i++) {
            if (height[i] < leftMax) {
                water += leftMax - height[i];
            } else {
                leftMax = height[i];
            }
        }

        // Calculate water on the right side of the tallest bar
        int rightMax = height[n - 1];
        for (int i = n - 2; i > index; i--) {
            if (height[i] < rightMax) {
                water += rightMax - height[i];
            } else {
                rightMax = height[i];
            }
        }

        return water;
    }
}
