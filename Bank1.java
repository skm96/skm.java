import java.util.Scanner;
public class Bank1 
{

	public static void main(String[] args) 
	{
		 Scanner input =new Scanner(System.in);
	        int userInput ;
	        //System.out.println(userInput); //this is use to test weather scanner works or not
	        int size=0;                  // id of customer 
	        double[] accountBalance = new double[250];
	        String[] accountName = new String[250];
	        for(;true;) // it is simply a infinite loop to take input untill user press quit (0) , Some compilers (with warnings turned all the way up) will complain that while(true) is a conditional statement that can never fail, whereas they are happy with for (;;)
   {
	    
	    System.out.println("\n --------Bank Admin(SOUMYA KANTI MANDAL) Menu---------- \n");
        System.out.println("plz enter a menu option here :");
        System.out.println("1. Add customer To The Bank  ");
        System.out.println("2. Change customer Name In The Bank");
        System.out.println("3. check Account Balance ");
        System.out.println("4. Modify Account Balance ");
        System.out.println("5. Summary Of All Bank Accounts");
        System.out.println("0. Quit From Here");
       
        userInput =input.nextInt();
        
      	
        if(userInput == 1)
        {
        	System.out.println("Bank customer Details ");
        	System.out.println("plz enter a account balance : ");
        	double balance =input.nextDouble();
        	accountBalance[size] = balance ;
        	System.out.println("plz enter the account name : ");
        	input.nextLine();
        	String name =input.nextLine();
        	accountName[size] = name ;
        	System.out.println("New Customer ID is :"+ size + "\n");
        	size=size+1;
        }
        else if(userInput == 2)
        {
        	System.out.println("ok, so you want to change the customer name ? ");
        	System.out.println("Plz enter the Customer ID to change the name :");
        	int index =input.nextInt();
        	System.out.println("Plz type Customer New Name :");
        	input.nextLine();
        	accountName[index] =input.nextLine();
        }
        else if(userInput == 3)
        {
        	System.out.println(" Check Your Account Balance :");
        	System.out.println("Plz enter the Customer ID to Check Balance :");
        	int index=input.nextInt(); // we name it again (index) because we use it in diffrent block otherwise we have to name it some other variable 
        	double balance =accountBalance[index];
        	System.out.println("The Customer has Rs " + balance + " In His Account \n ");
        }
        else if(userInput == 4)
        {
        	System.out.println(" Modify Your Account Balance :");
        	System.out.println("Plz enter the Customer ID to Modify Balance :");
        	int index=input.nextInt(); // we name it again (index) because we use it in diffrent block otherwise we have to name it some other variable 
        	System.out.println("plz input your new Balance  :");
        	accountBalance[index] =input.nextDouble();
        }
        else if(userInput == 5)
        {
        	System.out.println("Summary Of Bank Account Customers :");
        	double total = 0;
        	for( int i=0 ; i<size ; i++ ) 
        	    {
        		total = total +accountBalance[i];
        		System.out.println(accountName[i] + " has Rs " + accountBalance[i] + " in the Account\n");
        	    }
        	System.out.println("In Total, There is Rs " + total + " In the Bank \n \n");
        }
        else if(userInput == 0)
        {
         System.exit(0);	// exit korbe 0 press a
        }
        else 
        {
        	System.out.println("ERROR : plz Enter Correct Input ");
        }
        
              
 }
 }
}
