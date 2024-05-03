class Solution {
    public String solution(String phone_number) {
        String answer = hidePhoneNumber(phone_number);
        return answer;
    }
    
    public String hidePhoneNumber(String pn){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<pn.length(); i++){
            if(pn.length()-4>i){
                sb.append("*");
            }else{
                sb.append(pn.charAt(i));
            }
        }
        return new String(sb);
    }
}