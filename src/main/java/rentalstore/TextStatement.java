//package rentalstore;
//
//public class TextStatement extends Statement {
//
//    public static String statement(Customer customer) {
//
//        String result = getHeader(customer);
//
//        String eachRental = getEachRental(customer);
//
//        String footer = getFooter(customer, result);
//
//        return result + eachRental +footer;
//    }
//
//
//    public String getEachRental(Customer customer) {
//        String result = "";
//        for (Rental each : customer.getRentals()) {
//
//            result += "\t" + each.getMovie().getTitle() + "\t" + each.getAmount() + "\n";
//        }
//        return result;
//    }
//
//
//    public String getHeader(Customer customer) {
//        return "Rental Record for " + customer.getName() + "\n";
//    }
//
//    public String getFooter(Customer customer, String result) {
//        result += "Amount owed is " + customer.getTotalAmount() + "\n";
//        result += "You earned " + customer.getTotalFrequentRenterPoints() + " frequent renter points";
//        return result;
//    }
//}
