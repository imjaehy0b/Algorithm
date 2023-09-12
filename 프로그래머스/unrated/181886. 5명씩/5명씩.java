class Solution {
    public String[] solution(String[] names) {
        int index = 0;
        if(names.length%5==0){
            index = names.length/5;
        }else{
            index =names.length/5+1;
        }
        
        String[] answer = new String[index];
        int idx = 0;
        for(int i=0; i<names.length; i++){
            if(i==0 || i%5==0){
                answer[idx++] = names[i];
            }
        }
        
        return answer;
    }
}