class Solution {
    public int getKth(int lo, int hi, int k) {
         ArrayList<int[]>list=new ArrayList<>();
        while(lo<=hi){
            int no=lo;
            int count=0;
           
            while(no!=1){
                if(no%2==0){
                    no=no/2;
                    count++;
                }
                else{
                    no=no*3+1;
                    count++;
                }
            }
              list.add(new int[]{lo,count});
              lo++;
        }

        list.sort((a, b) -> {
            if (a[1] == b[1])
                return a[0] - b[0];

            return a[1] - b[1];
        });

        return list.get(k - 1)[0];
    }
}