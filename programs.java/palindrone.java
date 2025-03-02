// public class palindrone {
//         public boolean isPalindrome(int x) {
//             int n = x;
//             long rev = 0;
//             if (x < 0) return false;
//             while (x > 0) {
//                 rev = (rev * 10) + (x % 10);
//                 x /= 10;
//             }
//             if (rev == n) return true;
//             return false;
//         }
//         public static void main(String[] args) {
//             int x;
//               if(=x){
//                 System.out.println("");

//               }

//         }
//     }
    
    

public class palindrone{  
 public static void main(String args[]){  
  int r,sum=0,temp;    
  int n=45;//It is the number variable to be checked for palindrome  
  
  temp=n;    
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}  