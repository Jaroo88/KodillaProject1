package exercise.operatory;

public class OperatorExercise {
    public static void main(String[] args) {


        int liczbaA = 15;               //deklaracja zmiennej
        int liczbaB = 5;                //deklaracja zmiennej 2

        boolean result;                 //deklaracja rezultatu typu boolean true/false

        result = liczbaA < liczbaB;     //porównujemy zmienne
        System.out.println(result);     //wyswietlamy rezultat

        result = liczbaA > liczbaB;
        System.out.println(result);

        result = liczbaA == liczbaB;
        System.out.println(result);

        result = liczbaA != liczbaB;
        System.out.println(result);

        result = liczbaA <= liczbaB;
        System.out.println(result);

        result = liczbaA >= liczbaB;
        System.out.println(result);

        boolean result1 = liczbaA < liczbaB;
        boolean result2 = liczbaA > liczbaB;
        boolean result3 = liczbaA == liczbaB;

//koniunkcja czyli wynik true gdy oba wyniki są true
        System.out.println("koniunkcja");
        boolean resultKoniunkcja;
        resultKoniunkcja = result1 && result2;
        System.out.println(resultKoniunkcja);
        resultKoniunkcja = result2 && result;
        System.out.println(resultKoniunkcja);
        resultKoniunkcja = result1 && result3;
        System.out.println(resultKoniunkcja);
//Alternatywa gdy jeden z wyników jest true
        System.out.println("Alternatywa");
        boolean resultAlternatywa;
        resultAlternatywa = result1 || result2;
        System.out.println(resultAlternatywa);
        resultAlternatywa = result1 || result3;
        System.out.println(resultAlternatywa);

        System.out.println("End");
    }
}
