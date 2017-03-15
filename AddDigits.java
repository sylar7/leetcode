public class Solution {
    public int addDigits(int num) {
        int sum = 0;
        while(num / 10 > 0){
        	sum += num % 10;
        	num /= 10;
        }
        sum += num;
        if(sum / 10 == 0) 
        	return sum;
        else
			return addDigits(sum);
    }
    public int addDigits(int num){
    	return (num - 9 * ((num - 1) / 9));
    }
}