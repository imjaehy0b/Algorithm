class Solution {
    public int solution(int n, int m, int k) {
        int answer = 0;
        char num = (char)(k+'0');  
        String str ="";
        for(int i=n; i<=m; i++){
            str = ""+i;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j)==num){
                    answer++;
                }
            }
            
        }
        return answer;
    }
}