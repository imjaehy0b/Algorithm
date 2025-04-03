class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] copy = s.split("");
        
        for(int i=0; i<answer.length; i++){
            answer[i] = -1;
        }
        
        for(int i=1; i<copy.length; i++){
            for(int j=0; j<copy.length; j++){
                if(j>=i){
                    continue;
                }
                if(copy[i].equals(copy[j])){
                    answer[i] = i-j;
                }
            }
        }
        return answer;
    }
}