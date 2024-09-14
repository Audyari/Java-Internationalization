package Programmer.Butocakil.Internationalization.UPDATE.F.MessageFormat;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;

public class MembuatMessageFormat {

    @Test
    void tesingMembuatMessageFormat() {

        String pattern = "nama kamu {0} Ya, Pekerjaan kamu {1} ya";
        MessageFormat messageFormat = new MessageFormat(pattern);
        String format = messageFormat.format(new Object[]{"AUDY","Proggrammer"});

        System.out.println(format);

    }
}
