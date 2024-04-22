import java.util.*;
class Solution {
    public ArrayList<String> solution(String[] quiz) {
        ArrayList<String> list = new ArrayList<>();
        
        for(int i=0; i<quiz.length;i++){
            String[] cal = quiz[i].split(" ");
            int x = Integer.parseInt(cal[0]);
            String oper = cal[1];
            int y = Integer.parseInt(cal[2]);
            int result = Integer.parseInt(cal[4]);
            int sum = 0;
            switch(oper){
                case "+":
                    sum = x+y;
                    break;
                case "-":
                    sum = x-y;
                    break;
                case "*":
                    sum = x*y;
                    break;
                case "/":
                    sum = x/y;
                    break;
            }
            if(sum==result){
                list.add("O");
            }else{
                list.add("X");
            }

        }
        return list;
    }
}