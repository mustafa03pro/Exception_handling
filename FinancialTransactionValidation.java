import java.util.Scanner;
public class FinancialTransactionValidation{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        try(sc){
            double x=sc.nextDouble();
            long y=sc.nextLong();//ab
            try{
                 if(x<=0){
                    throw new IllegalArgumentException(); 
                 }
            }
            catch(IllegalArgumentException e){
                    System.out.println("Error processing transaction: Transaction amount must be positive.");
                    System.exit(0);
                 }
            //  try{
            //     if(x)
            //  }    

               
            
            
           
            FinancialTransaction f1=new FinancialTransaction();
            f1.processTransaction(x,y);

        }  
        
        catch(Exception e){
            System.out.println("Invalid input: Please enter a valid number for transaction amount.");
        }

    }
}

class FinancialTransaction{
    public void processTransaction(double x,long y){
        System.out.println("Processing transaction...");
        System.out.println("Transaction successful: Amount Rs."+x+" transferred to account "+y);
        

    }
}

