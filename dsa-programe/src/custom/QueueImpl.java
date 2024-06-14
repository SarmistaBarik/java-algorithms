package custom;

public class QueueImpl {
    public static void main(String[] args) {

        Queue que = new Queue();

        que.enqueue(5);
        que.enqueue(2);
        que.enqueue(7);
        que.enqueue(3);

        que.show();

        que.dequeue();
        que.dequeue();

        que.show();

        que.enqueue(4);
        que.enqueue(6);
        que.enqueue(9);

        que.show();

        System.out.println("size :: "+que.getSize());

        System.out.println("is empty :: "+que.isEmpty());

        System.out.println("is full :: "+que.isFull());

        que.enqueue(10);


    }
}
