package Stack;

import java.util.Scanner;

public class Stack {
    static final int MAX_N = 100;
    static int top;
    static int[] stack = new int[MAX_N];

    static void init(){
        top = 0;
    }

    static boolean isEmpty(){
        return top == 0;
    }

    static boolean isFull(){
        return top == MAX_N;
    }

    static boolean isPush(int val){
        if (isFull()){
            return false;
        }
        stack[top] = val;
        top++;
        return true;
    }

    static Integer isPop(){
        if (isEmpty()){
            return null;
        }
        top--;
        Integer popNum = Integer.valueOf(stack[top]);
        return popNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            init();
            for (int j = 0; j < n; j++) {
                int value = sc.nextInt();
                isPush(value);
            }

            System.out.print("#" + i + " ");

            while (!isEmpty()){
                Integer value = isPop();
                if(value != null){
                    System.out.println("val"+value.intValue()+" ");
                }
                System.out.println();
            }

        }
        sc.close();
    }
}
