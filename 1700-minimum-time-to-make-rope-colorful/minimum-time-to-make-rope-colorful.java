class Solution {
    public int minCost(String colors, int[] neededTime) {
        int res=0;
        int prev=0;
        int curr=1;

        while(curr<colors.length()){
            if(colors.charAt(prev)==colors.charAt(curr)){  // same color ballon in row
                if(neededTime[prev]<=neededTime[curr]){ // if last ballon need less time
                    res+=neededTime[prev];   
                    prev=curr;
                }else{   // if current ballon need less time
                    res+=neededTime[curr];
                }
            }else{       // not previous ballon is same color 
                prev=curr;
            }
            curr++;
        }
        return res;
    }
}