package Trees;

public class implement {

    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }

    public static int sum(Node root){
        if(root==null) return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
    public static void display(Node root){
        if(root==null) return;
        System.out.println(root.val);
        display(root.left);
        display(root.right);
    }

    public static int maxVal(Node root){
        if(root==null) return 0;
        int l = maxVal(root.left);
        int r = maxVal(root.right);

        return Math.max(l,Math.max(root.val,r));
    }
    static int siize = 0;
    public static void size(Node root){
        if (root==null) return ;
        siize++;
        size(root.left);
        size(root.right);
    }

    public static int levels(Node root){
        if(root==null) return 0;
        return 1 + Math.max( levels(root.left),levels(root.right));
    }


    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(11);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        display(a);
        System.out.println("sum : "+sum(a));
        System.out.println("Max val :"+maxVal(a));
        size(a);
        System.out.println("size :"+siize);
        System.out.println("levels :"+levels(a));
    }
}
