import java.util.*;
class Solution {
    public static int[] twoSum(int[] nums, int target) {
      /*traversing the array with two pointers and checking the sum of each two elements with the target*/

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
         if(nums[i]+nums[j]==target)
         {
           return new int[]{i,j};
           //here returned a new array for the indices(direct declarationa0
         }   
        }
        }
             return new int[]{-1,-1};
    }

}
