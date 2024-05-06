package exercise.loop;

public class LoopExercise {
    public static void main(String[] args) {
//Petla for
        for (int a = 1; a <= 10; a++) {                  // w nawiasie implementujemy nazwe zmiennej i od której liczby ma się zaczynć a potem ile razy ma ta pętla się wykonć i ddawanie
            System.out.println("Takie tam " + a);   //napis który ma się wyswietlać + numer petli
        }
        System.out.println();
        String[] array = {"a", "b", "c", "d", "e"};
        for (String element : array) {
            System.out.println("Element: " + element);
            if (element.equals("c")) {
                break;
            }
        }
        System.out.println();

        //Petla while
        int b = 1;                                  //implementujemy zmienna
        while (b <= 10) {                           //implementujemy warunek
            System.out.println("Coś tam " + b);     //wypisujemy tekst który ma sie powtarzac
            b++;                                    //implementujemy warunek dodawania
        }
        System.out.println();
        //petla do while
        int c = 1;                                  //zmienna inicjalna
        do {                                        //petla i otwieramy ciało petli
            System.out.println("Jeszcze coś tam " + c); // tekst który ma sie wyswietlic
            c++;                                        // +1
        }
        while (c <= 10);                                // warunek do kiedy petla ma się wykonywać


    }
}


