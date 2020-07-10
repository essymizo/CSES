import java.util.Scanner;
/**Sample test case:
 * 5
 * 3 2 5 1 7
 *
 * output: 5
 * */


public class IncreasingArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        long n=in.nextInt();

        long count=0;
        long max=0;
        for (int i=0;i<n;i++) {
            long num = in.nextLong();
            max = max >= num ? max : num;
            count += max - num;
        }
        System.out.println(count);
    }
}
