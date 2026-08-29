class Solution {
    public String lexPalindromicPermutation(String s, String target) {
        int n=s.length();
        int[] cnt=new int[26];
        for(int i=0;i<n;i++){
            cnt[s.charAt(i)-'a']++;
        }
        int odd=0;
        int mid=-1;
        for(int i=0;i<26;i++){
            if(cnt[i]%2!=0){
                odd++;
                mid=i;
            }
        }
        if(odd>n%2){
            return "";
        }

        int h=n/2;
        int[] halfCnt=new int[26];

        for(int i=0;i<26;i++){
            halfCnt[i]=cnt[i]/2;
        }

        char[] half=new char[h];

        for(int i=0;i<h;i++){
            int t=target.charAt(i)-'a';

            if(halfCnt[t]>0){
                half[i]=(char)('a'+t);
                halfCnt[t]--;
            }
            else{
                for(int c=t+1;c<26;c++){
                    if(halfCnt[c]>0){
                        half[i]=(char)('a'+c);
                        halfCnt[c]--;

                        for(int j=i+1;j<h;j++){
                            for(int x=0;x<26;x++){
                                if(halfCnt[x]>0){
                                    half[j]=(char)('a'+x);
                                    halfCnt[x]--;
                                    break;
                                }
                            }
                        }

                        return makePalindrome(half,mid);
                    }
                }

                for(int j=i-1;j>=0;j--){
                    int old=half[j]-'a';
                    halfCnt[old]++;

                    for(int c=old+1;c<26;c++){
                        if(halfCnt[c]>0){
                            half[j]=(char)('a'+c);
                            halfCnt[c]--;

                            for(int k=j+1;k<h;k++){
                                for(int x=0;x<26;x++){
                                    if(halfCnt[x]>0){
                                        half[k]=(char)('a'+x);
                                        halfCnt[x]--;
                                        break;
                                    }
                                }
                            }

                            return makePalindrome(half,mid);
                        }
                    }
                }

                return "";
            }
        }

        String ans=makePalindrome(half,mid);

        if(ans.compareTo(target)>0){
            return ans;
        }

        for(int j=h-1;j>=0;j--){
            int old=half[j]-'a';
            halfCnt[old]++;

            for(int c=old+1;c<26;c++){
                if(halfCnt[c]>0){
                    half[j]=(char)('a'+c);
                    halfCnt[c]--;

                    for(int k=j+1;k<h;k++){
                        for(int x=0;x<26;x++){
                            if(halfCnt[x]>0){
                                half[k]=(char)('a'+x);
                                halfCnt[x]--;
                                break;
                            }
                        }
                    }

                    return makePalindrome(half,mid);
                }
            }
        }

        return "";
    }

    private String makePalindrome(char[] half,int mid){
        StringBuilder ans=new StringBuilder();

        for(char c:half){
            ans.append(c);
        }

        if(mid!=-1){
            ans.append((char)('a'+mid));
        }

        for(int i=half.length-1;i>=0;i--){
            ans.append(half[i]);
        }

        return ans.toString();
    }
}