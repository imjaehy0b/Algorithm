class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        //queries = [ [s,e] [query] [query] [query] ]
        //queries = 0, 1 ,2, 3
        //query = 0,1 ,1,1 2,1, 3,1
        //query의 크기는 queries의 크기와 같고 query의 크기는 0과 1로 반복
        //arr의 크기만큼 반복, 만약 i가 s와 e사이에 있는 값이라면 +1
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<queries.length;j++){
                if(queries[j][0] <= i && i <= queries[j][1]){
                    arr[i] += 1;
                }
            }
            answer[i] = arr[i];
        }
        
        
        
        
        return answer;
    }
}