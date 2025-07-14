import java.util.Scanner;
class fileNot extends Exception{
    public fileNot(){

    }
    public fileNot(String errmsg){
        super(errmsg);
    }
}
class test{

}
public class custom3 {
    public static void main(String arrgs[]){
        Scanner sc=new Scanner(System.in);
        try(sc){
            System.out.println("main method started");
            int num=sc.nextInt();
            m1(num);

        }
        catch(fileNot e){
            System.err.println(e.getMessage());

        }

    }
    public static void m1(int num)throws fileNot
    {
         if(num<10){
            throw new fileNot("this is not a valid number");
         }
         else{
            System.out.println("the number is"+num);
         }
    }
    
}
