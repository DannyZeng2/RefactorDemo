package rentalstore;

public class Rental {
    private Movie movie;
    private int dayRented;
    private int frequentRenterPoints = 0;

    public Rental(Movie movie, int dayRented) {
        this.movie = movie;
        this.dayRented = dayRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDayRented() {
        return dayRented;
    }

    double getAmount() {
        double thisAmount = 0;

        switch (getMovie().getPriceCode()) {
            case form_template_method.Movie.REGULAR:
                thisAmount = getPrice(2, 2,1.5);
                break;
            case form_template_method.Movie.NEW_RELEASE:
                thisAmount += getPrice(0, 0,3);
                break;
            case form_template_method.Movie.CHILDRENS:
                thisAmount = getPrice(1.5, 3,1.5);
                break;
        }
        return thisAmount;
    }
    private double getPrice(double originPrice, int baseDay,double rate) {
        double result = 0;
        result += originPrice;
        if (this.getDayRented() > baseDay) {
            result += (this.getDayRented() - baseDay) * rate;
        }
        return result;
    }


    int getFrequentRenterPoints() {
        //add frequent renter points
        frequentRenterPoints++;
        //add bonus for a two day new release rental
        if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDayRented() > 1) {
            frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }
}
