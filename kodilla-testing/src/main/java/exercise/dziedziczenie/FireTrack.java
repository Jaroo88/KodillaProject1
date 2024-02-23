package exercise.dziedziczenie;

public class FireTrack extends Cars{
    FireTrack(String marka, String model, String kolor, int waga, int waterTankCapacity) {
        super(marka, model, kolor, waga);
        this.waterTankCapacity = waterTankCapacity;
    }
    public double waterTankCapacity = 3000;

    public void turnOnPomp(){
        System.out.println("Pompa włączona");
    }

    @Override
    public void refuel() {
        super.refuel();
        System.out.println("Diesel");
    }
}
