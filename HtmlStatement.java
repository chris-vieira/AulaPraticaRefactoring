public class HtmlStatement extends Statement {
    public String getTitle(Customer aCustomer) {
        return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
    }

    public String getRental(Rental movie) {
        return movie.getMovie().getTitle() + ": " + String.valueOf(movie.getCharge()) + "<BR>\n";
    }

    public String getAmountOwed(Customer aCustomer) {
        return "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
    }

    public String getFrequentRenterPoints(Customer aCustomer) {
        return "On this rental you earned <EM>" + String.valueOf(aCustomer.getTotalFrequentRenterPoints())
                + "</EM> frequent renter points<P>";
    }
}