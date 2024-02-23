package exercise.classMethods;

public class Car {
    //gettery i settery ustawiamy za pomoca prawego przycisku myszy i funkcji GENRATE.
    //za pomocą getterów ustawiamy możliwość skorzystania z prywatnego pola w obcej klasie
    //za pomocą setterów mozemy zmienić dane danego pola w obcej klasie

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public int getWaga() {
        return waga;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }

    public int getQuantityFuel() {
        return quantityFuel;
    }

    public void setQuantityFuel(int quantityFuel) {
        this.quantityFuel = quantityFuel;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public int getQuantityKm() {
        return quantityKm;
    }

    public void setQuantityKm(int quantityKm) {
        this.quantityKm = quantityKm;
    }

    public int getTraveledKm() {
        return traveledKm;
    }

    public void setTraveledKm(int traveledKm) {
        this.traveledKm = traveledKm;
    }

    private String marka;
    private String kolor;
    private int waga;
    private int quantityFuel;
    private int consumption;
    private int quantityKm;
    private int traveledKm;

    Car(String marka, String kolor, int waga, int quantityFuel, int consumption, int quantityKm, int traveledKm) {       //konstruktor
        this.marka = marka;
        this.kolor = kolor;
        this.waga = waga;
        this.quantityFuel = quantityFuel;
        this.consumption = consumption;
        this.quantityKm = quantityKm;
        this.traveledKm = traveledKm;
    }


    public void startEngine() {
        System.out.println("Engine started " + marka);  //w nawiasie wypisujemy pola które maja sie wyswietlic w metodzie
    }

    public void offEngine() {
        System.out.println("Engine off " + marka);
    }

    public int consumptionFuel() {
        return quantityFuel / consumption * 100;
    }

    public int kmToTarget() {
        return quantityKm - traveledKm;
    }

    public int kmTraveled(int ammountKm, int targetToKm) {
        return ammountKm - targetToKm;
    }
    public double kmTraveled(double ammountKm, double targetToKm) {     //przeciążanie funkcji czyli dodanie tej samej funkcji z innym typem.
        return ammountKm - targetToKm;
    }
}

