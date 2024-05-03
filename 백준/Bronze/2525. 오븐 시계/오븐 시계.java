import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int time1, time2;
        //분 => m1+m2%60 , m1+m2/60 -> +h
        time2 = (m1+m2)%60;
        time1 = h + (m1+m2)/60;
        if(time1>=24){
            time1 -= 24;
        }
        System.out.println(time1+" "+time2);
    }
}