package Programmer.Butocakil.Internationalization.UPDATE.G.MessageFormatType;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatType {

    @Test
    void MessageFormatType() {

        Locale locale = Locale.forLanguageTag("id-ID");

        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", locale);

        String pattern = resourceBundle.getString("status");

        MessageFormat messageFormat = new MessageFormat(pattern, locale);

        String format = messageFormat.format(new Object[]{"AUDYARI W", new Date(), 10000});

        String formattedWithSpace = format.replace("Rp", "Rp.");

        System.out.println(formattedWithSpace);

    }

    @Test
    void testYgLain() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message");

        String pattern = resourceBundle.getString("status");

        MessageFormat messageFormat = new MessageFormat(pattern);

        String format = messageFormat.format(new Object[]{"AUDYARI W", new Date(), 10000});

        System.out.println(format);

    }
}
