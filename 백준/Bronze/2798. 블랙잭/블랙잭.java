import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
    
    public void solution() throws Exception {  // IOException 추가
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        int[] cardInfo = new int[2];
        StringTokenizer st = new StringTokenizer(br.readLine());
        cardInfo[0] = Integer.parseInt(st.nextToken());  // 카드 수
        cardInfo[1] = Integer.parseInt(st.nextToken());  // 목표 값
        
        
        int[] cardNum = new int[cardInfo[0]];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < cardNum.length; i++) {
            cardNum[i] = Integer.parseInt(st.nextToken());
        }
        
        br.close();
        
        int close = getMaxSum(cardNum, cardInfo[1]);
        
        bw.write(String.valueOf(close));
        bw.flush();
        bw.close();
    }
    
    private int getMaxSum(int[] cards, int target) {
        int max = 0;
        
        // 3장의 카드 조합 찾기
        for(int i = 0; i < cards.length - 2; i++) {
            for(int j = i + 1; j < cards.length - 1; j++) {
                for(int k = j + 1; k < cards.length; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    
                    if(sum <= target && sum > max) {
                        max = sum;
                    }
                }
            }
        }
        
        return max;
    }
}