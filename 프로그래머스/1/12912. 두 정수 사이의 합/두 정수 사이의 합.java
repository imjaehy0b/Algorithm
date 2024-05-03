class Solution {
    public long solution(int a, int b) {
        long answer = sum(a,b);
        
        return answer;
    }
    
    public long sum(int a,int b){
        long sum =0;
        int temp = 0;
        if(a>b){
            temp = a;
            a = b;
            b = temp;
        }
        for(int i=a; i<=b; i++){
            sum+=i;
        }
        return sum;
    }
}