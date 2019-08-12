package form_template_methon_2;

import form_template_method.Customer;
import form_template_method.Movie;
import form_template_method.Rental;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {



    private Customer customer  = new Customer("Danny");

    @Test
    public void should_return_a_statement_when_rentals_is_null() {
        String statement = customer.statement();
        assertEquals("Rental Record for Danny\nAmount owed is 0.0\nYou earned 0 frequent renter points", statement);
    }

    @Test
    public void should_return_a_htmlStatement_when_rentals_is_null() {
        String statement = customer.htmlStatement();
        assertEquals("<H1>Rentals for <EM>Danny</EM></H1><P>\n" +
                "<P>You owe<EM>0.0</EM><P>\n" +
                "On this rental you earned <EM>0</EM> frequent renter points<P>", statement);
    }

    @Test
    public void should_return_a_statement_when_rent_for_1_day() {
        Movie movie = new Movie("Spider Man",0);
        Rental rental = new Rental(movie,1);
        customer.addRental(rental);
        String statement = customer.statement();
        assertEquals("Rental Record for Danny\n" +
                "\tSpider Man\t2.0\n" +
                "Amount owed is 2.0\n" +
                "You earned 1 frequent renter points", statement);
    }

    @Test
    public void should_return_a_statement_when_rent_for_5_day_and_price_is_0() {
        Movie movie = new Movie("Spider Man",0);
        Rental rental = new Rental(movie,5);
        customer.addRental(rental);
        String statement = customer.statement();
        assertEquals("Rental Record for Danny\n" +
                "\tSpider Man\t6.5\n" +
                "Amount owed is 6.5\n" +
                "You earned 1 frequent renter points", statement);
    }

    @Test
    public void should_return_a_statement_when_rent_for_5_day_and_price_is_1() {
        Movie movie = new Movie("Spider Man",1);
        Rental rental = new Rental(movie,5);
        customer.addRental(rental);
        String statement = customer.statement();
        assertEquals("Rental Record for Danny\n" +
                "\tSpider Man\t15.0\n" +
                "Amount owed is 15.0\n" +
                "You earned 2 frequent renter points", statement);
    }

    @Test
    public void should_return_a_statement_when_rent_for_5_day_and_price_is_2() {
        Movie movie = new Movie("Spider Man",2);
        Rental rental = new Rental(movie,5);
        customer.addRental(rental);
        String statement = customer.statement();
        assertEquals("Rental Record for Danny\n" +
                "\tSpider Man\t4.5\n" +
                "Amount owed is 4.5\n" +
                "You earned 1 frequent renter points", statement);
    }


    @Test
    public void should_return_a_htmlStatement_when_rent_for_1_day() {
        Movie movie = new Movie("Spider Man",0);
        Rental rental = new Rental(movie,1);
        customer.addRental(rental);
        String statement = customer.htmlStatement();
        assertEquals("<H1>Rentals for <EM>Danny</EM></H1><P>\n" +
                "Spider Man: 2.0<BR>\n" +
                "<P>You owe<EM>2.0</EM><P>\n" +
                "On this rental you earned <EM>1</EM> frequent renter points<P>", statement);
    }

    @Test
    public void should_return_a_htmlStatement_when_rent_for_5_day_and_price_is_0() {
        Movie movie = new Movie("Spider Man",0);
        Rental rental = new Rental(movie,5);
        customer.addRental(rental);
        String statement = customer.htmlStatement();
        assertEquals("<H1>Rentals for <EM>Danny</EM></H1><P>\n" +
                "Spider Man: 6.5<BR>\n" +
                "<P>You owe<EM>6.5</EM><P>\n" +
                "On this rental you earned <EM>1</EM> frequent renter points<P>", statement);
    }

    @Test
    public void should_return_a_htmlStatement_when_rent_for_5_day_and_price_is_1() {
        Movie movie = new Movie("Spider Man",1);
        Rental rental = new Rental(movie,5);
        customer.addRental(rental);
        String statement = customer.htmlStatement();
        assertEquals("<H1>Rentals for <EM>Danny</EM></H1><P>\n" +
                "Spider Man: 15.0<BR>\n" +
                "<P>You owe<EM>15.0</EM><P>\n" +
                "On this rental you earned <EM>2</EM> frequent renter points<P>", statement);
    }






}
