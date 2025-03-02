public class PractiseTreeRevision1 {
    public static class Node{
        int val;
        Node left;
        Node right;
        private Node(int val) {
            this.val = val;
            // this.left = left;
            // this.right = right;
        }
    }

        private static void display(Node root) {
            //     TODO Auto-generated method stub
            if(root == null ) return;
            System.out.print( root.val + " -> ");
            if(root.left != null) { System.out.print(root.left.val + " , "); }      else { System.out.print(" null ");}
            if(root.right  != null) { System.out.println(root.right.val + "  "); } else {  System.out.println("  null ");}
           
            display(root.left);
            display(root.right);
        }
        public static int max(Node root){
            if(root == null ) return 0;

            return Math.max(root.val, Math.max(max(root.left), max(root.right)));
        }
        public static int min(Node root){
            if(root == null ) return 0;

            return Math.min(root.val, Math.min(min(root.left), min(root.right)));
        }
        public static int height(Node root){
            if(root == null ) return 0;
            if(root.left == null && root.right == null ) return 0;
            return 1 + Math.max(height(root.left), height(root.right));
        }
        public static int product(Node root){
            if(root == null) return 1;
            return root.val *product(root.left)*product(root.right);
        }
        public static Node inverttree(Node root){
            if(root == null) return root;
            Node temp = root.left;
            root.left = root.right;
            root.right = temp;

            root.left = inverttree(root.left);
            root.right = inverttree(root.right);
            return root;
        }
        public static void main(String[] args) {
     Node root = new Node(1);
        // root.val = 1;
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);   root.left.right = new Node(5);
    root.right.left = new Node(6);  root.right.right = new Node(7);
    
    
    //display( root);
     //System.out.println("max is " + max(root));
    // System.out.println("height is " + height(root));
    //  System.out.println("product "+ product(root));
    System.out.println("tree ");
    display(root);
    System.out.println("inverted_tree ");
    root = inverttree(root);
   display(root);

        }
        
}
