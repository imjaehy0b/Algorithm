class Solution {
    public int solution(int[] num_list) {
        int count = 0;
        
        //num_list에서 값을 꺼내 홀,짝 구분
        //짝수 = /2 , 홀수= -1 후에 /2
        //계산시 count +1;
        for(int num : num_list){
            while(num!=1){
                if(num%2==0){
                    num /= 2;
                    count++;
                }else{
                    num = (num-1)/2;
                    count++;
                }
            }
        }
        
        return count;
    }
}