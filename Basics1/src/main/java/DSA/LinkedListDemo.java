package DSA;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedListDemo {
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static Node addInStart(Node head,int data){
        Node newNode = new Node(data);
        if(head == null){
            return newNode;
        }
        newNode.next = head;
        return newNode;
    }
    public static void addAtLast(Node head,int data){
        Node newNode = new Node(data);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public static void addAtPos(Node head,int data,int pos){
        if(head == null){
            return;
        }
        Node newNode = new Node(data);
        Node curr = head;
        int count = 1;
        while(count< pos - 1 && curr != null){
            curr = curr.next;
            count++;
        }
        if(curr == null){
            return;
        }
        newNode.next = curr.next;
        curr.next = newNode;

    }
    public static Node deleteStart(Node head,int data){
        if(head == null){
           return null;
        }
        Node curr = head.next;
        head.next = null;
        head = curr;
        return head;
    }
    public static Node deleteFromLast(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }
        curr.next = null;

        return head;
    }

    public static Node deleteFromPos(Node head,int pos){
        //if head is null means empty list
        if(head == null){
            return head;
        }
        // pos is 1 or we have one element in the ll
        if(pos == 1){
            return head.next;
        }

        Node curr = head;
        int count = 1;
        while(count < pos -1 && curr != null){
            count++;
            curr = curr.next;
        }
        // if pos is larger than the number of elements
        if(curr == null){
            return head;
        }
        Node forw = curr.next;

        curr.next = forw.next;
        forw.next = null;

        return head;

    }
    public static void main(String[] args){
        Node head = null;

        head = addInStart(head,20);
        head = addInStart(head,10);
        display(head);
        addAtLast(head,30);
        addAtLast(head,40);
        addAtLast(head,50);
        display(head);
        System.out.println();
        addAtPos(head,25,20);
        display(head);

        System.out.println();
//        head = deleteStart(head,10);
//        display(head);

//        head = deleteFromLast(head);
//        display(head);
//
        head = deleteFromPos(head,10);
        display(head);

    }
}
