package exercise.dziedziczenie;

public class MainCars {
    public static void main(String[] args) {
        Track track = new Track("Scania","Super","biały",10000,6);
        FireTrack fireTrack = new FireTrack("Star","200","Czerwony",5000,3500);

        System.out.println("samochód "+ track.marka+" "+track.model+" uruchomiony");
        track.refuel();
        track.unhookTrailer();
        track.changeTyres();
        System.out.println("samochód " + fireTrack.marka + " " + fireTrack.model + " uruchomiony");
        fireTrack.refuel();
        fireTrack.turnOnPomp();
        fireTrack.changeTyres();

    }
}
