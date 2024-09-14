package Programmer.Butocakil.Internationalization.UPDATE.F.MessageFormat;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatdanResourceBundle {


    @Test
    void testingMessageFormat() {

        Locale localeIndonesia = new Locale("id", "ID");

        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", localeIndonesia);

        String pattern = resourceBundle.getString("welcome.message");

        MessageFormat messageFormat = new MessageFormat(pattern);

        String format = messageFormat.format(new Object[]{"AUDY", "JAKARTA"});

        System.out.println(format);


    }

    @Test
    void testingMessageSourceBundle() {

        ResourceBundle resourceBundle = ResourceBundle.getBundle("message");

        String pattern = resourceBundle.getString("welcome.message");

        MessageFormat messageFormat = new MessageFormat(pattern);

        String format = messageFormat.format(new Object[]{"AUDY", "JAKARTA"});

        System.out.println(format);

    }

}
