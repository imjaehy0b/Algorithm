class Solution {
    public int[] solution(int[] arr) {
        //원소값이 50이상인 짝수 = /2 작은 홀수 =*2
        for(int i=0; i<arr.length;i++){
            if(arr[i]>=50){
                if(arr[i]%2==0){
                    arr[i] /= 2;
                }
            }else{
                if(arr[i]%2!=0){
                    arr[i] *= 2;
                }
            }
        }
        return arr;
    }
}