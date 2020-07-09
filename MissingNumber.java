import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class MissingNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        ArrayList<Long> input_Arr=new ArrayList<>();

        for (int i = 1; i < n; i++) {
            input_Arr.add(sc.nextLong());
        }
        long s = 0;

        for (int i = 1; i < n; i++) {

            s += input_Arr.get(i-1);
        }
        long res = (n * (n + 1) / 2) - s;
        System.out.println(res);



    }
}