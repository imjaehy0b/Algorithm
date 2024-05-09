class Solution {
    public String solution(String s, int n) {
        String answer = "";
        //65~90=A~Z ,97~122=a~z
        //n만큼 한칸 밀기. 
        //각자리가 대문자인지,소문자인지,공백인지 파악
        //공백이라면 더하고 컨티뉴
        //아니라면 charAt에 +n 해주기
        //최대값이 넘어가면 65로 초기화?후에 +n
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            char temp = c;
            if(c==' '){
                answer+=" ";
                continue;
            }
            if(65<=c&&c<=90){
                temp += n;
                if(temp>90){
                    answer += (char)(c+n-26);
                }else{
                    answer += (char)(c+n);
                }
            }else{
                temp += n;
                if(temp>122){
                    answer += (char)(c+n-26);
                }else{
                    answer += (char)(c+n);
                }
            }
        }
        return answer;
    }
}