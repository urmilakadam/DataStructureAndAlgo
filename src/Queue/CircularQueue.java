package Queue;

public class CircularQueue {

    int []arr;
    int beginningOfQueue;
    int topOfQueue;
    int size;

    public CircularQueue(int size){
        this.arr = new int[size];
        this.size = size;
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
    }

    public boolean isFull() {
        if(topOfQueue+1 == beginningOfQueue)
            return true;
        else if (topOfQueue == size - 1 && beginningOfQueue ==0) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if(topOfQueue == -1) return true;
        return false;
    }

    public void enqueue(int value){
        if(isFull())
            throw new RuntimeException("Queue is full");
        else if(isEmpty()){
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Inserted value: "+ value + " in circular queue");
        }else{
            if(topOfQueue+1 == size)
                topOfQueue = 0;
            else topOfQueue++;

            arr[topOfQueue] = value;
            System.out.println("Inserted value: "+ value + " in circular queue");
        }
    }

    public int dequeue(){
        int result;
        if(isEmpty())
            throw new RuntimeException("Queue is empty");
        else{
            result = arr[beginningOfQueue];
            arr[beginningOfQueue] = 0;
            if(beginningOfQueue == topOfQueue){
                beginningOfQueue = -1;
                topOfQueue = -1;
            }else if(beginningOfQueue+1 ==size){
                beginningOfQueue = 0;
            }else
                beginningOfQueue++;
            System.out.println("deleted value: "+ result + " in queue");
        }
        return  result;
    }

    public int peek(){
        int result;
        if(isEmpty())
            throw new RuntimeException("Queue is empty");
        else {
            result = arr[beginningOfQueue];
            System.out.println("peek of the queue is: "+ result);
        }
        return result;
    }

    public void deleteQueue(){
        arr = null;
        System.out.println("Queue is successfully deleted");
    }

}
