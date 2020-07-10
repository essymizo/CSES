import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //base case
        if (n == 1)
            System.out.println(1);
        else if (n == 2 || n == 3)
            System.out.println("NO SOLUTION");
        else {
            int[] even = new int[n];
            int[] odd = new int[n];

            int x = 0;
            int y = 0;

            int val = 5;
            while (val <= n) {
                odd[x++] = val;
                val += 2;
            }
            val = 6;
            while (val <= n) {
                even[y++] = val;
                val += 2;
            }

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < y; i++) {
                sb.append(even[i] + " ");

            }
            sb.append("2 4 1 3 ");
            for (int i = 0; i < x; i++) {
                sb.append(odd[i] + " ");
            }


            System.out.println(sb);

        }

    }
}
