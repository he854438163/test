package test;

public class test7 {
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            if(strs.length==0){
                return "";
            }
            String s=strs[0];
            for(int i=1;i<strs.length;i++){
                int j=0;
                for(;j<s.length() && j<strs[i].length();j++){
                    if(s.charAt(j)!=strs[i].charAt(j)){
                        break;
                    }
                }
                s=s.substring(0,j);
                if (s.equals("")) return s;
            }
            return s;
        }
    }
}
