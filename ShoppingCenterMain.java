import java.util.Scanner;
/*
 * This class manages the UMass Shop application. It handles the interaction
 * between a customer and the program. It uses an instance of CustomerAccount
 * to keep track of the customer's purchases and their balance.
 */
public class ShoppingCenterMain{
   
   public static void main(String[] args){
   
         System.out.println("Welcome to the UMass Shop!");
         Scanner scan = new Scanner(System.in);
         CustomerAccount account = null;
         
         boolean keepGoing = true;
         String inputStr = "";
         double result = 0.00;
         
         while(keepGoing) {
              System.out.println("Main Menu:");
              System.out.println("Enter N to create a new account."); 
              System.out.println("Enter P to print account information."); 
              System.out.println("Enter A to add to balance.");
              System.out.println("Enter S to purchase shirts."); 
              System.out.println("Enter H to purchase hats."); 
              System.out.println("Enter X to quit.");
              System.out.println("");
              inputStr = scan.nextLine();
              
              if (inputStr.equalsIgnoreCase("N")){
                 System.out.println("Enter account name: ");
                 String name = scan.nextLine();
                 System.out.println("Enter account starting balance, return if no starting balance: ");
                 inputStr = scan.nextLine();
                 if(inputStr.length()>0) {
                    result = Double.parseDouble(inputStr);
                    account = new CustomerAccount(name, result);
                 }
                 else
                    account = new CustomerAccount(name); 
                 System.out.println("Account created for "+name);
              }
              else if (inputStr.equalsIgnoreCase("P")){
                 if(account==null)
                    System.out.println("No account has been created.");
                 else {
                   String infoStr = "Name: "+account.getName()+
                   " shirts: "+account.getNumShirts()+
                   ", hats: "+account.getNumHats()+", total amt purchased: "+
                   account.getTotalAmtPurchased()+", balance: "+account.getBalance();
                    System.out.println(infoStr);  
                 }            }              
              else if (inputStr.equalsIgnoreCase("A")){
                 if(account==null)
                    System.out.println("No account has been created.");
                 else {                
                    System.out.println("Enter amount to add: ");
                    inputStr = scan.nextLine();
                    result = Double.parseDouble(inputStr);
                    account.addToBalance(result);
                    System.out.println(inputStr+" added to balance.");
                 }
              }
              else if (inputStr.equalsIgnoreCase("S")){
                 if(account==null)
                    System.out.println("No account has been created.");
                 else {                
                    System.out.println("Enter number of shirts: ");
                    inputStr = scan.nextLine();
                    int num = Integer.parseInt(inputStr);                 
                    System.out.println("Enter unit price: ");
                    inputStr = scan.nextLine();
                    result = Double.parseDouble(inputStr);  
                    account.purchaseShirt(num, result);              
                    System.out.println(num+" shirts purchased at "+result+" each.");
                 }
              }
              
              else if (inputStr.equalsIgnoreCase("H")){
                 if(account==null)
                    System.out.println("No account has been created.");
                 else {                
                    System.out.println("Enter number of hats: ");
                    inputStr = scan.nextLine();
                    int num = Integer.parseInt(inputStr);                 
                    System.out.println("Enter unit price: ");
                    inputStr = scan.nextLine();
                    result = Double.parseDouble(inputStr);  
                    account.purchaseHat(num, result);               
                    System.out.println(num+" hats purchased at "+result+" each.");
                 }
              }                                  
              else if(inputStr.equalsIgnoreCase("X")){
                 keepGoing = false;
              }
              else
                 System.out.println("Unrecognized input.");
              System.out.println("");               
         }
         System.out.println("Bye for now- go UMass!!!");
         scan.close();
    }

}