package Programmer.Butocakil.Internationalization.UPDATE.B.ResourceBundle;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class SatuTestPropertis {

    @Test
    void testPropertis() {

        Properties propertis = new Properties();

        try (InputStream input = getClass().getClassLoader().getResourceAsStream("message.properties")) {
            if (input == null) {
                System.out.println("File properties tidak ditemukan di classpath");
                return;
            }

            propertis.load(input);
            System.out.println(propertis.getProperty("hello"));
            System.out.println(propertis.getProperty("goodbye"));

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    @Test
    void testPropertiPJN() {

        ResourceBundle resourceBundle = ResourceBundle.getBundle("message");

        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));
    }

    @Test
    void testPanggilPropertisIndonesia() {

        Locale indonesia = new Locale("id", "ID");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", indonesia);

        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));

    }

    @Test
    void testResourceBundleNotFound() {

        Locale English = new Locale("en", "US");

        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", English);

        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));
    }

    @Test
    void ObjeknyasamaJadiAMAN() {

        Locale indonesia = new Locale("id", "ID");
        ResourceBundle resourceBundle1 = ResourceBundle.getBundle("message", indonesia);
        ResourceBundle resourceBundle2 = ResourceBundle.getBundle("message", indonesia);

        System.out.println(resourceBundle1.equals(resourceBundle2));

        System.out.println(resourceBundle1 == resourceBundle2);

    }
}
