class Solution {
    class Pair{
        int idx;
        int sc;
        public Pair(int i, int s){
            this.idx = i;
            this.sc = s;
        }
    }
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> b.sc - a.sc);
        for(int i = 0; i < score.length; i++){
            Pair p = new Pair(i,score[i]);
            pq.add(p);
        }
        String[] ans = new String[score.length];
        int curr = 1;
        while(pq.size() > 0){
            Pair p = pq.remove();
            if(curr == 1){
                ans[p.idx] = "Gold Medal";
            }
            else if (curr == 2){
                ans[p.idx] = "Silver Medal";
            }
            else if(curr == 3){
                ans[p.idx] = "Bronze Medal";
            }
            else{
                ans[p.idx] = String.valueOf(curr);
            }
             curr++;
        }
        return ans;
    }
}