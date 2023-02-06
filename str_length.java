import java.net.SocketPermission;
import java.util.*;  

public class str_length {

   public static void main(String[] args) {
    //   System.out.println("Hello World!");
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");  
    String str = sc.nextLine();  

    int count = str.length();

    System.out.println("The length of string is " + count);
    System.out.print("The entered string is " + str);

   }
}
