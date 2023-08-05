class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String l1 ="";
        String l2 ="";
        
        for(int i=0; i<num_list.length;i++){
            if(num_list[i]%2==1){
                l1 += String.valueOf(num_list[i]);
            }else{
                l2 += String.valueOf(num_list[i]);
            }
        }
        answer = Integer.parseInt(l1)+Integer.parseInt(l2);
        return answer;
    }
}