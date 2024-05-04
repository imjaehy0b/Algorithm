import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //가로 n, 세로m 인 직사각형
        for(int i=0; i<m; i++){//세로
            for(int j=0; j<n; j++){//가로
                System.out.print("*");
            }
            System.out.println();
        }

    }
}