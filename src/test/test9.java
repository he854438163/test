package test;

public class test9 {
    class Solution {
        public String addBinary(String a, String b) {
            StringBuffer ans=new StringBuffer();
            int n=Math.max(a.length(),b.length());
            int x=0;
            for(int i=0;i<n;i++){
                if(i<a.length())x=x+(a.charAt(a.length()-1-i)-'0');
                if(i<b.length())x=x+(b.charAt(b.length()-1-i)-'0');
                ans.append((char)(x%2+'0'));
                x=x/2;
            }
            if(x>0){
                ans.append('1');
            }
            ans.reverse();
            return ans.toString();
        }
    }

}
