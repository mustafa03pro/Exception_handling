import java.util.Scanner;

class notProper extends RuntimeException{
    public notProper(){

    }
    public notProper(String errmsg){
        super(errmsg);
    }
}
public class CustomUnchecked {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try(sc){
            int num=sc.nextInt();
            if(isEven(num)){
                System.out.println("it is a even number");

            }

            
        } catch (notProper e) {
            System.err.println("Custom Exception Caught: "+ e.getMessage());
            
        }
        catch(Exception e){
            System.err.println("some other exception occure");

        }
        
    }
    public static boolean isEven(int num){
    if(num%2!=0){
        
        throw new notProper("input is not aeven number");
    }
    return true;
}
    
}
