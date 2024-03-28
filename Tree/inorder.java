package Tree;
public class inorder{
    static class Node{
        int data;
        Node left;  
        Node right;
        Node(int n){
            data = n;
        }
    }

    static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }
    static void preorder(Node root){
        if(root!=null){
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }
    static void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        System.out.println("Inorder");
        inorder(root);
        System.out.println("Preorder");
        preorder(root);
        System.out.println("Postorder");
        postorder(root);
        
    }
}