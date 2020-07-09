package test;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
public class test1 {
    class Solution {
        public int[] spiralOrder(int[][] matrix) {
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                return new int[0];
            }
            int rows=matrix.length;
            int columns=matrix[0].length;
            //boolean[][] pd=new boolean[rows][columns];
            int[] res=new int[rows*columns];
            int top=0,left=0,bottom=rows-1,right=columns-1;
            int index=0;

            while (left<=right && top<=bottom){
                for(int i=left;i<=right;i++)
                {
                    res[index]=matrix[top][i];
                    index++;
                }
                for (int i=top+1;i<=bottom;i++){
                    res[index]=matrix[i][right];
                    index++;
                }
                if (left<right && top<bottom){
                    for(int i=right-1;i>left;i--){
                        res[index]=matrix[bottom][i];
                        index++;
                    }
                    for(int i=bottom;i>top;i--){
                        res[index]=matrix[i][left];
                        index++;
                    }
                }
                left++;
                right--;
                top++;
                bottom--;
            }
            return res;
        }
    }
}
