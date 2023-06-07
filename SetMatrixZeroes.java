import java.util.Arrays;

public class SetMatrixZeroes {
    public static void main(String[] args) {

    }
    public void setZeroes(int[][] arr) {
        int[] row = new int[arr.length];
        int[]col = new int[arr[0].length];
        Arrays.fill(row,-1);
        Arrays.fill(col,-1);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    row[i] = 0;
                    col[j] = 0;
                }
            }
        }
        for(int i=0;i<row.length;i++){
            if(row[i]==0){
                for(int k=0;k<arr[0].length;k++){
                    arr[i][k] = 0;
                }
            }
        }
        for(int i=0;i<col.length;i++){
            if(col[i]==0){
                for(int k=0;k<arr.length;k++){
                    arr[k][i]=0;
                }
            }
        }
    }
}
