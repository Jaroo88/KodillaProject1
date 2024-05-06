package exercise.tables;

public class Tables {
    public static void main(String[] args) {


        String[] months = new String[12];       //tworzenie listy
        months[0] = "January";                  //dodajemy za pomoca nazwa tablicy = nazwa która chcemy dodać
        months[1] = "February";
        months[2] = "March";
        months[3] = "April";
        months[4] = "May";
        months[5] = "June";
        months[6] = "July";
        months[7] = "August";
        months[8] = "September";
        months[9] = "October";
        months[10] = "November";
        months[11] = "December";
        System.out.println("months list:");
        for (String month : months) {                   //całą listę wyswietlamy za pomoca petli for
            System.out.println(month);
        }
        System.out.println();

        System.out.println("wybrany miesiąc z kalendarza to " +months[1]); // tak wyswietlamy wybrany miesiąc z tablicy
        System.out.println("ilość miesiecy na tablicy:"+months.length);     // tak wyswietlamy rozmiar tablicy

        String[] cars = new String[] {"BMW", "Audi", "Mercedes","Bentley"};  //2 sposób tworzenia listy
        System.out.println(cars[2]);
        for (int a =0;a < cars.length; a++){                    //2 sposób wyswietlania w petli for
            System.out.println(cars[a]);
        }

        System.out.println(months[8]+" "+cars[0]);              // tak wyswietlamy elementy z 2 różnych list


    }
}
