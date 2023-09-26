class Solution {
    public int solution(int num) {
        int answer = 0;
        answer = result(num);
        return answer;
    }
    
    public static int result(int num){
        int number = 0;
        
        //짝수는 /2
        //홀수는 *3 후 +1
        //값이 1이 될떄까지 반복하고 반복횟수를 카운트한다.
        //몇 번 반복해야 할지 모르니 while을  사용
        //입력값 홀,짝 판단하여 조건처리
        //조건 처리된 값을 다시 대입해 반복
        if(num==1)
            number = 0;
        
        while(num!=1){
            if(num%2==0){
                num /= 2;
                number++;
            }else{
                num = (num*3)+1;
                number++;
            }
            if(number==500 || num < 0){
                number = -1;
                break;
            }
        }

        return number;
    }
}