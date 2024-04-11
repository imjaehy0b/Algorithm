class Solution {
    public int solution(int a, int b, int c) {
        int answer =0;
        int result = a+b+c;
        
        if(a==b && b==c){
            answer = result * (a*a+b*b+c*c) * (a*a*a+b*b*b+c*c*c); 
        }else if(a==b || b==c || a==c){
            answer = result * (a*a+b*b+c*c);
        }else{
            answer = result;
        }
        
        return answer;
    }
}