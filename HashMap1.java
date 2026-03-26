import java.util.*;
public class HashMap1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Gender");
       char gen;
       gen = sc.next().charAt(0);

       switch(gen){
        case 'M':
            case 'm':
                System.out.println("Male");
                break;
                case 'F':
                    case'f':
                    System.out.println("Female");
                    break;
                    default:
                        System.out.println(" Unspecifield Gender .");
       }    
    }
}
