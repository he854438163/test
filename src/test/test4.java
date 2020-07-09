package test;

public class test4 {
    /*class Solution {
        public boolean isGoodArray(int[] nums) {
            int res=nums[0];
            for(int i=1;i<nums.length;i++){
                res=gcd(res,nums[i]);
            }
            return res==1;
        }
        private int gcd(int res, int num) {
            return num==0 ? res:gcd(num,res%num);
        }
    }*/
    class Solution {
        public int[] distributeCandies(int candies, int num_people) {
            int[] boy=new int[num_people];
            int i=0;
            while (candies>0){
                boy[i%num_people]+=Math.min(candies,i+1);
                candies-=Math.min(candies,i+1);
                i++;
            }
            return boy;
        }
    }
}


