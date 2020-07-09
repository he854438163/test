package test;

import java.util.Deque;
import java.util.LinkedList;

public class test5 {

            public int[] dailyTemperatures(int[] T) {
                int[] res=new int[T.length];
                for(int i=0;i<T.length;i++){
                    if(i==T.length-1)continue;
                    for(int j=i+1;j<T.length;j++) {
                        if(T[i]<T[j]){
                            res[i]=j-i;
                            break;
                        }
                    }
                }
                return res;
            }

    class Solution {
        public int[] dailyTemperatures(int[] T) {
            int length = T.length;
            int[] ans = new int[length];
            Deque<Integer> stack = new LinkedList<Integer>();
            for (int i = 0; i < length; i++) {
                int temperature = T[i];
                while (!stack.isEmpty() && temperature > T[stack.peek()]) {
                    int prevIndex = stack.pop();
                    ans[prevIndex] = i - prevIndex;
                }
                stack.push(i);
            }
            return ans;
        }
    }

}
