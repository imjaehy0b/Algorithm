class Solution {
    public int solution(int n) {
        int answer = 0;
        // 1,000,000이니 n^2으로는 불가능. O(n log n) or O(n) 으로
        
        //n을 2진법으로 변경해서 1의 개수를 저장해두고 
        //n+1을 2진법으로 변경해서 1의 개수를 비교하여 일치하면 return.
        String binary = Integer.toBinaryString(n);
        int oneCnt = 0;
        for(int i=0; i<binary.length(); i++){
            if(binary.charAt(i) - '0' == 1){
                oneCnt++;
            }
        }
        int nextNumber = n+1;
        while(true){
            int cnt = 0;
            String nextBinary = Integer.toBinaryString(nextNumber);
            for(int i=0; i<nextBinary.length(); i++){
                if(nextBinary.charAt(i) - '0' == 1){
                    cnt++;
                }
            }
            if(oneCnt == cnt){
                answer = nextNumber;
                break;
            }
            nextNumber++;
        }
        

        return answer;
    }
}