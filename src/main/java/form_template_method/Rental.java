package form_template_method;

public class Rental {
    private Movie movie;
    private int dayRented;

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

    public double getCharge() {
        double result = 0;

        switch (this.getMovie().getPriceCode()) {

            case Movie.REGULAR:
                result = getPrice(2, 2,1.5);
                break;
            case Movie.NEW_RELEASE:
                result += getPrice(0, 0,3);
                break;
            case Movie.CHILDRENS:
                result = getPrice(1.5, 3,1.5);
                break;
        }
        return result;
    }

    private double getPrice(double originPrice, int baseDay,double rate) {
        double result = 0;
        result += originPrice;
        if (this.getDayRented() > baseDay) {
            result += (this.getDayRented() - baseDay) * rate;
        }
        return result;
    }

    int getFrequentRentalPoints() {
        if ((this.getMovie().getPriceCode() == Movie.NEW_RELEASE) && this.getDayRented() > 1) {
            return 2;
        } else {
            return 1;
        }
    }
}
