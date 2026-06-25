package orgs.Stack;

class Stack{
    int arr[];
    int top;
    int capacity;
    public Stack(int size){
        capacity = size;
        arr = new int[capacity];
        top = -1;
    }
    public void push(int val){
        if(top == capacity - 1){
            System.out.println("Stack is full !!!");
            return;
        }
        top++;
        arr[top] = val;
    }
    public int pop(){
        if(top == -1){
            System.out.println("Its already empty");
            return -1;
        }
//        int temp = arr[top];
//        top--;
//        return temp;

        return arr[top--];
    }
    public int peek(){
        if(top == -1){
            System.out.println("Its already empty");
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
    public int size(){
        return top+1;
    }
    public void display(){
        for(int i = top;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
public class StackImpl {
    public static void main(String[] args){
        Stack st = new Stack(10);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());

        System.out.println(st.size());




    }
}
