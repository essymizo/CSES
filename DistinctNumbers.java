import java.util.Arrays;
import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        if(n>1){
            int[] arr=new int[n];
            for (int i=0;i<n;i++){
                arr[i]=sc.nextInt();

            }
            Arrays.sort(arr);
            for(int i=1;i<n;i++){
                if(arr[i]!=arr[i-1]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
