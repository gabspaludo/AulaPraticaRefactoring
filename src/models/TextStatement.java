package models;
import java.util.Enumeration;
public class TextStatement extends Statement {
    @Override
    protected String headerString(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    @Override
    protected String rentalString(Rental rental) {
        return "\t" + rental.getMovie().getTitle() + "\t" +
                String.valueOf(rental.getCharge()) + "\n";
    }

    @Override
    protected String footerString(Customer aCustomer) {
        return "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n" +
               "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + 
               " frequent renter points";
    }
}