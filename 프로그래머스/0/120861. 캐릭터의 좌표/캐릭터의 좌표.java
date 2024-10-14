class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int condX = (board[0]-1)/2;
        int condY = (board[1]-1)/2;
        int x = 0;
        int y = 0;
        for(String s : keyinput){
            switch(s){
                case "left":
                    if(-condX<x){
                        x -= 1;
                    }
                    break;
                case "right":
                    if(condX>x){
                        x += 1;
                    }
                    break;
                case "up":
                    if(condY>y){
                        y += 1;
                    }
                    break;
                case "down":
                    if(-condY<y){
                        y -= 1;
                    }
                    break;
            }
        }
        answer[0] = x;
        answer[1] = y;
        
        return answer;
    }
}