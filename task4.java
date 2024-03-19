import java.util.Scanner;  
   
public class task4  
{  
    
    public static void main(String args[] )  
    {  
       
        int bal = 250000, withdraw, deposit;  
        Scanner sc = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println(" 1 for Withdraw");  
            System.out.println(" 2 for Deposit");  
            System.out.println(" 3 for Check Balance");  
            System.out.println(" 4 for exit");  
            System.out.print("Choose the operation:");  
              
             
            int c = sc.nextInt();  
            switch(c)  
            {  
    case 1:  
        System.out.print("money to be withdrawn:");  
        withdraw = sc.nextInt();    
        if(bal >= withdraw)  
        {  
        bal = bal - withdraw;  
            System.out.println("collect money");  
        }  
        else  
        {  
           System.out.println("Balance");  
        }  
        System.out.println("");  
        break;  
   
    case 2:  
                      
        System.out.print("money to be deposited:");  
         deposit = sc.nextInt();  
        bal = bal + deposit;  
        System.out.println("Money has been successfully depsited");  
        System.out.println("");  
        break;  
   
    case 3:  
    
       System.out.println("Balance : "+bal);  
       System.out.println("");  
       break;  
   
    case 4:  
       System.exit(0);  
            }  
        }  
    }  
}  
