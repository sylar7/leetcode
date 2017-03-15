public class Solution {
    public int singleNumber(int[] nums) {
        // use property of xor, any number xor with 0 is still itself
        // every number xor with itself will be 0
        // eg: 0 ^ 3 ^ 4 ^ 3 = 4
        int xor = 0;
        for (int i : nums) {
            xor ^= i;
        }
        return xor;
    }
}

/*
public class Solution {
    int n = 0;
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums) {
            if(!map.containsKey(n)) map.put(n,1);
            else map.put(n, map.get(n) + 1);
        }

        map.forEach((k,v) -> {
            if(v == 1) n = k;
        });
        
        return n;
    }
}
*/