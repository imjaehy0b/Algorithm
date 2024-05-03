class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int sum = 0;
        int temp = x;
        //x의 자릿수의 합으로 x가 나눠져야함
        //18 => 1+8=9, 18%9==0, : 하샤드 
        while(x>0){
            sum+=x%10;
            x/=10;
        }
        if(temp%sum==0) answer = true;
        
        return answer;
    }
}