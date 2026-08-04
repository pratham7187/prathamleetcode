class Solution {
    public String reverseWords(String s) {

        String[] rev = s.split(" ");

        for (int i = 0; i < rev.length; i++) {
            String word = rev[i];
            String temp = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                temp += word.charAt(j);
            }

            rev[i] = temp;
        }

        String ans = "";

        for (int i = 0; i < rev.length; i++) {
            ans += rev[i];

            if (i != rev.length - 1) {
                ans += " ";
            }
        }

        return ans;
    }
}