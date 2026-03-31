import java.util.*;
public class vovalprint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = sc.nextLine().toLowerCase();
        System.out.println("Vowels in the String are :");

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o'||ch == 'u'){
                System.out.println(ch + " ");
            }
        }
    }
}
 
   
 