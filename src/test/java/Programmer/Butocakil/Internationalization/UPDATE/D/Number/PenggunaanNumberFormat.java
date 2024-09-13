package Programmer.Butocakil.Internationalization.UPDATE.D.Number;

import org.junit.jupiter.api.Test;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Locale;

public class PenggunaanNumberFormat {
    @Test
    void BasicNumberFormat() {

        NumberFormat numberformat = NumberFormat.getInstance();
        String format = numberformat.format(10_000_000.255);

        System.out.println(format);


    }

    @Test
    void testNumberDiIndonesia() {

        Locale localeIndonesia = Locale.forLanguageTag("id-ID");
        NumberFormat numberformat = NumberFormat.getInstance(localeIndonesia);
        String format = numberformat.format(10_000_000.255);

        System.out.println(format);


    }

    @Test
    void PenggunaanParseDiNumber() {

        Locale localeIndonesia = Locale.forLanguageTag("id-ID");
        NumberFormat numberformat = NumberFormat.getInstance(localeIndonesia);

     try {
         Double number = numberformat.parse("10.000.000,255").doubleValue();
            System.out.println(number);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
