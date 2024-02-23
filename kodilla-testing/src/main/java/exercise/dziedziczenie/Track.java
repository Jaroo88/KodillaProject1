package exercise.dziedziczenie;

public class Track extends Cars{
    Track(String marka, String model, String kolor, int waga,int trailerLength) {
        super(marka, model, kolor, waga);
        this.trailerLength = trailerLength;
    }
    public double trailerLength = 6.5;

    public void unhookTrailer(){
        System.out.println("Odpinam naczepe");
    }

    @Override
    public void refuel() {
        super.refuel();
        System.out.println("Diesel");
    }
}
