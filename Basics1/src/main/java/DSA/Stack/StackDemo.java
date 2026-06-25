package DSA.Stack;

class Stack{
    private int arr[];
    private int top;
    private int capacity;
    public Stack(int size){
        capacity = size;
        arr = new int[capacity];
        top = -1;
    }

    public void push(int val){
        if(top == capacity -1){
            System.out.println("stack is full !!!");
            return;
        }
        top++;
        arr[top] = val;
    }
    public int pop(){
        if(top == -1){
            System.out.println("Stack is empty add val first");
            return -1;
        }
//        int temp = arr[top];
//        top--;
//        return temp;
        return arr[top--];
    }
    public int peek(){
        if(top == -1){
            System.out.println("Stack is empty add val first");
            return -1;
        }
        return arr[top];
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == capacity -1;
    }
    public void display(){
        if(top == -1){
            System.out.println("Stack is empty already!!");
            return;
        }
        for(int i  = top;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
    public int size(){
        return top + 1;
    }
}
public class StackDemo {
    public static  void main(String[] args){
        Stack st = new Stack(10);

        st.push(19);
        st.push(20);
        st.push(23);
        st.push(27);
        st.push(29);

        System.out.println(st.peek());
//        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.size());

    }
}
