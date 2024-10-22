package Queue;

public class Queue {

    static final int MAX_N = 100;

    static int front;
    static int rear;
    static int[] queue = new int[MAX_N];

    public static void init(){
        front = 0;
        rear = 0;
    }

    static boolean isEmpty(){
        return front == rear;
    }



    public static void main(String[] args) {

    }
}
