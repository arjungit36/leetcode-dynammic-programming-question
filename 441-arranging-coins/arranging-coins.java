class Solution {
    public int arrangeCoins(int n){
        int j=0;
        for(int i=1;i<=n;i++){
            n=n-i;
            j++;
        }return j;
        
    }
}