public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        if(nums.length < 3)
            return 0;
        int res = nums[0] + nums[1] + nums[2];
        for(int i=0; i<nums.length - 2; i++){
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right){
                int sum = nums[left] + nums[right] + nums[i];
                if(Math.abs(res - target) > Math.abs(sum - target))
                    res = sum;
                if(sum == target){
                    return target;
                }else if(sum > target){
                    right--;
                }else{
                    left++;
                }
            }
            while(i + 1 < nums.length - 2 && nums[i] == nums[i + 1]) i++;
        }
        return res;
    }
}