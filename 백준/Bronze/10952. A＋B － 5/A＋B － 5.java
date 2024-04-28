import java.util.*;
public class Main{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        boolean bool = true;
        while(bool){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a+b==0){
                bool = false;
            }else{
                System.out.println(a+b);
            }
        }
    }
}