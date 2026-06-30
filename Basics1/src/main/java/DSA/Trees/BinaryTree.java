package DSA.Trees;

import java.util.ArrayList;
import java.util.List;

class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
public class BinaryTree {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(2);
        Node n4 = new Node(2);
        Node n5 = new Node(2);
        Node n6 = new Node(2);

        n1.left = n2;
        n1.right = n3;

        n2.left = n4;
        n2.right  = n5;

        n3.right = n6;

        if(n1.right != null){
            System.out.println("yes;");
        }

        List<Integer> arr = new ArrayList<>();

        arr.add(2);
        arr.add(3);
        arr.remove(0);
        System.out.println(arr.get(0));

        for(int i : arr){
            System.out.println(i);
        }
        for(int i = 0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }

    }
}
