package rentalstore;

public class NewReleaseStrategy extends PriceStrategy {
    private int priceCode;
    public NewReleaseStrategy(int priceCode) {
        this.priceCode = priceCode;
    }

    @Override
    public int getPriceCode() {
        return priceCode;
    }

    @Override
    public double getAmount(int dayRented) {
        return dayRented* 3;
    }
}
