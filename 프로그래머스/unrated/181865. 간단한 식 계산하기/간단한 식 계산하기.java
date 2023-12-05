class Solution {
    public int solution(String binomial) {
        int answer = 0;
        //a,b 정수, op +,-,*
        
        String[] val = binomial.split(" ");
        int a = Integer.parseInt(val[0]);
        String op = val[1];
        int b = Integer.parseInt(val[2]);
        
        switch(op){
            case "+":
                answer = a+b;
                break;
            case "-":
                answer = a-b;
                break;
            case "*":
                answer = a*b;
                break;
        }
   
        
        return answer;
    }
}