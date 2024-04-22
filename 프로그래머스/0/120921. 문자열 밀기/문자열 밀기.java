class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        int count = 0;
        String str = A;
        for(int i=0; i<A.length(); i++){
            if(str.equals(B)){
                return count;
            }
            str = str.charAt(A.length()-1) + str.substring(0,A.length()-1);
            count++;
        }
        
        return answer;
    }
}