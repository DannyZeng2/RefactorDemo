package rentalstore;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;

    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }


    public String statement() {
        String result = "Rental Record for " + getName() + "\n";
        for (Rental each : this.rentals) {

            result += "\t" + each.getMovie().getTitle() + "\t" + each.getAmount() + "\n";
        }

        //add footer lines
        result += "Amount owed is " + getTotalAmount() + "\n";
        result += "You earned " + getTotalFrequentRenterPoints() + " frequent renter points";
        return result;
    }

    public String htmlStatement() {
        String result = "<H1>Rentals for <EM>" + getName() + "</EM></H1><P>\n";
        for (Rental each : this.rentals) {

            result += each.getMovie().getTitle() + ":" + each.getAmount() + "<BR>\n";
        }

        //add footer lines
        result += "<P>You owe<EM>" + getTotalAmount() + "</EM><P>\n";
        result += "On this rental you earned <EM>"  + getTotalFrequentRenterPoints() + "</EM> frequent renter points<P>";
        return result;
    }

    protected double getTotalAmount() {
        return this.rentals.stream().mapToDouble(Rental::getAmount).sum();
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    protected int getTotalFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (Rental rental:this.rentals) {
            frequentRenterPoints += rental.getFrequentRenterPoints();
        }
        return frequentRenterPoints;
    }



}
