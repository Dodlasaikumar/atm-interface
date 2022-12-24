import java.util.Scanner;  
public class atminterface
{  
        
    public static void main(String args[] )
    {  
            
	int balance = 200000, withdraw, deposit;  
                   
    	Scanner sc = new Scanner(System.in); 
		
	System.out.println("Please enter your Login Details");
	System.out.print("Enter your Login ID:");
	String loginid=sc.nextLine();

	System.out.print("Enter your Pin:");
	String pin=sc.nextLine(); 

	if(loginid.equals("saikumar") && pin.equals("1234")) 
	{
              
            while(true)  
            {  
                System.out.println("Welcome to ATM SERVICE ");  
                System.out.println("1. Withdrawal");  
                System.out.println("2. Deposit");  
				System.out.println("3. Transfer"); 
                System.out.println("4. Check Balance");  
                System.out.println("5. QUIT");  
                System.out.print("Choose the operation you want to perform:");  
                  
               
                int choice = sc.nextInt();  
                switch(choice)  
                {  
                case 1: 
					System.out.print("Enter money to be withdrawn:");  
                   
					withdraw = sc.nextInt();  
                          
				
					if(balance >= withdraw)  
					{  
					
					balance = balance - withdraw;  
					System.out.println("Money withdrawn sucessfully Please collect your money");  
					}  
					else  
					{  
				
					System.out.println("Insufficient Balance");  
					}  
					System.out.println("");  
				break;  
       
                case 2: 
                          
					System.out.print("Enter the  money to be deposited:");  
                          
					
					deposit = sc.nextInt();  
                          
					
					balance = balance + deposit;  
					System.out.println("Your Money has been successfully deposited");  
					System.out.println("");  
				break;  
				
		case 3: 
						System.out.print("Enter Receiver's Bank Account Number: ");
						int rac=sc.nextInt();
						System.out.print("Enter Amount to be transferred: ");
						int amttransfer=sc.nextInt();
						if(amttransfer<=balance)
						{
							System.out.println("Amount Successfully transferred.");
							balance=balance-amttransfer;
						}
						else
						{
							System.out.println("You don't have enough balance in your account.");
						}
						System.out.println(""); 
				break;
				
                case 4:
					System.out.println("Balance : "+balance);  
					System.out.println("");  
				break;  
       
                case 5:  
					System.exit(0);  
                }  
            }  
        }
	else 
	{
	System.out.println("Wrong Credentials");
	}
   	}  
}  