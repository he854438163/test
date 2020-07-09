package test;

public class test3 {
    class Solution {
        public int translateNum(int num) {
            String src=Integer.toString(num);
            int p=0,q=0,r=1;
            for(int i=0;i<src.length();i++){
                p=q;
                q=r;
                r=0;
                r=r+q;
                if(i==0) continue;;
                String src1=src.substring(i-1,i+1);
                if(src1.compareTo("25")<=0 && src1.compareTo("10")>=0){
                    r=r+p;
                }
            }
            return r;
        }
    }
}
