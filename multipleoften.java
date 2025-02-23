import java.util.*;
public class multipleoften {
    public static int[] rearrange(int[] arr){
        List<Integer>m= new ArrayList<>();
        List<Integer>nm= new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%10==0){
                m.add(arr[i]);
            }else{
                nm.add(arr[i]);
            }
        }
        nm.addAll(m);
        int[] num= new int[arr.length];
        for(int i=0;i<nm.size();i++){
            num[i]= nm.get(i);
        }
        return num;
        
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
        System.out.println(Arrays.toString(rearrange(arr)));
    }
}
