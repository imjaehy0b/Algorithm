class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str = ""+num;
        answer = str.indexOf(String.valueOf(k))!=-1 ? str.indexOf(String.valueOf(k))+1 : str.indexOf(String.valueOf(k));
        return answer;
    }
}