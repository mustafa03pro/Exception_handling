
import java.util.Scanner;
public class AgeValidation{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        try(sc){
            int num=Integer.parseInt(sc.nextLine());
            if(num<=0){
                System.out.println("Error Invalid Input");
                System.exit(0);
            }
           
            Validator(num);
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        catch(NumberFormatException e){
            System.out.println("Error Invalid Input");
                System.exit(0);

        }


    }
    public static void Validator (int num)throws InvalidAgeException
    {
        if(num<18){
            throw new InvalidAgeException("Age must be at least 18");
        }
        else{
            System.out.println("Access granted");
        }
    }

}
class InvalidAgeException extends Exception{
    public InvalidAgeException(){

    }
    public InvalidAgeException(String errmsg){
        super(errmsg);
    }
}