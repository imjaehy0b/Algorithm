import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
    
    private void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[] fam = new int[3];
        for(int i=0; i<3; i++){
            fam[i] = Integer.parseInt(br.readLine());
        }
        
        
        for(int i=0; i<fam.length - 1; i++){
            int minIdx = i;
            for(int j = i+1; j<fam.length; j++){
                if(fam[j] < fam[minIdx]){
                    minIdx = j;
                }
            }
            swap(fam,i,minIdx);
        }
        
        System.out.println(fam[1]);
    }
    
    private void swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}