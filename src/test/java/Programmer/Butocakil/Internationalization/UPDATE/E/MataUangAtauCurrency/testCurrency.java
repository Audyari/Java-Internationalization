package Programmer.Butocakil.Internationalization.UPDATE.E.MataUangAtauCurrency;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class testCurrency {
    @Test
    void BasicPenggunaanCurrency() {

        Locale localeIndonesia = new Locale("in","ID");

        Currency currency = Currency.getInstance(localeIndonesia);

        System.out.println(currency.getCurrencyCode());
        System.out.println(currency.getDisplayName());
        System.out.println(currency.getSymbol(localeIndonesia));

    }

    @Test
    void FormatCurrencydiNumberFormat() {

        Locale localeIndonesia = new Locale("in","ID");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeIndonesia);

        String format = numberFormat.format(1_000_000.255);

        System.out.println(format);

    }

    @Test
    void UpdateFormatNumber() {

        Locale localeIndonesia = new Locale("in","ID");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeIndonesia);

        String format = numberFormat.format(1_000_000.255);

        // Ganti simbol mata uang dengan spasi
        String formattedWithSpace = format.replace("Rp", "Rp.");

        System.out.println(formattedWithSpace);

    }

    @Test
    void ParsingCurrency() {

        Locale localeIndonesia = new Locale("in", "ID");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeIndonesia);

        try {
            double value = numberFormat.parse("Rp1.000.000,26").doubleValue();
            System.out.println(value);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
