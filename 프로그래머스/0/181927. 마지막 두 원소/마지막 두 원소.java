class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        int idx = num_list.length-1;
        //idx == 마지막 index값
        //idx값이 idx-1 값보다 크면 마지막 idx 값 - 1
        //크지않다면 idx*2
        for(int i=0; i<num_list.length; i++){
            answer[i] = num_list[i];
        }
        
        if(num_list[idx]>num_list[idx-1]){
            answer[idx+1] = num_list[idx] - num_list[idx-1];  
        }else{
            answer[idx+1] = num_list[idx] * 2;
        }
        
        return answer;
    }
}