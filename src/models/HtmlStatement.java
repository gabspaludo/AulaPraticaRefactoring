package models;
import java.util.Enumeration;
public class HtmlStatement extends Statement {
    @Override
    protected String headerString(Customer aCustomer) {
        return "<h1>Rentals for <em>" + aCustomer.getName() + "</em></h1><p>\n";
    }

    @Override
    protected String rentalString(Rental rental) {
        return rental.getMovie().getTitle() + ": " + 
               String.valueOf(rental.getCharge()) + "<br>\n";
    }

    @Override
    protected String footerString(Customer aCustomer) {
        return "<p>You owe <em>" + String.valueOf(aCustomer.getTotalCharge()) + "</em></p>\n" +
               "<p>On this rental you earned <em>" + 
               String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + 
               "</em> frequent renter points</p>";
    }
}