import java.util.*;
public class Main{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++){ //줄 개수
            for(int j=0; j<n-i-1; j++){ // 공백 개수
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){ //별 개수
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}