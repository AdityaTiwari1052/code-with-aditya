import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class duplicate {
    public static int[] duplicates(int[] arr){
 ArrayList<Integer>li=new ArrayList<>();
    HashMap<Integer,Integer>hm= new HashMap<>();
    for(int num:arr){
        hm.put(num,hm.getOrDefault(num,0)+1);
    }
    for(int key:hm.keySet()){
         if(hm.get(key)>1){
           li.add(key);
         }
    }
    int[]nums= new int[li.size()];
    for(int i=0;i<li.size();i++){
        nums[i]= li.get(i);
    }
    return nums;
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
         int[] result= duplicates(arr);
        System.out.println(Arrays.toString(result));
    }
}
