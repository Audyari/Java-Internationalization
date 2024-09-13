package Programmer.Butocakil.Internationalization.UPDATE.A.Locale;

import org.junit.jupiter.api.Test;

import java.util.Locale;

public class testLocale {

    @Test
    void SetUpAwalLocale() {

        String language = "id";
        String country ="ID";

        Locale local = new Locale(language,country);

        System.out.println(local.getLanguage());
        System.out.println(local.getCountry());

        System.out.println(local.getDisplayLanguage());
        System.out.println(local.getDisplayCountry());


    }

    @Test
    void testLocateYgBARU() {

        Locale locale = Locale.forLanguageTag("id-ID");
        System.out.println("Language: " + locale.getLanguage());
        System.out.println("Country: " + locale.getCountry());

        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayCountry());
    }
}
