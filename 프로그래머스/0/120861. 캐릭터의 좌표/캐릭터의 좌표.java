class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        //경계 좌표
        int condX = (board[0]-1)/2;
        int condY = (board[1]-1)/2;

        int[][] moves = {
            {-1,0}, //left
            {1,0},  //right
            {0,-1}, //down
            {0,1},  //up
        };
        
        String[] direct = {"left","right","down","up"};
        
        for(String in : keyinput){
            int moveX = 0;
            int moveY = 0;
            
            for(int i=0; i<direct.length; i++){
                if(in.equals(direct[i])){
                    moveX = moves[i][0];
                    moveY = moves[i][1];
                    break;
                }
            }
            
            if (answer[0] + moveX >= -condX && answer[0] + moveX <= condX) {
                answer[0] += moveX;
            }
            if (answer[1] + moveY >= -condY && answer[1] + moveY <= condY) {
                answer[1] += moveY;
            }
        }
        return answer;
//         기존 코드
//         int[] answer = new int[2];
//         int condX = (board[0]-1)/2;
//         int condY = (board[1]-1)/2;
//         int x = 0;
//         int y = 0;
//         for(String s : keyinput){
//             switch(s){
//                 case "left":
//                     if(-condX<x){
//                         x -= 1;
//                     }
//                     break;
//                 case "right":
//                     if(condX>x){
//                         x += 1;
//                     }
//                     break;
//                 case "up":
//                     if(condY>y){
//                         y += 1;
//                     }
//                     break;
//                 case "down":
//                     if(-condY<y){
//                         y -= 1;
//                     }
//                     break;
//             }
//         }
//         answer[0] = x;
//         answer[1] = y;
        
//         return answer;
    }
}