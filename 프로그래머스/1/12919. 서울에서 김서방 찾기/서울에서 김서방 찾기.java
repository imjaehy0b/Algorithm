class Solution {
    public String solution(String[] seoul) {
        StringBuilder sb = new StringBuilder();
        String answer = "";
        for(int i=0; i<seoul.length;i++){
            if(seoul[i].equals("Kim")){
                sb.append("김서방은 "+i+"에 있다");
            }
        }
        answer = String.valueOf(sb);
        return answer;
    }
}