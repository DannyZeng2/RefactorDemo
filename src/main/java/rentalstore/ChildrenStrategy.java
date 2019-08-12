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
        return dayRented > 3?(dayRented - 3) * 1.5+1.5:1.5;
    }
}
