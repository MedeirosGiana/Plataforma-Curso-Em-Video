package curso.em.video;

import java.util.Locale;

public class IdiomaSistema {
    public static void main(String[] args) {

        Locale idiomaSistema = new Locale("Portugues", "PT");
        System.out.println("Seu idioma esta em " + idiomaSistema.getDisplayLanguage());

    }
}
