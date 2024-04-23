class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str = ""+num;
        String val = ""+k;
        if(str.indexOf(val)!= -1){
            answer = str.indexOf(val) +1;
        }else{
            answer = str.indexOf(val);
        }
        return answer;
    }
}