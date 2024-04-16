import java.util.*;
class Solution {
    public ArrayList<String> solution(String[] str_list) {
        ArrayList<String> arr = new ArrayList<>();
        //u,d,l,r
        //l이라면 왼쪽 문자열
        //r이라면 오른쪽 문자열
        for(int i=0; i<str_list.length;i++){
            if(str_list[i].equals("l")){
               for(int j=0; j<i; j++){
                   arr.add(str_list[j]);
               }
               break;
            }
            if(str_list[i].equals("r")){
                for(int j=i+1; j<str_list.length; j++){
                    arr.add(str_list[j]);
                }
                break;
            }
        }
        
        
        return arr;
    }
}