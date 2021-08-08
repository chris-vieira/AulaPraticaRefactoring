import java.util.Enumeration;

public abstract class Statement {
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = getTitle(aCustomer);
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += getRental(each);
        }
        result += getAmountOwed(aCustomer);
        result += getFrequentRenterPoints(aCustomer);
        return result;
    }

    public abstract String getTitle(Customer aCustomer);

    public abstract String getRental(Rental rental);

    public abstract String getAmountOwed(Customer aCustomer);

    public abstract String getFrequentRenterPoints(Customer aCustomer);
}