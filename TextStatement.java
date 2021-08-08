public class TextStatement extends Statement {
    public String getTitle(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    public String getRental(Rental movie) {
        return "\t" + movie.getMovie().getTitle() + "\t" + String.valueOf(movie.getCharge()) + "\n";
    }

    public String getAmountOwed(Customer aCustomer) {
        return "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n";
    }

    public String getFrequentRenterPoints(Customer aCustomer) {
        return "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + " frequent renter points";
    }
}