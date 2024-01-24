public class CustomerAccount {
/*
 * This class keeps track of a customer's purchases, 
 * total amount of thier purchases, and their balance.
 * Note that the balance can be negative.
*/

   //TODO 1: declare the instance variables to keep track of this customer's name, 
   //        count of the number of shirts and hats purchased as well as the total
   //        amount purchased and the balance.

   String name;
   public int shirts;
   public int hats;
   public double totalAmount;
   public double startBalance;
   public double balanceAmount;
   public double amountToAdd;
  
   /*
    * A customer account must have a name. 
    * The other variables are initialized to zero.
   */
   public CustomerAccount(String name){
     //TODO 2: Implement this method.
     this.name = name;
     shirts = 0;
     hats = 0;
     totalAmount = 0.0;
     balanceAmount = 0.0;
     
   }
   
  /*
   * A customer account must have a name, and may have a starting balance. 
   * The other variables are initialized to zero.
   */
   public CustomerAccount(String name, double startBalance){
      //TODO 3: Implement this method.
      this.name = name;
      this.balanceAmount = startBalance;
      shirts = 0;
      hats = 0;
      totalAmount = 0.0;
      
      
   }
   
    //TODO 4: Implement the following 5 "get" methods:
   /*
    * Returns the customer's name.
   */   
   public String getName(){
      return name;
   }
   
   /*
    * Returns the number of shirts purchased.
   */   
   public int getNumShirts(){
      return shirts;
   }
   
   /*
    * Returns the number of hats purchased.
   */   
   public int getNumHats(){
      return hats;
   }
   
   /*
    * Returns the total amount purchased.
   */   
   public double getTotalAmtPurchased(){
      return totalAmount;
   }
   
   /*
    * Returns the balance.
   */   
   public double getBalance(){
      return balanceAmount;
   }
   
   /*
    * The customer's balance is increased by the amount passed in.
   */
   public void addToBalance(double amountToAdd){
         //TODO 5: Implement this method.
         balanceAmount = balanceAmount + amountToAdd;    
   }
   
   /*
    * Supports the purchase of a number of shirts at a unit price.
    * The number of shirts, total amount and balance are updated.
   */
   public void purchaseShirt(int numShirts, double unitPrice){
      //TODO 6: Implement this method.
      shirts = numShirts;
      totalAmount = totalAmount + (shirts * unitPrice);
      balanceAmount = balanceAmount -  totalAmount;
   }

   /*
    * Supports the purchase of a number of hats at a unit price.
    * The number of hats, total amount and balance are updated.
   */   
   public void purchaseHat(int numHats, double unitPrice){
      //TODO 7: Implement this method.
      hats = numHats;
      totalAmount = totalAmount + (hats * unitPrice);
      balanceAmount = balanceAmount - totalAmount;
   }
}