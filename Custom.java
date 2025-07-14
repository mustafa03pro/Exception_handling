import java.util.Scanner;

class IllegalNumber extends Exception{

 public IllegalNumber(){

 }
 public IllegalNumber(String Errmsg){
    super(Errmsg);
 }

}
public class Custom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try(sc) {
            System.out.print("enter the age");
            int age=sc.nextInt();
            validate(age);


            
        } catch (IllegalNumber e) {
            System.err.println("you are immature");
        }

        
    }
    public static void validate(int age)throws IllegalNumber
    {
        if(age<18){
            throw new IllegalNumber();
        }
        else{
            System.out.println("you are eligiable"+age);
        }
    }
    

    
}


