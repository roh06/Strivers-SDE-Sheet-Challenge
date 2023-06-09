import java.util.ArrayList;

public class RepeatAndMissingNumber {
    public static void main(String[] args) {

    }
    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        //int[] a = arr.toArray(new int[0]);
        int[]a = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            a[i] = arr.get(i);
        }
        int duplicate = findDuplicate(a);
        int miss = missing(a);
        int[]res = new int[2];
        res[0] = miss;
        res[1] = duplicate;
        return res;
    }
    public static int findDuplicate(int[] arr) {
        int slow = arr[0];
        int fast = arr[0];
        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while(slow!=fast);
        fast = arr[0];
        while(slow!=fast){
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }
    public static int missing(int[]arr){
        int x1 = arr[0];
        int x2 = 1;
        for(int i=1;i<arr.length;i++){
            x1^=arr[i];
        }
        for(int i=1;i<=arr.length;i++){
            x2^=i;
        }
        return x1^x2;
    }
}
