class Solution {
    public int solution(int[] number) {
        int answer = 0;
        //5명중 3명의 점수를 더했을때 0이면 3총사.
        //3총사가 되는 경우의 수
        //빅오 시간이 초과될 가능성 ?

        for(int i=0; i<number.length-2; i++){
            for(int j=i+1; j<number.length-1; j++){
                for(int k=j+1; k<number.length; k++){
                    if(number[i]+number[j]+number[k] == 0){
                        answer++;
                    }
                }
            }
        }
        
    
        return answer;
    }
}