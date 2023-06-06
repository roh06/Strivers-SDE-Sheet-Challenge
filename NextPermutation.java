import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NextPermutation {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation)
    {
        // Write your code here.
        int index = -1;
        int n = permutation.size();
        for(int i=n-2;i>=0;i--){
            if(permutation.get(i)<permutation.get(i+1)){
                index=i;
                break;
            }
        }
        if(index==-1){
            Collections.reverse(permutation);
            return permutation;
        }
        for(int i=n-1;i>=index;i--){
            if(permutation.get(i)>permutation.get(index)){
                int tmp = permutation.get(i);
                permutation.set(i, permutation.get(index));
                permutation.set(index, tmp);
                break;
            }
        }
        List<Integer> sublist = permutation.subList(index + 1, n);
        Collections.reverse(sublist);

        return permutation;
    }
}
