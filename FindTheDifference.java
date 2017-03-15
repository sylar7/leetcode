public class Solution {
    public char findTheDifference(String s, String t) {
 		String str = s + t;
 		char letter = 0;
 		for (int i = 0;	i < str.length(); i++) {
 			letter ^= str.charAt(i);
 		}
 		return letter;
    }
}