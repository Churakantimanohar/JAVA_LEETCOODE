




public class Output {
    public static void main(String[] args) {
        // System.out.println(Arrays.toString(new int [] {1,2,3,4}));
        // float a =44.33554f;
        // System.out.printf("roundoff,upto two, %.2f ",a);
        // System.out.printf("pie is %.3f",Math.PI);
        // System.out.printf("this is %s and this is %s","manu","reddy");
        // System.out.println('a' + 'b');
        // System.out.println("a" + "b");
        // System.out.println((char) ('a' + 5));
        // System.out.println("a" + 1);// when an integer will be converted to integer taht will call toString();
        // System.out.println("manu" + new ArrayList<>());
        // System.out.println("manu" + new Integer(56));
        // System.out.println();
        // String sereies = "";
        // StringBuilder builder = new StringBuilder();
        // for(int i =0;i<26;i++){
        //     char ch=(char)('a'+i);
        //    // sereies +=ch;
        //    builder.append(ch);//no wasteage of space
        // }//
        // builder.reverse();
        // //System.out.println(sereies);
        // System.out.println(builder.toString());
        // String name ="manohar";
        // System.out.println(Arrays.toString(name.toCharArray()));//op:[m, a, n, o, h, a, r]
        // System.out.println(name.toUpperCase());// up = MANOHAR and lower =,op:manohar
        // System.out.println(Arrays.toString(name.toCharArray()));
        
    
  String str = "SSSDDDSSS";
  System.out.println(palindrome(str));


    }

    static boolean palindrome(String str){
        str = str.toLowerCase();
        for(int i=0; i <= str.length()/2;i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);

            if(start != end){
                return false;
            }
        }
        return true;
    }

// message();
//    }
//     static void message(){
//         System.out.println("hello world 0");
//         message();
   // }
    // static void message1(){
    //     System.out.println("hello world 1 ");
    //     message2();
    // }
    // static void message2(){
    //     System.out.println("hello world 2");
    //     message3();
    // }
    // static void message3(){
    //     System.out.println("hello world 3");
    //     message();
    }









