package desafios04;

import java.util.Locale;

public class LinguagemSistema {
    public static void main(String[] args) {
        Locale defaultLocale = Locale.getDefault();
        String displayLanguage = defaultLocale.getDisplayLanguage();
        System.out.println("Linguagem do display: " + displayLanguage);
    }
}
