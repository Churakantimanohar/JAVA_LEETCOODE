class AnagramString {
    public static boolean isAnagram(String s, String t) {
        // If lengths of strings are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Create an array to store the frequency of each character (assuming lowercase letters)
        int[] charCount = new int[26];

        // Count the frequency of each character in the first string
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;  // Decrement for the second string
        }

        // If all values in charCount are zero, the strings are anagrams
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        AnagramString solution = new AnagramString();
        System.out.println(AnagramString.isAnagram("listen", "silent")); // true
        System.out.println(AnagramString.isAnagram("rat", "car"));       // false
    }
    
}
