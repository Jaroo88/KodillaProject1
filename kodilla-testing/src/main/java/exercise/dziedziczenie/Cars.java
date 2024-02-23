package exercise.dziedziczenie;

public class Cars {
//Składowe:
    String marka;
    String model;
    String kolor;
    int waga;
//Konstruktor
    Cars(String marka, String model,String kolor, int waga){
        this.marka = marka;
        this.model = model;
        this.kolor = kolor;
        this.waga = waga;
    }
    //Metody
    public void refuel(){
        System.out.println("Tankowanie samochodu "+marka+" "+model);

    }
    void changeTyres(){
        System.out.println("Zmiana opon w samochodzie " + marka + " " + model);
    }
}
