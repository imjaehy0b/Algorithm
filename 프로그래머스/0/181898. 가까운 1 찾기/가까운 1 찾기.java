class Solution {
    public int solution(int[] arr, int idx) {
        int answer = -1;
        //idx보다 크면서 배열의 값이 1인 가장 작은 인덱스.
        for(int i=0; i<arr.length;i++){
            if(arr[i]==1 && i>=idx){
                answer = i;
                break;
            }
        }
        return answer;
    }
}