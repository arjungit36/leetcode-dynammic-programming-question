class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int max_diff =Integer.MAX_VALUE;
        int  diff = 0;
        int n = nums.length;
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];
        int left, right, sum = 0;
        for (int i = 0; i < n - 2; i++) {
            left = i + 1;
            right = n - 1;
            while (left < right) {
                sum = nums[i] + nums[left] + nums[right];
                diff = Math.abs(sum - target);
                if (diff < max_diff) {
                    max_diff = diff;
                    result = sum;
                }

                if (sum == target) {
                    return target;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}

