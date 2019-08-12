package rentalstore;

abstract class PriceStrategy {

    abstract int getPriceCode();
    abstract double getAmount(int dayRented);

}
