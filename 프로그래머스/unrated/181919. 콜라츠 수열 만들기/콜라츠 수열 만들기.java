import java.util.*;
class Solution {
    public  ArrayList<Integer> solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        //n이 짝수면 /2 n이 홀수면 3*x+1 에대해 계산한값을 배열에 저장
        while(n!=1){
            if(n%2==0){
                list.add(n);
                n /= 2;
            }else{
                list.add(n);
                n = 3*n+1;
            }
        }
        list.add(1);
        

        
        return list;
    }
}