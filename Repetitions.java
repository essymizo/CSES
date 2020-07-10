import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.next();
        char curr=input.charAt(0);
        int max=1, curr_max=1;
        for(int i=1;i<input.length();i++){
            if(input.charAt(i)!=curr) {
                curr = input.charAt(i);
                curr_max=1;

            }
            else{
                curr_max++;
            }
            max=max>=curr_max?max:curr_max;


        }

        System.out.println(max);
    }
}
