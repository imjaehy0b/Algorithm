import java.util.*;
class Solution {
    public String[] solution(String[] str_list) {
        ArrayList<String> list = new ArrayList<>();
        //l이 먼저 나오면 l의 인덱스까지를 담는다.
        //r이 먼저 나오면 r부터 마지막 인덱스 까지를 담는다.
        //둘다 없다면 빈 배열 출력
        for(int i=0; i<str_list.length;i++){
            if(str_list[i].equals("l")){
                //list에 l번째까지 값을 대입하고 종료
                for(int j=0; j<i; j++){
                    list.add(str_list[j]);
                }
                break;
            }else if(str_list[i].equals("r")){
                //list에 r이후 값을 대입하고 종료
                for(int j=i+1; j<str_list.length; j++){
                    list.add(str_list[j]);
                    System.out.print(j);
                }
                break;
            }
            
        }
        String[] answer = new String[list.size()];
        int idx = 0;
        for(int i=0; i<answer.length;i++){
            answer[idx++] = list.get(i);
        }
        return answer;
    }
}