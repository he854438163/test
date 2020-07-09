package test;

import java.util.Arrays;
import java.util.Comparator;

public class test12 {
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            Arrays.sort(nums);
            int count=0,max=nums[nums.length-1];
            for(int i=nums.length-2;i>=0;i--){
                if(max>nums[i]){
                    max=nums[i];
                    count++;
                }
                if(count==k-1) return max;
            }
            return max;
        }
    }
}
 