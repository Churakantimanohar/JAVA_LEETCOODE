

public class PractiseTree {
    
        public static class Node {
                     int val; //0
                     Node left; //null
                     Node right; //null
   
   
            public Node(int val) {
                        
                        this.val=val;
                    }
                    
                 }
            
         public static void display(Node root){
               if(root == null) return;
               System.out.print(root.val+" -> ");
               if(root.left != null){
                   System.out.print(root.left.val+" , ");
               }else{
                   System.out.print("null,");
               }
              if(root.right != null){
               System.out.println(root.right.val+" , ");
              }else{
               System.out.println(" ,null");
              }
               
               display(root.left);
               display(root.right);
           }

           public static int sum(Node root){
            if(root == null) return 0;
            return  root.val + sum(root.right) + sum(root.left);
           }

           public static int max(Node root){
            if(root == null) return 0;//for negative values return Integer.MIN_VALUE;
            return  Math.max(root.val, Math.max(max(root.left),max(root.right)));
           }
          
           public static int size(Node root){
            if(root == null) return 0;
            return  1 + size(root.right) + size(root.left);
           }

           public static int height(Node root){
            if(root == null) return 0;
            if(root.left == null && root.right == null) return 0;
            return  1 + Math.max(height(root.left),height(root.right));
           }



                public static void main(String[] args) {
                   Node root = new Node(1);
         // root.val=10; instead of this for every statement constructor is used 
                   Node a = new Node(2);
                   Node b = new Node(3);
                   root.left = a;
                   root.right = b;
                   
                   Node c = new Node(4);
                   Node d = new Node(5);
                   a.left = c;
                   a.right= d;
                   Node e = new Node(6);
                   b.right = e;
   
   
    //1:29
       //    System.out.println(root.val);
       //    System.out.println(root.right.val);
       //    System.out.println(root.left.val);
      // display(root);
      System.out.println("size is    "+size(root));
      System.out.println("sum is     "+sum(root));
      System.out.println("max is     "+max(root));
      System.out.println("height is  "+height(root));
       }
   }




/* 
     1
   /   \
  2     3
 / \      \
4   5      6
*/

