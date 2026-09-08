class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;

         int maxcand=candies[0];
        for(int i=1;i<n;i++){
             maxcand=Math.max(candies[i],maxcand);
        }
         List<Boolean> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies>=maxcand){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}