package models;
import java.util.Enumeration;
import java.util.Vector;

public class Customer {
   private String _name;
   private Vector _rentals = new Vector();

   public Customer (String name){
      _name = name;
   }

   public void addRental(Rental arg) {
      _rentals.addElement(arg);
   }
   
   public String getName (){
      return _name;
   }
  
  public String statement() {
     double totalAmount = 0;
     int frequentRenterPoints = 0;
     Enumeration rentals = _rentals.elements();
     String result = "Rental Record for " + getName() + "\n";
     while (rentals.hasMoreElements()) {
        double thisAmount = 0;
        Rental aRental = (Rental) rentals.nextElement();
        thisAmount = each.getCharge();

        // add frequent renter points
        frequentRenterPoints ++;
        // add bonus for a two day new release rental
        if ((aRental.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
            aRental.getDaysRented() > 1) frequentRenterPoints ++;

        //show figures for this rental
        result += "\t" + aRental.getMovie().getTitle()+ "\t" +
            String.valueOf(each.getCharge()) + "\n";
        totalAmount += each.getCharge();

     }
     //add footer lines
     result +=  "Amount owed is " + String.valueOf(totalAmount) + "\n";
     result += "You earned " + String.valueOf(frequentRenterPoints) +
             " frequent renter points";
     return result;
   }

}