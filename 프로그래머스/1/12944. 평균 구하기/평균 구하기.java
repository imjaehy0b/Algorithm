class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        for(int n : arr){
            sum += n;
        }
        answer = (double)sum/arr.length;
        return answer;
    }
}