class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        // arr : 위치가 바뀌는 개체이자, 기준정보
        // queries : query 의 집합체정보 (query를 묶은 정보일 뿐)
        // query : queries에 속해져있는 인덱스 별 개체 [i , j]
        // 즉, queries 의 첫번째 인덱스인 query[i,j]의 숫자가 0, 3 이라면,
        // arr배열의 0번째 인덱스와 3번째 인덱스의 위치를 서로 바꾸라는 뜻입니다..
      
        for (int[] query : queries) {
            int one = query[0];
            int two = query[1];
            
            int temp = arr[one];
            arr[one] = arr[two];
            arr[two] = temp;
            for(int i=0; i<arr.length; i++){
                answer[i] = arr[i];
            }
        }   
        return answer;
    }
}