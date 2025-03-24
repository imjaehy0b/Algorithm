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
        
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i=1; i<=n; i++){
            queue.offer(i);
        }
        
        int[] drop = new int[n];
        
        for(int i=0; i<n; i++){
            drop[i] = queue.poll();
         
            if(!queue.isEmpty()) {
                queue.offer(queue.poll());
            }
        }
        
        for(int i=0; i<drop.length; i++){
            bw.write(drop[i]+"");
            if (i < drop.length - 1) {
                bw.write(" ");
            }
        }
        bw.flush();
        bw.close();
        br.close();
        
    }
}