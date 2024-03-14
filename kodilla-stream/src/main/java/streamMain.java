import com.kodilla.stream.beautifier.PoemBeautifier;

public class streamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        // Upiększacz dodający "ABC" na początku i na końcu tekstu
        poemBeautifier.beautify("Upiększacz", text -> "ABC" + text + "ABC");

        // Upiększacz zamieniający tekst na duże litery
        poemBeautifier.beautify("Upiększacz", String::toUpperCase);

        // Własny upiększacz 1: dodanie emotikonki na końcu tekstu
        poemBeautifier.beautify("Upiększacz", text -> text + " :)");

        // Własny upiększacz 2: zamiana każdego "e" na "E"
        poemBeautifier.beautify("Upiększacz", text -> text.replace("z", "Z"));
    }
}
