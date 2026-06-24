package DSA.LL;
class Node{
    int data;
    Node next;
    Node prev;
    public Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class DoublyLL {
    public static void traverseForw(Node head){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void traverseBack(Node head){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        while(temp != null){
            System.out.println(temp.data);
            temp = temp.prev;
        }

    }
    public static Node addAtStart(Node head,int data){
        Node newNode = new Node(data);

        if(head == null){
            return newNode;
        }
        newNode.next = head;
        head.prev = newNode;

        return newNode;
    }
    public static Node addAtLast(Node head,int data){
        Node newNode = new Node(data);
        if(head == null){
            return newNode;
        }
        Node temp = head;
        while(temp.next != null){
           temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        return head;
    }

    public static Node addAtPos(Node head,int data,int pos){
        Node newNode = new Node(data);
        if(pos == 1){
            return addAtStart(head,data);

        }
        int count = 1;
        Node temp = head;
        while(count < pos -1 && temp != null){
            temp = temp.next;
            count++;
        }

        if(temp == null){
            return head;
        }
        newNode.next = temp.next;
        newNode.prev = temp;

        if(temp.next != null){
            temp.next.prev = newNode;
        }

        temp.next = newNode;

        return head;
    }
    public static void main(String[] args){
        Node head = null;

        traverseForw(head);
        System.out.println();
        traverseBack(head);

        head = addAtStart(head,10);
        traverseForw(head);

        System.out.println();

        head = addAtStart(head,5);
        traverseForw(head);

        System.out.println();
        head = addAtLast(head,20);
        traverseForw(head);
        System.out.println();
        traverseBack(head);


        System.out.println();
        head = addAtPos(head,12,20);

        traverseForw(head);








    }
}
