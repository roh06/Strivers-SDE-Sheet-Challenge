public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[]arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubarraySum(arr, arr.length));
    }
    public static long maxSubarraySum(int[] arr, int n) {
        // write your code here
        long maxi = Long.MIN_VALUE; // maximum sum
        long sum = 0;
        if(n==0){
            return 0;
        }
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum > maxi) {
                maxi = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
            if(maxi<0){
                maxi=0;
            }
        }
        return maxi;
    }

}
