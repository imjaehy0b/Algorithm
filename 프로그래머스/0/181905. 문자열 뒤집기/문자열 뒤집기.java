class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        for(int i=s; i<e+1; i++){
            char temp = arr[i];
            arr[i] = arr[e];
            arr[e] = temp;
            
            e--;
        }
        for(char c : arr){
            answer += c;
        }
        return answer;
    }
}