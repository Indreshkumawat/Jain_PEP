package orgs.Queue;

class Queue{
    private int []arr;
    private int front;
    private int rear;
    private int capacity;
    public Queue(int size){
        capacity = size;
        arr = new int[capacity];
        front = 0;
        rear = -1;
    }
    public void enqueue(int val){
        if(rear == capacity - 1){
            System.out.println("Queue is full");
        }
        arr[++rear] = val;
    }
    public int dequeue(){
        if(front > rear){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front++];
    }

    public int peek(){
        if(front > rear){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    public boolean isEmpty(){
        return front > rear;
    }
    public boolean isFull(){
        return rear == capacity -1;
    }
    public int size(){
        return rear - front + 1;
    }
    public void display(){
        if(front > rear){
            System.out.println("Queue is empty");
            return;
        }
        for(int  i = front;i<=rear;i++){
            System.out.println(arr[i]);
        }
    }
}
public class QueueImpl {
    public static void main(String[] args){
        Queue queue = new Queue(10);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println(queue.size());

        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
       // System.out.println(s);
        queue.display();


    }
}
