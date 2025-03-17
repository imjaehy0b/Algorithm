class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ", -1);
        
        for(int i=0; i<arr.length; i++){
            if(arr[i].length() > 0) {
                arr[i] = arr[i].toLowerCase();    
                if('a' <= arr[i].charAt(0) && arr[i].charAt(0) <= 'z'){
                    arr[i] = Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1);
                }
            }
        }
        
        answer = String.join(" ", arr);
        
        return answer;
    }
}