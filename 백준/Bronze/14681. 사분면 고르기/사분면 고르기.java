import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        //+,+ 1, -,+ 2, -,- 3, +,- 4
        if(x>0 && 0<y){
            System.out.print(1);
        }else if(x<0 && 0<y){
            System.out.print(2);          
        }else if(x<0 && 0>y){
            System.out.print(3);            
        }else if(x>0 && 0>y){
            System.out.print(4);            
        }
    }
}