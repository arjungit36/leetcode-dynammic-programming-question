class Solution {
    public int removeDuplicates(int[] nums) {
        int off=1;
        int uni =1;
        int cm=1;
        int n = nums.length;
        while(cm<n){
            if(nums[cm]==nums[cm-1]){
                cm++;
            }
            else{
                nums[off]=nums[cm];
                cm++;
                off++;
                uni++;
            }
        }return uni;
   }
}