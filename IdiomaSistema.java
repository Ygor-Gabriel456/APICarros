import java.util.Locale;

public class IdiomaSistema {
    public static void main(String[] args) {
        Locale idioma = new Locale("PORTUGUES-PT");
        System.out.println("A linguagem do seu sistema operacional e..." + idioma.getDisplayLanguage());
    }
}
