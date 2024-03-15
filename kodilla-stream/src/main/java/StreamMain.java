import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Upiększacz", text -> "ABC" + text + "ABC");

        poemBeautifier.beautify("Upiększacz", String::toUpperCase);

        poemBeautifier.beautify("Upiększacz", text -> text + " :)");

        poemBeautifier.beautify("Upiększacz", text -> text.replace("z", "Z"));
    }
}
