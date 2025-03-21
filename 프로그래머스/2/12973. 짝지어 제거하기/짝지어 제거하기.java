class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        char[] stack = new char[s.length()];
        int top = -1;
        
        for(int i=0; i<s.length(); i++){
            char current = s.charAt(i);
            if(top >= 0 && stack[top] == current){
                top--;
            }else{
                stack[++top] = current;
            }
        }
        
        if(top == -1){
            answer = 1;
        }
        return answer;
    }
}