class Solution {
    public String reverseWords(String s) {
        String []word=s.split(" ");
        int n=word.length;
        String ans="";
        for(int i=0;i<n;i++){
            ans+=rev(word[i]);
            if(i<n-1){
            ans+=" ";
            }
        }
        return ans;
    }

    public String rev(String s){
        int n=s.length();
        String ans="";
        for(int i=n-1;i>=0;i--){
            ans+=s.charAt(i);
        }
        return ans;
    }
}