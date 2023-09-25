class Solution {
    public String solution(String rsp) {
        String answer = "";
        //가위 2, 바위 0, 보 5
        //문자열을 쪼개서 배열에 넣어 값을 비교해 이기는 경우를 배열에 넣어준다.
        String[] sArr = rsp.split("");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<sArr.length;i++){
            if(sArr[i].equals("2")){
                sb.append("0");
            }else if(sArr[i].equals("0")){
                sb.append("5");
            }else{
                sb.append("2");
            }
        }
        answer = sb.toString();
        return answer;
    }
}