package rentalstore;

public class ChildrenStrategy extends PriceStrategy {
    private int priceCode;

    public ChildrenStrategy(int priceCode) {
        this.priceCode = priceCode;
    }

    @Override
    public int getPriceCode() {
        return priceCode;
    }

    @Override
    public double getAmount(int dayRented) {
        boolean day_more_than_3 = dayRented > 3;
        return day_more_than_3?(dayRented - 3) * 1.5+1.5:1.5;
    }
}
