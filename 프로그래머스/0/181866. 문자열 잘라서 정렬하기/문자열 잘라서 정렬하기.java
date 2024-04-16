import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        ArrayList<String> strArr = new ArrayList<>();
        for(String s : answer){
            if(!s.equals("")){
                strArr.add(s);
            }
        }
        String[] newArr = new String[strArr.size()];
        for(int i=0; i<newArr.length;i++){
            newArr[i] = strArr.get(i);
        }
        Arrays.sort(newArr);
        return newArr;
    }
}