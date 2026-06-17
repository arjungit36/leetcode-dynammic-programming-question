class Solution {
    public void sortColors(int[] nums) {
                int n=nums.length;
       int z=0,on=0  ,tw=0;
       for(int i=0;i<n;i++){
           if(nums[i]==0)z++;
           else if(nums[i]==1)on++;
           else tw++;
       }
       int i=0;
       while(z>0){nums[i]=0;z--;i++;}
           while(on>0){nums[i]=1;on--;i++;}
               while(tw>0){nums[i]=2;tw--;i++;}

               for(int x:nums) System.out.print(x);;
        
    }
}