package Queue;

public class Main
{

    public static void main(String[] args) {
        QueueArray queue = new QueueArray(10);

        queue.enqueue(23);
        queue.enqueue(12);
        queue.enqueue(45);
        queue.enqueue(18);
        queue.enqueue(20);

        queue.dequeue();
        queue.peek();

        queue.deleteQueue();


        CircularQueue circularQueue = new CircularQueue(5);
        circularQueue.enqueue(10);
        circularQueue.enqueue(20);
        circularQueue.enqueue(30);
        circularQueue.enqueue(40);
        circularQueue.enqueue(50);

        circularQueue.dequeue();

        circularQueue.enqueue(60);

        circularQueue.peek();

        circularQueue.deleteQueue();

    }
}
