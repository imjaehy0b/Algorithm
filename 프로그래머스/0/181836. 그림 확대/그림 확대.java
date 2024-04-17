class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        String str = "";
        int idx =0;
        for(String pic : picture){
            for(int i=0; i<pic.length(); i++){
               for(int j=0; j<k;j++){
                str += pic.charAt(i);
               }   
            }
            for(int j=0; j<k;j++){
                answer[idx++]=str;
            }
            str="";
        }
        for(String s : answer){
            System.out.println(s);
        }
        return answer;
    }
}