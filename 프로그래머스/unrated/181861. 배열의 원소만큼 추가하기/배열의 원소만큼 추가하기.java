class Solution {
    public int[] solution(int[] arr) {
        int len = 0;
        for(int i : arr){
            len += i;
        } 
        int[] X = new int[len];
        int idx=0;
        //arr[i]가 n이라면 n번만큼 n을 X에 대입.
        for(int i : arr){
            for(int j=0; j<i; j++){
                X[idx++] = i;
            }
        } 

        return X;
    }
}