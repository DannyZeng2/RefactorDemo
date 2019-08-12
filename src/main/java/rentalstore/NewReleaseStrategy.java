package rentalstore;

public class NewReleaseStrategy extends PriceStrategy {
    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    double getMount() {
        return 0;
    }
}
