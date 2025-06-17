import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
    
    private void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int cnt = Integer.parseInt(br.readLine());
        
        for(int i=0; i<cnt; i++){
            String str = br.readLine();
            Stack<Character> stack = new Stack<>();
            boolean isValid = true;
            
            for(int j=0; j<str.length(); j++){
                char ch = str.charAt(j);
                
                if(ch == '(') stack.push(ch);
                
                if(ch == ')'){
                    if(!stack.isEmpty()){
                        stack.pop();
                    }else{
                        isValid = false;
                        break;   
                    }
                }
            }
            
            if(stack.isEmpty() && isValid){
				sb.append("YES\n");
			}else{
				sb.append("NO\n");
			}
        }
        
        System.out.print(sb);
    }
}