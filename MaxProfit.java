import java.util.Scanner;

public class MaxProfit {
    public static int profit(int[] arr){
        int min=arr[0];
        int profit=0;
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
          profit= Math.max(profit,arr[i]-min);
        }
        return profit;
    }
    public static void main(String[] args) {
          Scanner sc= new Scanner(System.in);
        System.out.print("Enter the array size");
        int n= sc.nextInt();
        System.out.print("Enter the array Elements");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(profit(arr));
    }
}
