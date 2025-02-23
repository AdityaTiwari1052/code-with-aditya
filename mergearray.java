import java.util.Arrays;
import java.util.Scanner;

public class mergearray {
    public static int[] merge(int[] arr1,int[] arr2){
        int m= arr1.length,n=arr2.length;
        int[] merge= new int[m+n];
        int i=0,j=0,k=0;
        while(i<m &&j<n){
            if(arr1[i]<arr2[j]){
             merge[k++]=arr1[i++];
            }else{
                merge[k++]=arr2[j++];
            }
        }
        while(i<m){
            merge[k++]=arr1[i++];
        }
        while(j<n){
            merge[k++]=arr2[j++];
        }
        return merge;
    }
    public static void main(String[] args) {
          Scanner sc= new Scanner(System.in);
        System.out.print("Enter the  first array size");
        int m= sc.nextInt();
        System.out.print("Enter the first array Elements");
        int[] arr1 = new int[m];
        for(int i=0;i<m;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter the  second array size");
        int n= sc.nextInt();
        System.out.print("Enter the second array Elements");
        int[] arr2 = new int[n];
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
      System.out.println(Arrays.toString(merge(arr1,arr2)));
    }
}
