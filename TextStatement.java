import java.util.Enumeration;

public class TextStatement extends Statement {
   public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = getTitle(aCustomer);
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for this rental
         result += getRental(each);
      }
      //add footer lines
      result += getAmountOwed(aCustomer);
      result += getFrequentRenterPoints(aCustomer);
      return result;
   }

    private String getTitle(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    private String getRental(Rental movie) {
        return "\t" + movie.getMovie().getTitle() + "\t" + String.valueOf(movie.getCharge()) + "\n";
    }

    private String getAmountOwed(Customer aCustomer) {
        return "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n";
    }

    private String getFrequentRenterPoints(Customer aCustomer) {
        return "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + " frequent renter points";
    }   
}