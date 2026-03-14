import java.util.*;
public class switchCase {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number a :");
       int a = sc.nextInt(); 
       System.out.println("Enter a number b :");
       int b = sc.nextInt();
       System.out.println("Enter a operator :");
       char operator = sc.next().charAt(0);
       switch (operator) {
           case '+':
               System.out.println("Sum of two number :"+(a+b));
               break;
               case'-':
               System.out.println("Substration of two number"+(a-b));
               break;
               case'*':
               System.out.println("Multiple by two number :"+(a*b));
               break;
               case'/':
               System.out.println("Divide by two number : "+(a/b));
               break;
               case'%':
               System.out.println("Moduls of number is :"+(a%b));

            default:
               throw new AssertionError("Invaild operator");
       }
    }
}
