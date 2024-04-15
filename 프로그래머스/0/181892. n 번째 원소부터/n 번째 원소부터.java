class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length-n+1];
        int idx=0;
        //n=2 라면 2번째 원소부터 저장해야하는데 idx는 0부터 시작이니 
        //idx가 1부터 마지막까지 저장해야함. 
        for(int i=n; i<=num_list.length;i++){
            answer[idx++] = num_list[i-1];
        }
        return answer;
    }
}