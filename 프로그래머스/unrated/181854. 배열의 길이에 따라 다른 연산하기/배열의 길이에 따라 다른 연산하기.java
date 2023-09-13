class Solution {
    public int[] solution(int[] arr, int n) {
        int len = arr.length;
        int[] answer = new int[len];
        
        if(len%2==1){
            for(int i=0; i<len; i+=2){
               arr[i] += n;
            }
        }else{
            for(int i=0; i<len; i+=2){
               arr[i+1] += n;
            }
        }
        
        for(int i=0; i<len; i++){
            answer[i] = arr[i];    
        }        
        
        return answer;
    }
}