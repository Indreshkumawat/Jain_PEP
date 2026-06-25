package DSA.Queue;

class CircularQueue{
    private int []arr;
    private int front;
    private int rear;
    private int capacity;
    public CircularQueue(int size){
        capacity = size;
        arr = new int[capacity];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty(){
        return front == -1;
    }
    public boolean isFull(){
        return (rear + 1)%capacity == front;
    }
    public void enqueue(int val){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if(isEmpty()){
            front = rear = 0;
        }else{
            rear = (rear + 1)% capacity;
        }
        arr[rear] = val;
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Is empty");
            return -1;
        }

        int val = arr[front];

        if(front == rear){
            front = rear = -1;
        }else{
            front = (front + 1)%capacity;
        }
        return val;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Empty");
            return -1;
        }
        return arr[front];
    }
    public int size(){
        if(isEmpty()){
            return 0;
        }
        return (rear - front + capacity)%capacity + 1;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("empty");
            return;
        }

        int i = front;
        while(true){
            System.out.println(arr[i]);

            if(i == rear){
                break;
            }

            i = (i+1)%capacity;
        }

    }
}
public class CircularQueueDemo {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(10);

        queue.enqueue(12);
        queue.enqueue(13);
        queue.enqueue(14);
        queue.enqueue(15);
        queue.enqueue(16);
        System.out.println(queue.peek());
        System.out.println(queue.size());
        System.out.println(queue.dequeue());
        System.out.println(queue.size());
    }
}
