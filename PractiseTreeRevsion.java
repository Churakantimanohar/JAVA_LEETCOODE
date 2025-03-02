
import java.util.LinkedList;
import java.util.Queue;
public class PractiseTreeRevsion {
   public static  class Node{
    
        int val;
        Node left;
        Node right;

        public Node(int  val) {
            //TODO Auto-generated constructor stub
            this.val = val;

        }
        }
    
       public static void display(Node root){
        if(root == null) return;
        System.out.print(root.val + " ->");
        if(root.left != null){System.out.print(root.left.val + "  , ");}else{ System.out.print("null ");}
        if(root.right != null){System.out.println(root.right.val+ "  ");} else{System.out.println(" null");}
        display(root.left);
        display(root.right);
       }

       public static int max(Node root){
        if(root == null) return 0;// Integer.MIN_VALUE;for negative and positive values
        return Math.max(root.val,Math.max(max(root.left),max(root.right)) );

       }
       public static int min(Node root) {
        if (root == null) {
            return Integer.MAX_VALUE; // Return the maximum value so it won't affect the minimum
        }
        return Math.min(root.val, Math.min(min(root.left), min(root.right)));
    }
       public static int heigth(Node root){
        if(root == null ) return 0;
   //     if(root.left == null && root.right == null) return 0;
        return 1+ Math.max(heigth(root.left), heigth(root.right));
       }
       public static int product(Node root) {
        if (root == null) {
            return 1; // Base case: Return 1 for null nodes
        }
        // Multiply the current node's value with the products of the left and right subtrees
        return root.val * product(root.left) * product(root.right);
    }
       public static void nthlevel(Node root, int n){
        if(root == null ) return;
        
        if(n == 1) System.out.print(root.val+" ");
        nthlevel(root.left, n-1);
        nthlevel(root.right, n-1);
    }
       public static void bfs(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root != null) q.add(root);
        while(q.size() > 0){
            Node temp = q.peek();
            if(temp.left != null) q.add(root.left);
            if(temp.right != null) q.add(root.right);
            System.out.println(temp.val+" ");
            q.remove();
        
        }
    }
       public static int  diameter(Node root){
        if (root == null) return 0;
        int leftans = diameter(root.left); // Diameter of left and right subtrees
        int rightans = diameter(root.right);
        int rootone= heigth(root.left) + heigth(root.right);// Diameter passing through the root
        if(root.left != null ) return rootone++;
        if(root.right != null ) return rootone++;

        return   Math.max(rootone, Math.max(leftans, rightans));
    }
       public static int height(Node root){
    if (root==null || (root.left==null && root.right==null))
    return 0;              
    return 1 +  Math.max(height(root.left), height(root.right));
    }
       public static boolean isBalanhced(Node root) {
    if(root==null) return true;
    int lh = height(root.left);
    if(root.left!=null) lh++;
    int rh = height(root.right);
    if(root.right!=null) rh++;
    int d = lh - rh;
    if(d<0) d = -d;
    if(d>1) return false;
    return(isBalanced(root.left) && isBalanced(root.right));
    }
       public static boolean isBalanced(Node root) {
        return checkBalance(root) != -1;
    } 
       private static int checkBalance(Node root) {
        if (root == null) return 0; // Base case: height of null tree is 0
    
        int leftHeight = checkBalance(root.left);
        if (leftHeight == -1) return -1; // Left subtree is not balanced
    
        int rightHeight = checkBalance(root.right);
        if (rightHeight == -1) return -1; // Right subtree is not balanced
    
        if (Math.abs(leftHeight - rightHeight) > 1) return -1; // Current node is not balanced
    
        return 1 + Math.max(leftHeight, rightHeight); // Return height of the current subtree
    }
   
    // public static int height(Node root){
    //     if(root == null) return 0;
    //     return Math.max(height(root.left),height(root.right));
    // }
    // public static boolean balanced(Node root){
    //     if(root == null ) return true;
    //     int lh = height(root.left);
    //     int rh = height(root.right);
    //     int d = lh - rh;
    //     if(d>0)  d = -d;
    //     if(d>1) return false;
    //     return (balanced(root.left) && balanced(root.right));
    // }


  public static  boolean isSameTree(Node p, Node q) {
    if(p == null && q == null ) return true;
    if(p == null || q == null) return false;
    if(p.val != q.val) return false;
    return isSameTree(p.left,q.left) && isSameTree(p.right , q.right);
    }
    
        public static void main(String[] args) {    
            Node root = new Node(1);
       // root.val = 10;
            
            Node a= new Node(2);
            Node b = new Node(3);
            root.left =a;
            root.right=b;
            Node c= new Node(4);
            Node d = new Node(5);
            root.left.left =c;
            root.left.right=d;
            Node e= new Node(6);
            Node f = new Node(7);
            root.right.left =e;
           root.right.right=f;

          

    //display(root);
       // System.out.println(root.val);

    // System.out.println(max(root));
    // System.out.println(min(root));
    // System.out.println("product "+product(root));
    
    // System.out.println("height " + heigth(root) + " level is " + (heigth(root) + 1));
    // System.out.println("nthlevel "); 
    // nthlevel(root, 3);
    //bfs(root);
     //System.out.println("this is for diameter "+ diameter(root));
   System.out.println("this is for balanced "+  isBalanced(root));
    }
}

/*
 *               1               ->level 3
 *              / \   -> height 1
 *             2   3                -> lev 2
 *            / \  / \  -> height 2
 *           4   5 6   7                ->lev 1
 *           n   n n   n
 *  */