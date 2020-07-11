import java.util.Scanner;

public class MaximumSubarraySum {
    public static void solve(long[] nums){

        long result = nums[0];
        long sum = nums[0];

        for(int i=1; i<nums.length; i++){
            sum = Math.max(nums[i], sum + nums[i]);
            result = Math.max(result, sum);
        }

        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        long[] arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        solve(arr);
    }
}
