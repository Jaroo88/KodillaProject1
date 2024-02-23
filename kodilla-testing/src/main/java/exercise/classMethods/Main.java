package exercise.classMethods;

public class Main {
    public static void main(String[] args) {

        Car limuzyna;           //tworzenie obiektów na podstawie klasy Car
        Car coupe;
        Car suv;
        //Tak tworzymy z konstruktorem!
        limuzyna = new Car("BMW", "black", 2000,30,10,1000,520);
        coupe = new Car("Mercedes", "silver", 1800,35,5,750,500);
        suv = new Car("Audi", "red", 2200,60,15,300,25);
  //   Tak tworzymy bez konstruktora w klasie Car.
  //      Car limuzyna;
  //      Car coupe;
  //      Car suv;
 //       limuzyna = new Car();
 //       coupe = new Car();
  //      suv = new Car();

//        limuzyna.marka = "BMW";
//        limuzyna.kolor = "black";
//        limuzyna.waga = 2000;

 //       coupe.marka = "Mercedes";
 //       coupe.kolor = "silver";
 //       coupe.waga = 1800;

 //       suv.marka = "Audi";
 //       suv.kolor = "red";
 //       suv.waga = 2200;

        limuzyna.setMarka("Bentley");  //Setter zmieniamy przypisaną marke

        limuzyna.startEngine();
        System.out.println(limuzyna.getMarka() + " "+"wystarczy paliwa na "+ limuzyna.consumptionFuel()+"Km");  //getter
        System.out.println("przejechaliśmy już " + limuzyna.kmTraveled(1000,520)+"Km" );
        System.out.println("Do celu pozostało "+limuzyna.kmToTarget()+"Km");
        limuzyna.offEngine();
        coupe.startEngine();
        System.out.println(coupe.getMarka() + " " + "wystarczy paliwa na " + coupe.consumptionFuel() + "Km");   //getter
        System.out.println("Przejechaliśmy już " + coupe.kmTraveled(750, 250) + " km");
        System.out.println("Do celu pozostało " + coupe.kmToTarget() + " km");
        coupe.offEngine();
        suv.startEngine();
        System.out.println(suv.getMarka() + " " + "wystarczy paliwa na " + suv.consumptionFuel() + "Km");       //getter
        System.out.println("Przejechaliśmy już " + suv.kmTraveled(300, 27.5) + " km");
        System.out.println("Do celu pozostało " + suv.kmToTarget() + " km");
        suv.offEngine();
    }
}
