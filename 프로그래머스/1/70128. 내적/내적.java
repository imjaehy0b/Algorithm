class Solution {
    public int solution(int[] a, int[] b) {
        int answer = inner(a,b);
        
        return answer;
    }
    public int inner(int[] a,int[] b){
        int sum = 0;
        for(int i=0; i<a.length; i++){
            sum += a[i]*b[i];
        }
        System.out.print(sum);
        return sum;
    }
}