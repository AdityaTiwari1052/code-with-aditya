import java.util.*;
public class longestsubarray0and1 {
    public static int subarray(int[] arr){
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,-1);
     int cnt=0;
     int max=0;
     int sum=0;
     for(int i=0;i<arr.length;i++){
         sum+=arr[i]==0?-1:1;
         if(hm.containsKey(sum)){
            max=Math.max(max,i-hm.get(sum));
         }else{
            hm.put(sum,i);
         }
         
         }
         return max;
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
        System.out.println(subarray(arr));
    }
}
