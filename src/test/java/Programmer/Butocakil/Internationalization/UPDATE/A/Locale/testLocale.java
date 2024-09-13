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
}
