class Solution {
    public void sortColors(int[] a) {
        int n=a.length;
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(a[mid]==0){
                int temp=a[mid];
                a[mid]=a[low];
                a[low]=temp;
                low++;
                mid++;
            }
            else if(a[mid]==1){
                mid++;
            }
            else{ int temp=a[mid];
                a[mid]=a[high];
                a[high]=temp;
                high--;}
        }
               for(int x:a) System.out.print(x);;
        
    }
}