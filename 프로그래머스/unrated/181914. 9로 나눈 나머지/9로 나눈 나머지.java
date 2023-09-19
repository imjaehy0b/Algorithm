class Solution {
    public int solution(String number) {
        //정수를 9로 나눈 나머지 = 정수의 각 자리의 합%9
        StringBuilder sb = new StringBuilder();
        
        String[] arr = new String[number.length()];
        int answer = 0;
        for(int i=0;i<arr.length; i++){
            sb.append(number.charAt(i));
            arr[i] = sb.toString();
            sb.setLength(0);
            answer += Integer.parseInt(arr[i]);
        }
        
        
        return answer%9;
    }
}