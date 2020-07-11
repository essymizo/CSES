import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SumOfTwoValues {
    public static void solve(int[] arr,int sum){
        ArrayList<Integer> res=new ArrayList<>();
        StringBuilder s=new StringBuilder();
        Map<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(sum-arr[i])){
                int t=map.get(sum-arr[i]);
                s.append((t+1)+" "+(i+1));
                break;
            }
            map.put(arr[i],i);
        }
        if(s.length()>0)
            System.out.println(s);
        else
            System.out.println("IMPOSSIBLE");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n,x;
        String input=sc.nextLine();
        String[] input_Str=input.split(" ");

        n=Integer.parseInt(input_Str[0]);
        x=Integer.parseInt(input_Str[1]);

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        solve(arr,x);

    }
}
