package exercise.ifElseSwitch;

public class IfElseSwitch {
    public static void main(String[] args) {
        System.out.println("TEST:");

        int rating = 4;
        if (rating >= 4) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
        System.out.println();
        System.out.println("Cars and models:");
        String car = "BMW";
        if (car.equals("BMW")) {
            System.out.println("Series 3, Series 5, Series 7");
        } else if (car.equals("Mercedes")) {
            System.out.println("C-Class, E-Class, S-Class");
        }else {
            System.out.println("Unknown car");

        }
        System.out.println();
        System.out.println("Switch:");

        String weekDay = "czwartek";

        switch(weekDay){
            case "poniedziałek":
                System.out.println("Shop is open: 8.00-16.00");
                break;
            case "wtorek":
                System.out.println("shop is open: 7.00-15.00");
                break;
            case "Sroda":
                System.out.println("Shop is open: 9.00-17.00");
                break;
            case "czwartek":
                System.out.println("Shop is open: 10.00-18.00");
                break;
            case "piatek":
                System.out.println("Shop is open: 11.00-19.00");
                break;
            case "sobota":
                System.out.println("Shop is closed on Sundays");
            default:
                System.out.println("Invalid day");
                break;
        }


    }

}


