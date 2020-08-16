class Solution {
    public void moveZeroes(int[] nums) {
        // int j = 0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i] != 0){
        //         nums[j] = nums[i];
        //         if(j != i){
        //             nums[i] = 0;
        //         }
        //         j++;
        //     }
        // }
        int j = 0;
        int i = 0;
        for(i = 0; i < nums.length;i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }
        for(int n = j;n<i;n++){
            nums[n] = 0;
        }
    }
}