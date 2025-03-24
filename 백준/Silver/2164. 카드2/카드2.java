import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
    
    void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
         
        Deque<Integer> deque = new ArrayDeque<>();
        
        for(int i=1; i<=n; i++){
            deque.add(i);
        }
        
        while(deque.size() > 1){
            deque.removeFirst();
            if(deque.size() > 0) {
                deque.addLast(deque.removeFirst()); 
            }
        }
        
        bw.write(String.valueOf(deque.peek()));
        bw.close();
        br.close();
    }
}