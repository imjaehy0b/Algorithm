class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int idx=0;
        int count =0;
        for(boolean a : finished){
            if(!a){
                count++;
            }
        }
        
        String[] answer = new String[count];
        
        for(int i=0; i<todo_list.length;i++){
            if(finished[i]==false){
                answer[idx++] = todo_list[i];
            }
        }
        return answer;
    }
}