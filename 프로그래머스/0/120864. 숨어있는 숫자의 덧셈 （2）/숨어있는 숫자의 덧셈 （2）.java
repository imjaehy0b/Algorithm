class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String temp = my_string.toUpperCase();
        for(int i=0; i<temp.length();i++){
            if(65<=temp.charAt(i)&&temp.charAt(i)<=90){//A~Z사이라면
                temp=temp.replace(String.valueOf(temp.charAt(i))," ");
            }
        }
        if(temp.isBlank()){
            return answer;
        }
        String[] str = temp.trim().split("\\s+");
        for(String s : str){
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}