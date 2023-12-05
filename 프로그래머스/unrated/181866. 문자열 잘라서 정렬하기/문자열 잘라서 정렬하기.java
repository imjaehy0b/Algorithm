import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        ArrayList<String> result = new ArrayList<>();
        
        for(String str : answer){
            if(!str.isEmpty())
                result.add(str);
        };
        
        String[] newArr = result.toArray(new String[0]);
        Arrays.sort(newArr);

        return newArr;
    }
}