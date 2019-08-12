package rentalstore;

public class ChildrenStrategy extends PriceStrategy {
    @Override
    int getPriceCode() {
        return Movie.CHILDRENS;
    }

    @Override
    double getMount() {
        return 0;
    }
}
