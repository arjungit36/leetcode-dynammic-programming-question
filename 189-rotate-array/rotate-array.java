class Solution {
    public void rotate(int[] a, int k) {
        int r=k;
              int n = a.length;
         r=r%n;
   reverse(a,0,n-r);
        reverse(a,n-r,n);
         reverse(a,0,n);
        
        
        // code here
        
        }
        static void reverse(int[] a, int start, int end){
        int i=start,j=end-1;
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        
        
        
    }
}