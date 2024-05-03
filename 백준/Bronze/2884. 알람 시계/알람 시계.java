import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int M2,H2;
        if(M<45){
            M2 = (60-45)+M;
            if(H==0){
                H2 = 23;
            }else{
                H2 = H-1;
            }
        }else{
            H2 = H;
            M2 = M-45;
        }
        System.out.print(H2+" "+M2);
    }
}