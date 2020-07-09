package test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class test {
  /*  public int minStartValue(int[] nums) {
        if(nums==null || nums.length==0){
            return 1;
        }
        int res=nums[0];
        int p=res;
        for(int i=1;i<nums.length;i++){
            res=res+nums[i];
            if(res<p){
                p=res;
            }
        }
        if(p<0){
            return Math.abs(p)+1;
        }
        else {
            return 1;
        }
    }
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    List<Boolean> ret=new ArrayList<>();
    int max=candies[0];
    for(int i=1;i<candies.length;i++){
      if(max<candies[i]){max=candies[i];}
    }
    for(int i=0;i<candies.length;i++){
      if(candies[i]+extraCandies>=max){
        ret.add(true);
      }else{
        ret.add(false);
      }
    }
    return ret;
  }
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int[] arr=new int[m+n];
    int i=0;
    int j=0;
    int k=0;
    while(j<m || k<n){
      if(j==m){
        arr[i++]=nums2[k++];
      }
      else if(k==n){
        arr[i++]=nums1[j++];
      }
      else if(nums1[j]<nums2[k]){
        arr[i++]=nums1[j++];
      }
      else{
        arr[i++]=nums2[k++];
      }
    }
    for(i=0;i<arr.length;i++){
      nums1[i]=arr[i];
    }
  }
  public int[] sortedSquares(int[] A) {
    int[] arr=new int[A.length];
    int i=0;
    for(i=0;i<A.length;i++){
        if(A[i]>0) break;
      }
    int j=i;
    i=i-1;
    int p=0;
    while (i>=0 && j<A.length){
      if(A[i]*A[i]<A[j]*A[j]) {
        arr[p++] = A[i] * A[i];
        i--;
      }
      else{
        arr[p++]=A[j]*A[j];
        j++;
      }
    }
    while (i>=0){
      arr[p++] = A[i] * A[i];
      i--;
    }
    while (j<A.length){
      arr[p++]=A[j]*A[j];
      j++;
    }
      return arr;
  }
  class Solution {
    int sum=0;
    public int sumNums(int n) {
      boolean flag=n>1 && sumNums(n-1)>0;
      sum=sum+n;
      return sum;
    }
  }
  class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
      HashSet<Integer> rset=new HashSet<>();
      for(int i=0;i<nums.length;i++){
        if(rset.contains(nums[i])){
          return true;
        }
        rset.add(nums[i]);
        if(rset.size()>k){
          rset.remove(nums[i-k]);
        }
      }
      return false;
    }
  }
  class Solution {
      public int[] productExceptSelf(int[] nums) {
          int[] output=new int[nums.length];
          int[] L=new int[nums.length];
          int R=1;
          int[] A=new int[nums.length];
         // int zero=0;
          L[0]=1;
          //R=1;
          for(int i=1;i<nums.length;i++){
            L[i]=L[i-1]*nums[i-1];
          }
          for(int i=nums.length-1;i>=0;i--){
              A[i]=L[i]*R;
              R=R*nums[i];
          }

          return A;
      }
  }*/
  class Solution {
      public int maxSubArray(int[] nums) {
        int res=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            nums[i]=Math.max(nums[i-1],0)+nums[i];
            res=Math.max(nums[i],res);
        }
        return res;
      }
  }
    public static void main(String[] args) {

    }
}
