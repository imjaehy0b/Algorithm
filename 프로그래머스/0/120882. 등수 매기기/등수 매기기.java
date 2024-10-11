class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] rank = new double[score.length];
        for(int i=0; i<answer.length; i++){
            answer[i] = 1;
        }
        
        for(int i=0; i<rank.length; i++){
            int[] inner = score[i];
            for(int j=0; j<inner.length; j++){
                rank[i] += inner[j];
            }
            rank[i] = (double)rank[i]/2;
        }
        
        for(int i=0; i<rank.length;i++){
            for(int j=0; j<rank.length; j++){
                if(rank[i]<rank[j] && i!=j){
                    answer[i] += 1;    
                }
            }
        }

                
        return answer;
    }
}