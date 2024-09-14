package Programmer.Butocakil.Internationalization.UPDATE.H.ChoiceFormat;

import org.junit.jupiter.api.Test;

import java.text.ChoiceFormat;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class testFormatChoice {

    @Test
    void testChoiceFormat() {

        String pattern = "-1#negatif | 0#kosong | 1#satu | 1<banyak";
        ChoiceFormat choiceFormat = new ChoiceFormat(pattern);

        String format = choiceFormat.format(10);

        System.out.println(format);
    }

    @Test
    void ChoiceFormatdiMessageFormat() {

        Locale localeIndonesia = Locale.forLanguageTag("id-ID");

        ResourceBundle resourceBundle = ResourceBundle.getBundle("message",localeIndonesia);

        String pattern = resourceBundle.getString("balance");

        MessageFormat messageFormat = new MessageFormat(pattern,localeIndonesia);

        String format = messageFormat.format(new Object[]{100_000_000});

        System.out.println(format);

    }
}
