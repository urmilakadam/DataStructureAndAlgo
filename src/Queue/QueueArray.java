package Queue;

public class QueueArray {

    int []arr;
    int beginningOfQueue;
    int topOfQueue;

    public QueueArray(int n) {
        this.arr = new int[n];
        this.beginningOfQueue = -1;
        this.topOfQueue = -1;
    }

    public boolean isFull(){
        if(topOfQueue == arr.length-1)
            return true;
        else return false;
    }

    public boolean isEmpty(){
        if(beginningOfQueue == arr.length || beginningOfQueue == -1)
            return true;
        else return false;
    }


    public void enqueue(int value){
        if(isFull())
            throw new RuntimeException("Queue is full");
        else if(isEmpty()){
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Inserted value: "+ value + " in queue");
        }else{
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Inserted value: "+ value + " in queue");
        }
    }


    public int dequeue(){
        int result;
        if(isEmpty())
            throw new RuntimeException("Queue is empty");
        else{
            result = arr[beginningOfQueue];
            beginningOfQueue++;
            if(beginningOfQueue > topOfQueue){
                beginningOfQueue = -1;
                topOfQueue = -1;
            }
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
