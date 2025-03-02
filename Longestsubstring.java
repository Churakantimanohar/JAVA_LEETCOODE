import java.util.*;
public class Longestsubstring {
    static int method1(String str) {

        if(str.length()==0)
             return 0;
        int maxans = Integer.MIN_VALUE;
        for (int i = 0; i < str.length(); i++) // outer loop for traversing the string
        {
            Set < Character > se = new HashSet < > ();
            for (int j = i; j < str.length(); j++) // nested loop for getting different string starting with str[i]
            {
                if (se.contains(str.charAt(j))) // if element if found so mark it as ans and break from the loop
                {
                    maxans = Math.max(maxans, j - i);
                    break;
                }
                se.add(str.charAt(j));
            }
        }
        return maxans;
    }

    static int method2(String str) {

        if(str.length()==0)
             return 0;
        int max_ans = Integer.MIN_VALUE;
        Set < Character > set = new HashSet < > ();
        int l = 0;
        for (int r = 0; r < str.length(); r++) // outer loop for traversing the string
        {
            if (set.contains(str.charAt(r))) //if duplicate element is found
            {
                while (l < r && set.contains(str.charAt(r))) {
                    set.remove(str.charAt(l));
                    l++;
                }
            }
            set.add(str.charAt(r));
            max_ans = Math.max(max_ans, r - l + 1);
        }
        return max_ans;
    }


    public static void main(String args[]) {
        String str = "mystringnewtext";
        System.out.println("The length of the longest substring without repeating characters is " + method1(str)+" "+ method1(str));

    }
}