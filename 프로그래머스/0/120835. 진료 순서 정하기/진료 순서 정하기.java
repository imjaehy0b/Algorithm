class Solution {
    public int[] solution(int[] em) {
        int[] answer = new int[em.length];
    
        for(int i=0; i<answer.length;i++){
            for(int j=0; j<answer.length; j++){
                if(em[i] > em[j]){
                    
                }else{
                    answer[i] += 1;
                } 
                //3>3 +1 
                //3>76 +1
                //3>24 +1
                
                //76 >3  
                //76 >76 +1
                //76 >24  
                
                //24 >3  
                //24 >76  +1 
                //24 >24  +1
            }
        }
        return answer;
    }
}