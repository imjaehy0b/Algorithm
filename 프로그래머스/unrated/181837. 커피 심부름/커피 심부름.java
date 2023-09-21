class Solution {
    public int solution(String[] order) {
        int answer = 0;
        int ame = 0;
        int latte = 0;
        //아메 = 4.5, 라떼 5.0 , 아무거나 = 4.5
        //각각의 메뉴를 카운트해서 가격을 계산
        for(String s : order){
            if(s.contains("americano") || s.contains("anything")){
                ame += 4500;
            }else{
                latte += 5000;
            }
        }
        answer = ame+latte;
        return answer;
    }
}