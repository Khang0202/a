package assighment;

import java.util.HashSet;

public class bai4 {
    public static void main(String[] args) {
        String a = "characterssc";
        System.out.println(removeDuplicateCharacters(a));
    }

    /**
     * The removeDuplicateCharacters method removes duplicate characters from a given string,
     * preserving the order of their first appearance. It returns a new string with only
     * the first occurrence of each character.
     *
     * @param string the input string from which duplicate characters need to be removed
     * @return a new string containing only the first occurrence of each character in the
     *         order they first appeared in the input string
     */
    public static String removeDuplicateCharacters(String string) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<Character>();
        for (int i = 0; i < string.length(); i++) {
            if (set.add(string.charAt(i))) {
                sb.append(string.charAt(i));
            }
        }
        return sb.toString();
    }

}
