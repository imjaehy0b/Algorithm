class Solution {
    public int[] solution(int[] arr) {
        int pow = 1;
        for(int i=0; i<arr.length; i++){
            if(pow<=i){
                pow *=2;
            }
        }
        int[] answer = new int[pow];
        for(int j=0;j<arr.length;j++){
            answer[j] = arr[j];
        }
        
        return answer;
    }
}