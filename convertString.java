import java.util.*;
public class convertString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the string");
        String s= sc.next();
        StringBuilder sb = new StringBuilder();
      for(char c:s.toCharArray()){
         if(Character.isUpperCase(c)&&sb.length()>0){
           sb.append(" ");
         }
        
           sb.append(Character.toLowerCase(c));
      }
      System.out.println(sb.toString());
    }
}
