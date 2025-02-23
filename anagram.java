import java.util.Scanner;

public class anagram {
public static boolean isanagram(String s1,String s2){
     int[] arr= new int[26];
     for(char c:s1.toCharArray()){
            arr[c-'a']++;
     }
     for(char c:s2.toCharArray()){
        arr[c-'a']--;
     }
     for(int count:arr){
        if(count!=0){
         return false;
        }
     }
     return true;
}
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first string");
        String s1= sc.next();
        System.out.print("Enter the second string");
         String s2= sc.next();
         System.out.println(isanagram(s1,s2)?"Anagram":"Not Anagram");
       
    }
}
