import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        String rank = "";
        if(90<=score){
            rank = "A";
        }else if(80<=score){
            rank = "B";
        }else if(70<=score){
            rank = "C";
        }else if(60<=score){
            rank = "D";
        }else{
            rank = "F";
        }
        System.out.print(rank);
    }
}