public class Exception2 {
    public static void main(String[] args) {
        System.out.println(m1());
    }
        public static int m1(){
            try {
                System.out.println("inside m1");
                return 10;
            } catch (Exception e) {
                System.err.println("inside catch");
                return 20;
            }
           // System.out.println("hi");
        }
    
    
}
