class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        //arr길이 홀수 = 짝수 인데스+=n, 아니라면 홀수 인덱스 +=n
        int len = arr.length;
        if(len%2!=0){
            for(int i=0; i<arr.length;i+=2){
                arr[i] +=n;
            }
        }else{
            for(int i=1; i<arr.length; i+=2){
                arr[i] +=n;
            }
        }
        return arr;
    }
}