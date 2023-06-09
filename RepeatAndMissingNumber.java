public class RepeatAndMissingNumber {
    public static void main(String[] args) {

    }
    public int findDuplicate(int[] arr) {
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
}
