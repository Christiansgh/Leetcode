public class Solution { 
    /*
        Given two strings s and t, return true if t is an anagram of s, and false otherwise.
     */    
    public boolean isAnagram(String s, String t) {
        return compare(getOccurances(s), getOccurances(t));
    }

    private int[] getOccurances(String s) {
        int[] occurances = new int[128]; //128 ASCII characters.
        char[] sChars = s.toCharArray();
        for (char c : sChars) {
            occurances[(int) c]++; //use index to keep track of which character.
        }                          //increment each occurence.
        return occurances;
    }

    private boolean compare(int[] s, int[] t) {
        for (int i = 0; i < t.length; i++) {
            if (t[i] > 0 || s[i] > 0) { //only check where there is occurences of a letter.
                if (!(s[i] == t[i])) { //if occurences arent the same, not an anagram.
                    return false;
                }
            }
        }
        return true;
    }
}