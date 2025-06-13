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
        int[] charge = new int[cnt];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<cnt; i++){
            charge[i] = Integer.parseInt(st.nextToken());    
        }
        
        System.out.print(compareYM(charge, sb));
    }
    
    private StringBuilder compareYM(int[] charge, StringBuilder sb){
        int youngSik = 0;
        int minSik = 0;
        
        for(int i=0; i<charge.length; i++){
            int payY = paymentY(charge[i]);
            int payM = paymentM(charge[i]);
            
            youngSik += payY;
            minSik += payM;
        }
        
        if(youngSik < minSik){
            sb.append("Y "+youngSik);
        }else if(youngSik > minSik){
            sb.append("M "+minSik);
        }else{
            sb.append("Y M "+youngSik);
        }
        
        return sb;
    }
    
    private int paymentY(int charge){
        return ((charge / 30) + 1) * 10;
    }
    private int paymentM(int charge){
        return ((charge / 60) + 1) * 15;
    }
}