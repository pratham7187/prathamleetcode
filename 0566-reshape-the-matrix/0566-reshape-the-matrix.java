class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n=mat.length;
        int m=mat[0].length;
        int [] [] ans=new int[r][c];
        int [] arr=new int[r*c];
        int k=0;

        if (n * m != r * c)
            return mat;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[k]=mat[i][j];
                k++;
            }
        }
        int p=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[i][j]=arr[p];
                p++;
            }
        }
        return ans;
    }
}