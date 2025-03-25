class Solution {
    public String solution(int[] food) {
        String answer = "";
        //[1, 3, 4, 6] 주어진 음식들을 대칭으로 배열에 대입하는문제
        //0번 - 1개 , 1번 - 3개, 2번 - 4개, 3번 - 6개.
        //1번은 짝이안맞으니 1개가 버려진다.
        for(int i=1; i<food.length; i++){
            int n = food[i]/2;
            for(int j=0; j<n; j++){
                answer += i+"";
            }
        }
        answer += 0+"";
        for(int i=food.length-1; i>0; i--){
            int n = food[i]/2;
            for(int j=0; j<n; j++){
                answer += i+"";
            }
        }
        return answer;
    }
}