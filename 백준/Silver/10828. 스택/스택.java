import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        
        String[] s = new String[n];
        for(int i=0; i<n; i++){
            s[i] = br.readLine();
        }
        
        for(String ss : s){
            String[] type = ss.split(" ");
            
            switch(type[0]){
                case "push":
                    stack.push(Integer.parseInt(type[1]));
                    break;
                case "top":
                    if(stack.isEmpty()){
                        bw.write("-1\n");
                    }else{
                        bw.write(stack.peek()+"\n");
                    }
                    break;
                case "size":
                    bw.write(stack.size()+"\n");
                    break;
                case "empty":
                    if(stack.isEmpty()){
                        bw.write("1\n");
                    }else{
                        bw.write("0\n");
                    }
                    break;
                case "pop":
                    if(stack.isEmpty()){
                        bw.write("-1\n");
                    }else{
                        bw.write(stack.pop()+"\n");
                    }
                    break;
            }
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
    
    
}