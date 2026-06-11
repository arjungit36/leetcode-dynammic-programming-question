class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int k=0;
        int[] fin =new int[n+m];
        while(i<m && j<n ){
            if(nums1[i]<nums2[j]){
                fin[k]=nums1[i];
                k++;
                i++;
            }
            else{
                fin[k]=nums2[j];
                k++;
                j++;
            }
            
        }
        while(i<m){
            fin[k]=nums1[i];
            k++;
            i++;
        }
        while(j<n){
            fin[k]=nums2[j];
            k++;
            j++;
        }
        for(int x=0;x<m+n;x++){
            nums1[x]=fin[x];
        }
        }
        
    }
