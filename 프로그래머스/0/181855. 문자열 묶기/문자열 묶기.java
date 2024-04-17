class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] arr = new int[30];
        for(String str : strArr){
            arr[str.length()-1] +=1;
        }
        for(int i=0; i<arr.length; i++){
            if(answer<=arr[i]){
                answer = arr[i];
            }
        }
        return answer;
    }
}