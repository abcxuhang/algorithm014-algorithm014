class Solution {
    public void rotate(int[] nums, int k) {
        //暴力
        int temp = 0;
        int pre = 0;
        int len = nums.length;
        for(int i = 0;i<k;i++){
            pre = nums[len-1];
            for(int j=0;j<len;j++){
                temp = nums[j];
                nums[j] = pre;
                pre = temp;
            }
        }
        
    }
}