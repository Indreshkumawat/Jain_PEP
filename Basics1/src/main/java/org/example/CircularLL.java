package org.example;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class CircularLL {
    public static void display(Node head){
        if(head == null){
            System.out.println("list is empty add some thing first");
            return;
        }

        Node temp = head;
        do{
            System.out.println(temp.data);
            temp = temp.next;
        } while(temp != head);
    }

    public static Node addAtStart(Node head,int data){

        Node newNode = new Node(data);

        if(head == null){
            newNode.next = newNode;
            return newNode;
        }

        Node temp = head;

        while(temp.next != head){
            temp = temp.next;
        }

        newNode.next = head;
        temp.next = newNode;

        return newNode;
    }

    public static Node addAtLast(Node head,int data){

        Node newNode = new Node(data);

        if(head == null){
            newNode.next = newNode;
            return newNode;
        }
        Node temp = head;

        while(temp.next != head){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;

        return head;

    }

    public static Node addAtPos(Node head,int data,int pos){
        Node newNode = new Node(data);
        if(pos == 1){
           head = addAtStart(head,data);
           return head;
        }

        int count = 1;
        Node temp = head;
        while(count < pos -1 ){
            temp = temp.next;
            count++;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    public static Node deleteFromBeginning(Node head){

        if(head == null || head.next == head){
            return null;
        }
        Node temp = head;
        Node curr = head;

        while(temp.next != head){
            temp = temp.next;
        }
        temp.next = head.next;
        head = head.next;
        curr.next = null;

        return head;
    }

    public static Node deleteFromLast(Node head){
        if(head == null || head.next == head){
            return null;
        }

        Node temp = head;

        while(temp.next.next != head){
            temp = temp.next;
        }
        temp.next = head;
        return head;
    }

    public static Node deleteFromPos(Node head,int pos){
        if(head == null){
            return null;
        }
        if(pos == 1){
            return deleteFromBeginning(head);
        }
        Node temp = head;
        int count = 1;
        while(count < pos -1 && temp.next != head){
            temp = temp.next;
            count++;
        }
        if(temp.next == head){
            return head;
        }
        temp.next = temp.next.next;

        return head;
    }


    public static void main(String [] args){
       Node head = null;

       head = addAtStart(head,10);
//        head = addAtStart(head,20);
//
//        display(head);
//
//        System.out.println();
//
//        head = addAtLast(head,30);
//        head = addAtLast(head,20);
//        display(head);
//
//        System.out.println();
//        head = addAtPos(head,40,1);
//        display(head);

        System.out.println();
//        head = deleteFromBeginning(head);
//        display(head);

//        head = deleteFromLast(head);
//        display(head);
        head = deleteFromPos(head,1);
        display(head);

    }
}
