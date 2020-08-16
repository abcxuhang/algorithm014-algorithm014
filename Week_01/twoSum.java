class Solution {
    public int[] twoSum(int[] nums, int target) {
 //       int [] reInt = new int[2];
 //       for(int i = 0;i<nums.length;i++){
//            int tmp = target - nums[i];
 //           for(int j=i+1;j<nums.length;j++){
 //               if(tmp == nums[j]){
 //                   reInt[0] = i;
 //                   reInt[1] = j;
  //                  return reInt;
 //               }
 //           }

  //      }
  //      return reInt;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0;i<nums.length;i++){
            int tmp = target - nums[i];
            if(map.containsKey(tmp)){
                 return new int[] { map.get(tmp), i };
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution"); 
    }
}