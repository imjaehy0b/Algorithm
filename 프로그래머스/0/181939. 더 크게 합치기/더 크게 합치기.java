class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int add = Integer.parseInt(""+a+b);
        int add2 = Integer.parseInt(""+b+a);
        if(add>=add2){
            return add;
        }else{
            return add2;
        }
            
    
              
    
    }
}