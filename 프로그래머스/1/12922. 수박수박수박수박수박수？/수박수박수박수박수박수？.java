class Solution {
    public String watermelon(int n){
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=n; i++){
            if(i%2==0){
                sb.append("박");
            }else{
                sb.append("수");
            }
        }
        return new String(sb);
    }
    public String solution(int n) {
        String answer = watermelon(n);
        return answer;
    }
}