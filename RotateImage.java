public class RotateImage {
    public static void main(String[] args) {

    }
    public static void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }
    public static void transpose(int[][] mat){
        for(int i=0;i<mat.length;i++){
            for(int j=i+1;j<mat[i].length;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
    public static void reverse(int [][] mat){
        for(int i=0;i<mat.length;i++){
            int temp = mat[i].length-1;
            for(int j=0;j<mat[i].length;j++){
                if(j!=temp && j<temp){
                    int swap = mat[i][j];
                    mat[i][j] = mat[i][temp];
                    mat[i][temp] = swap;
                }
                --temp;
            }
        }
    }
}
