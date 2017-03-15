public class Solution {
    public String reverseString(String s) {
        int length = s.length();
        int i = 0;
        char[] cs = s.toCharArray();
        while(i < length - 1 - i){
        	char temp = cs[i];
        	cs[i] = cs[length - 1 - i];
        	cs[length - 1 - i] = temp;
        	i++; 
        }
        return new String(cs);
    }
}