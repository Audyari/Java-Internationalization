package Programmer.Butocakil.Internationalization.ResourceBundle;

import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest {

    @Test
    void testResourceBundle() {

        ResourceBundle resourceBundle = ResourceBundle.getBundle("message");

        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));

    }

    @Test
    void testResourceBundleIndonesia() {

        var indonesia = new Locale("id", "ID");
        var resourceBundle = ResourceBundle.getBundle("message", indonesia);

        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));

    }

    @Test
    void testResourceBundleNotFound() {

        var indonesia = new Locale("en", "US");
        var resourceBundle = ResourceBundle.getBundle("message", indonesia);

        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));

    }

    @Test
    void testResourceBundleMultipleTimes() {

        var indonesia = new Locale("en", "US");
        var resourceBundle1 = ResourceBundle.getBundle("message", indonesia);
        var resourceBundle2 = ResourceBundle.getBundle("message", indonesia);

        System.out.println(resourceBundle1 == resourceBundle2);
    }
}