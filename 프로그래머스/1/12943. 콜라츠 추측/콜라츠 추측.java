class Solution {
    public int solution(int num) {
        int answer = Collatz(num);
        return answer;
    }
    
    public int Collatz(long num){
        int result = 0;
        int count = 500;
        for(int i=0; i<500; i++){
            if(num==1){
                break;
            }
            if(num%2==0){
                num/=2;
                result+=1;
            }else{
                num*=3;
                num+=1;
                result+=1;
            }
            if(i==499){
                result = -1;
                break;
            }
        }
        return result;
    }
}