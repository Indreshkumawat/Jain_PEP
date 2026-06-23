package orgs;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedList {
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static Node addInStart(Node head, int data){
        Node newNode = new Node(data);
        if(head == null){
            return newNode;
        }
        newNode.next = head;
        return newNode;
    }
    public static void addAtLast(Node head, int data){
        Node newNode = new Node(data);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public static void addAtPos(Node head,int pos,int data){
        Node newNode = new Node(data);
        Node curr = head;
        int count = 1;
        while(count < pos -1){
            curr = curr.next;
            count++;
        }
        newNode.next = curr.next;
        curr.next = newNode;

    }
    public static Node removeStart(Node head){
        if(head == null){
            return null;
        }
        Node curr = head;
        head = curr.next;
        curr.next = null;
        return head;
    }
    public static void removeLast(Node head){
        if(head == null || head.next == null){
            return;
        }
        Node curr = head;

        while(curr.next.next != null){
            curr = curr.next;
        }
        curr.next = null;
    }
    public static Node removePos(Node head,int pos){
        if(head == null){
            return null;
        }

        Node curr = head;

        if(pos == 1){
            head = curr.next;
            curr.next = null;
            return head;
        }
        int count = 1;
        while(count < pos -1 && curr != null){
            curr = curr.next;
            count++;
        }
        if(curr == null){
            return head;
        }
        Node forw = curr.next;
        curr.next = curr.next.next;
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
        addAtPos(head,4,35);
        display(head);

//        System.out.println();
//       head = removeStart(head);
//        display(head);

        System.out.println();

//        removeLast(head);
//        display(head);

        head = removePos(head,1);
        display(head);


    }
}
