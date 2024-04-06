class Solution {
    public int solution(int angle) {
        boolean val = (0<= angle&&angle <=180);
        int answer = -1;
        
        //0~90 예각, 90 직각, 90~180 둔각, 180 평각
        if(angle<90){
            return 1;
        }else if(angle==90){
            return 2;
        }else if(angle<180){
            return 3;
        }else{
            return 4;
        }
 
    }
}