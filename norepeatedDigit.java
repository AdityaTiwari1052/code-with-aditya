
import java.util.*;
public class norepeatedDigit {
    public static boolean isunique( int num){
        String s= String.valueOf(num);
        Set<Character>set= new HashSet<>();
        for(char c:s.toCharArray()){
            if(set.contains(c)){
                return false;
            }else{
                set.add(c);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower");
        int l= sc.nextInt();
        System.out.print("Enter the upper");
        int h= sc.nextInt();
        int cnt=0;
        for(int num=l;num<=h;num++){
            if(isunique(num)){
              cnt++;
            }
        }
        System.out.println(cnt);
    }
}
