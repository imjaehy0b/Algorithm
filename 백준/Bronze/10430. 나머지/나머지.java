import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int a = (A+B)%C;
        int b = ((A%C)+(B%C))%C;
        int c = (A*B)%C;
        int d = ((A%C) * (B%C))%C;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}