import java.util.Enumeration;

public class HtmlStatement extends Statement {
   public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = getTitle(aCustomer);
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for each rental
        result += getRental(each);
      }

      //add footer lines
      result += getAmountOwed(aCustomer);
      result += getFrequentRenterPoints(aCustomer);
      return result;
   }

    private String getTitle(Customer aCustomer) {
        return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
    }

    private String getRental(Rental movie) {
        return movie.getMovie().getTitle() + ": " + String.valueOf(movie.getCharge()) + "<BR>\n";
    }

    private String getAmountOwed(Customer aCustomer) {
        return "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
    }

    private String getFrequentRenterPoints(Customer aCustomer) {
        return "On this rental you earned <EM>" + String.valueOf(aCustomer.getTotalFrequentRenterPoints())
                + "</EM> frequent renter points<P>";
    }   
}