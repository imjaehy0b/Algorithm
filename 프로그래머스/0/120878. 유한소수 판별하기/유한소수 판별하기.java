class Solution {
    public int solution(int a, int b) {
        int answer = b/gcd(a,b);
        
        while(answer > 1){
            if(answer%2==0){
                answer/=2;
            }else if(answer%5==0){
                answer/=5;
            }else{
                return 2;
            }
        }
        
        return answer;
    }
    
    public int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        
        return a;
    }
}
