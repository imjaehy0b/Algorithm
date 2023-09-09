class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int len1 = arr1.length;
        int len2 = arr2.length;
        int a1 = 0;
        int a2 = 0;
        
        if (len1 != len2) 
            answer = (len1 > len2) ? 1 : -1;
        else {
            for (int i = 0; i < len1; i++) {
                a1 += arr1[i];
                a2 += arr2[i];
            }
            answer = (a1 > a2) ? 1 : (a2 > a1) ? -1 : 0;
        }
        
        return answer;
    }
}