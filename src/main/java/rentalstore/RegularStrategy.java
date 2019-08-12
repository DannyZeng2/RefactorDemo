package rentalstore;

public class RegularStrategy extends PriceStrategy {
    @Override
    int getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    double getMount() {
        return 0;
    }
}
