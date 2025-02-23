import java.util.*;
public class RotateArray {
    public static int[]rotateArray(int[] arr,int k){
        int n= arr.length;
        k= k%n;
        int[] result= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            result[(i+k)%n]= arr[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the array size");
        int n= sc.nextInt();
        System.out.print("Enter the no of rotation");
        int k= sc.nextInt();
        System.out.print("Enter the array Elements");

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       System.out.println(Arrays.toString(rotateArray(arr,k)));
    }
}
