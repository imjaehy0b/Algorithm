class Solution {
    public String solution(int age) {
        String answer = "";
        String num = ""+age;
        for(int i=0; i<num.length(); i++){
            String temp = String.valueOf(num.charAt(i));
            if(temp.equals("0")){
                answer += "a";
            }else if(temp.equals("1")){
                answer += "b";
            }else if(temp.equals("2")){
                answer += "c";
            }else if(temp.equals("3")){
                answer += "d";
            }else if(temp.equals("4")){
                answer += "e";
            }else if(temp.equals("5")){
                answer += "f";
            }else if(temp.equals("6")){
                answer += "g";
            }else if(temp.equals("7")){
                answer += "h";
            }else if(temp.equals("8")){
                answer += "i";
            }else if(temp.equals("9")){
                answer += "j";
            }
        }
        return answer;
    }
}