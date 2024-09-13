package Programmer.Butocakil.Internationalization.UPDATE.C.DatedanTime;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FormatmenggunakanDateFormat {

    @Test
    void testmenggunakanDateFormat() {


        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE d MMMM yyyy");

        String format = dateFormat.format(new Date());

        System.out.println(format);
    }

    @Test
    void testDateIndonesia() {

        Locale locale = Locale.forLanguageTag("id-ID");

        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE d MMMM yyyy", locale);

        String format = dateFormat.format(new Date());

        System.out.println(format);


    }

    @Test
    void ParsingmenggunakanDateFormat() {

        Locale locale = Locale.forLanguageTag("id-ID");
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE d MMMM yyyy", locale);

        try {
            // Parsing string tanggal
            Date date = dateFormat.parse("Kamis 13 September 2024");

            // Mengformat kembali ke string
            SimpleDateFormat outputFormat = new SimpleDateFormat("EEEE d MMMM yyyy", locale);
            String formattedDate = outputFormat.format(date);
            System.out.println("Formatted Date: " + formattedDate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}


