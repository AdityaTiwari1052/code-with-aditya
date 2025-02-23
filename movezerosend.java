
import java.util.Arrays;
import java.util.Scanner;

public class movezerosend 
{
    public static void movezeros(int[] arr)
    {
        int i=0;
        int j=0;
        while(j<arr.length){
            if(arr[j]!=0){
                int temp = arr[j];
                   arr[j]=arr[i];
                   arr[i]=temp;
                   i+=1;
            }
            j+=1;
        }
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
        movezeros(arr);
       System.out.println(Arrays.toString(arr)); 
        
    }
 }

