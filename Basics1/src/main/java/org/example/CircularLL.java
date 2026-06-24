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

    public static void main(String [] args){
       Node head = null;

       head = addAtStart(head,10);
        head = addAtStart(head,20);

        display(head);

        System.out.println();

        head = addAtLast(head,30);
        head = addAtLast(head,20);
        display(head);

        System.out.println();
        head = addAtPos(head,40,1);
        display(head);

    }
}
