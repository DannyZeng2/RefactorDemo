package rentalstore;

public class RegularStrategy extends PriceStrategy {
    private int priceCode;
    public RegularStrategy(int priceCode) {
        this.priceCode = priceCode;
    }

    @Override
    public int getPriceCode() {
        return priceCode;
    }
    @Override
    public double getAmount(int dayRented) {
        boolean day_more_than_2 = dayRented > 2;
        return day_more_than_2?(dayRented - 2) * 1.5+2:2;
    }
}
