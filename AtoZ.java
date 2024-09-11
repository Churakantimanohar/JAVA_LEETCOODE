import java.util.*;

class AtoZ {

    // public static boolean chePangram(String sentence){
    //           HashSet<Character> ch = new HashSet<>();
    //     sentence = sentence.toLowerCase();

    //     for(int i=0 ; i<sentence.length();i++){
    //         ch.add(sentence.charAt(i));

    //     }
    //     for(int i='a';i<='z';i++){
    //         if(!ch.contains(i)) return false;
    //     }
    //     return true;
    //       HashSet<Character> ch = new HashSet<>();
    //     sentence = sentence.toLowerCase();
        
    //     // Add only alphabetic characters to the HashSet
    //     for (int i = 0; i < sentence.length(); i++) {
    //         char c = sentence.charAt(i);
    //         if (Character.isLetter(c)) {
    //             ch.add(c);
    //         }
    //     }
        
    //     // Check if HashSet contains all 26 letters
    //     return ch.size() == 26;
    //     HashSet<Character> mp=new HashSet<>();
    //     for(int i=0; i<sentence.length(); i++){
    //         mp.add(sentence.charAt(i));
    //     }
    //     for(char i='a'; i<='z'; i++){
    //         if(!mp.contains(i)) return false;
    //     }
    //     return true;
    // }



    public static boolean checkIfPangram(String sentence) {
        sentence = sentence.toLowerCase();
        HashSet<Character> mp = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            mp.add(sentence.charAt(i));
        }
        for (char i = 'a'; i <= 'z'; i++) {
            if (!mp.contains(i))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(s));
    }
}
