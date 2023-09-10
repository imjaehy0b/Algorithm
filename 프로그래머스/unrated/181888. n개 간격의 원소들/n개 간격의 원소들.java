class Solution {
    public int[] solution(int[] num_list, int n) {
        int k = 0;
        int idx = 0;
        if(num_list.length%n==0)
            k = num_list.length/n;
        else
            k = num_list.length/n+1;
        
        int[] answer = new int[k];

        
        
        for(int i=0; i<num_list.length; i+=n){
            answer[idx++] = num_list[i];
        }
        return answer;
    }
}