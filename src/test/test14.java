package test;

public class test14 {//LeetCode第309题（即2020年7月10日每日一题）
    class Solution {
        public int maxProfit(int[] prices) {
            if (prices.length == 0) {
                return 0;
            }

            int n = prices.length;
            int f0 = -prices[0];//第一天购入股票
            int f1 = 0;//售出股票处于冷却期
            int f2 = 0;//无冷却期-无股票
            for (int i = 1; i < n; ++i) {
                int newf0 = Math.max(f0, f2 - prices[i]);
                int newf1 = f0 + prices[i];
                int newf2 = Math.max(f1, f2);
                f0 = newf0;
                f1 = newf1;
                f2 = newf2;
            }

            return Math.max(f1, f2);
        }
    }

}
