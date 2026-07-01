package DSA.BST;

import java.util.Scanner;

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
class BST{
    static Scanner sc = new Scanner(System.in);

    static Node buildTree(Node root,int data){
        if(root == null){
            return new Node(data);
        }
        if(data > root.data){
            root.right = buildTree(root.right,data);
        }else {
            root.left = buildTree(root.left,data);
        }

        return root;
    }
    static Node insertData(Node root){

        System.out.println("Enter values for BST and type -1 to stop the insertion");

        while(true){
            int data = sc.nextInt();

            if(data == -1){
                break;
            }

            root = buildTree(root,data);
        }

        return root;
    }

    static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    static Node minVal(Node root){
        Node temp = root;

        while(temp.left != null){
            temp = temp.left;
        }
        return temp;
    }

    static Node maxVal(Node root){
        Node temp = root;

        while(temp.right != null){
            temp = temp.right;
        }
        return temp;
    }

    static Node deleteNode(Node root,int key){
        if(root == null) return null;

        if(key < root.data){
            root.left = deleteNode(root.left,key);
        }
        else if(key > root.data){
            root.right = deleteNode(root.right,key);
        }
        else {
            // NO child- leaf node
            if(root.left == null && root.right == null){
                return null;
            }

            // right Child

            if(root.left == null){
                return root.right;
            }
            // left child
            if(root.right == null){
                return root.left;
            }

            Node max = maxVal(root.left);

            root.data = max.data;;

            root.left = deleteNode(root.left,max.data);
        }

        return root;
    }


}
public class BinarySearchTree {
    public static void main(String[] args) {
        Node root = null;

        root = BST.insertData(root);

        BST.inorder(root);

        Node max = BST.maxVal(root);
        System.out.println(max.data);


    }
}




