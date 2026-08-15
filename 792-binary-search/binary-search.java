class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
       return helper(nums ,target,0,n-1);
    }
    public  int  helper(int[] a, int ele, int lo,int hi) {
        int mid=lo +(hi -lo )/2;
        if(lo>hi) return -1;
            if (a[mid] == ele) return mid;
            else if (a[mid] > ele) return helper(a, ele, lo, mid - 1);
            else return helper(a, ele, mid + 1, hi);

    }
}