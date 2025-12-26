class Solution {
    public int bestClosingTime(String customers) {
        int penalty = 0; int n = customers.length();
        for(int i=0; i<n; i++){
            if(customers.charAt(i) == 'Y') penalty++;
        }
        int minPenalty = penalty;
        int bestHour = 0;
        for(int j=1; j<=n; j++){
            if(customers.charAt(j-1) == 'Y'){
                penalty--;
            } else {
                penalty++;
            }
            if(penalty < minPenalty){
                minPenalty = penalty;
                bestHour = j;
            }
        }
        return bestHour;
    }
}