import java.util.ArrayList;

public class SearchInA2DMatrix {
    public static void main(String[] args) {

    }
    static boolean findTargetInMatrix(ArrayList<ArrayList<Integer>> mat, int m, int n, int target) {
        int i=0,j=n-1;
        if(m==0)return false;
        while(i<m&&j>=0){
            if(mat.get(i).get(j)==target){
                return true;
            }
            else if(mat.get(i).get(j)<target){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
}
