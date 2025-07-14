public class Exception1{
    public static void main(String[] args) {
        try {
            String str="nit";
            System.out.println(str.toUpperCase());
            try {
                int no=Integer.parseInt(str);
                System.out.println("the number"+no);
            } catch (NumberFormatException e) {
                System.err.println("the number is not in format");
            }
            
        } catch (NullPointerException e) {
            System.err.println("the string is pointing to null");
            
        }
    }
}