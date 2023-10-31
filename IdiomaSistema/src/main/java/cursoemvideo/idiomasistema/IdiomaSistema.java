package cursoemvideo.idiomasistema;

import java.util.Locale;

public class IdiomaSistema {

    public static void main(String[] args) {
    
    Locale idioma = Locale.getDefault();
        System.out.print("O idioma deste Sistema Operacional esta em: ");
        System.out.println(idioma.getDisplayLanguage());
    }
}
