package Tree;

public class tree {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int n){
            data = n;
            
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        System.out.println(root.data);
        System.out.println(root.left.data );
        System.out.println(root.right.data);
        System.out.println(root.left.left.data);
    }
}
