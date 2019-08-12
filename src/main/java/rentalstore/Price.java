package rentalstore;

public class Price {
    public static double getThisAmount(Rental each, double thisAmount, double i, int i2) {
        thisAmount += i;
        if (each.getDayRented() > i2) {
            thisAmount += (each.getDayRented() - i2) * 1.5;
        }
        return thisAmount;
    }

}
