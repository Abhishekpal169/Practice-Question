import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name :");
        String name = sc.nextLine();
        System.out.println(name);
        
        System.out.println("Enter a first number");
        int a = sc.nextInt();
        System.out.println("Enter a sceond number :");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Total two number :"+sum);
    }
}
