package Programmer.Butocakil.Internationalization.I18NdiNumber;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {

    @Test
    void testNumberFormat() {
        var numberFormat = NumberFormat.getInstance();
        var format = numberFormat.format(10000000.255);
        System.out.println(format);
    }

    @Test
    void testNumberFormatIndonesia() {
        var indonesia = new Locale("in", "ID");
        var numberFormat = NumberFormat.getInstance(indonesia);
        var format = numberFormat.format(10000000.255);
        System.out.println(format);
    }

    @Test
    void testNumberFormatParseIndonesia() {
        var indonesia = new Locale("in", "ID");
        var numberFormat = NumberFormat.getInstance(indonesia);

        try {
            var result = numberFormat.parse("10.000.000,255").doubleValue();
            System.out.println(result);
        } catch (ParseException e) {
            System.out.println("Error parse : " + e.getMessage());
        }
    }

    @Test
    void testNumberFormatIndonesiaa() {
        Locale indonesia = new Locale("in", "ID");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(indonesia);
        String format = numberFormat.format(10000000.255);
        System.out.println(format); // Output: Rp 10.000.000,26
    }

    @Test
    void testNumberFormatParseIndonesiaa() {
        Locale indonesia = new Locale("in", "ID");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(indonesia);

        try {
            double result = numberFormat.parse("Rp 10.000.000,255").doubleValue();
            System.out.println(result); // Output: 10000000.255
        } catch (ParseException e) {
            System.out.println("Error parse : " + e.getMessage());
        }
    }

}