class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray();
        
        for(int[] query : queries){
            int start = query[0];
            int end = query[1];
            
            for(int i=start; i<end; i++){
                char temp = arr[i];
                arr[i] = arr[end];
                arr[end] = temp;
                
                end--;
            }
        }
            String answer = "";
            for(int i=0; i<arr.length; i++){
                answer += arr[i];
            }
        return answer;
    }
}