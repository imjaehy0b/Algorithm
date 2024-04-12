class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        int s = 0,e=0,i=0;
        for(int[] part : parts){
            s = part[0];
            e = part[1];

            answer += my_strings[i].substring(s,e+1);
            i++;
            
        }
        return answer;
    }
}