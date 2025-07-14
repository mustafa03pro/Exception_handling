
import java.util.Scanner;
public class Tester{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        try(sc){
            
           String str=sc.nextLine();//ab
              

               
            
            
           
            ChildClass f1=new ChildClass();
            f1.loadingClass(str);

        }  
        
        catch(ClassNotFoundException e){
            System.out.println(e.toString());
        }

    }
}

class ParentClass{
    public void  loadingClass(String str) throws ClassNotFoundException
    {
        Class.forName(str);

        
        

    }
}
class ChildClass extends ParentClass
{
    
    public void  loadingClass(String str)throws ClassNotFoundException
    {
        try {
            Class.forName(str);
            System.out.println(str+".String loaded successfully.");
            
        } catch (IllegalArgumentException e) {
            System.err.println(e);
        }
        
        

        
        

    }

}

