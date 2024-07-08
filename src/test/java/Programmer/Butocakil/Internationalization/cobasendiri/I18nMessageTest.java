package Programmer.Butocakil.Internationalization.cobasendiri;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class I18nMessageTest {
    private final ResourceBundle resourceBundle = ResourceBundle.getBundle("message_in_ID", new Locale("in", "ID"));

    @Test
    void testHello() {
        String hello = resourceBundle.getString("hello");
        Assertions.assertEquals("Halo", hello);
        System.out.println(hello);
    }

    @Test
    void testGoodbye() {
        String goodbye = resourceBundle.getString("goodbye");
        Assertions.assertEquals("Selamat Tinggal", goodbye);
        System.out.println(goodbye);
    }

    @Test
    void testWelcomeMessage() {
        String name = "John Doe";
        String appName = "MyApp";
        String welcomeMessage = MessageFormat.format(resourceBundle.getString("welcome.message"), name, appName);
        Assertions.assertEquals("Halo John Doe, Selamat datang di MyApp", welcomeMessage);
        System.out.println(welcomeMessage);
    }


}