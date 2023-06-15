import java.util.HashMap;
import java.util.Map;

public class MajorityElementOne {
    public static void main(String[] args) {

    }
    public static int findMajority(int[] nums, int n) {
        // Write your code here.
        // >n/2 times
        int res=-1;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i], mp.get(nums[i])+1);
            }
            else{
                mp.put(nums[i],1);
            }
        }
        for(Map.Entry entry :mp.entrySet()){
            if((int)entry.getValue()>=((nums.length/2)+1)){
                res = (int)entry.getKey();
                break;
            }
        }
        return res;
    }
}
