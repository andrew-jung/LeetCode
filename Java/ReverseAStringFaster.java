public class Solution {
    public String reverseString(String s) {
        char[] word = s.toCharArray(); // Create a char array from input string.
        int i = 0;
        int j = s.length() - 1; //
        while (i < j) {
            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;
            i++;
            j--;
        }
        return new String(word);
    }
}