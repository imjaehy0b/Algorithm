class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        //알파벳     spell, 
        //외계어 사전 dic
        //spell에 담긴 알파벳을 한번씩만 모두 사용한 단어가 dic에 존재한다면 1, 존재하지 않는다면 2
        //s[i] 의값과 dic[j]의
        int cnt = 0;
        for(int i=0; i<dic.length; i++){
            for(int j=0; j<spell.length; j++){
                if(dic[i].contains(spell[j])){
                    cnt++;
                }
            }
            if(cnt==spell.length){
                answer=1;
            }else{
                cnt=0;
            }
        }
        return answer;
    }
}