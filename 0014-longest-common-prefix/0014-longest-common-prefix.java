class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        StringBuilder sb=new StringBuilder();
        int m=strs[0].length();
        for(int i=0;i<m;i++){
            char comp=strs[0].charAt(i);
            for(int j=1;j<n;j++){
                if(i >= strs[j].length() ||strs[j].charAt(i)!=comp){
                    return sb.toString();
                }
            }               
                    sb.append(comp);               
            }
        
        return sb.toString();
    }
}
