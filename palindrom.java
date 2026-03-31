public class palindrom{
    public static void main(String[] args) {
        String str = "madam";
        String reversed = new StringBuilder(str).reverse().toString();
        if(str.equals(reversed)){
            System.out.println("palindrom");
        }else{
            System.out.println("Not palindrom");
        }
    }
}