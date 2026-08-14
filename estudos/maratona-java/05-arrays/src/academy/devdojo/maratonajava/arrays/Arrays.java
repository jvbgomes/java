package academy.devdojo.maratonajava.arrays;

public class Arrays {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars.length);

        String[] persons = new String[8];

        persons[0] = "João";
        persons[1] = "Gabe";
        persons[2] = "Mk";
        persons[3] = "Radla";
        persons[4] = "Felipe";
        persons[5] = "Arthur";
        persons[6] = "Nicollas";
        persons[7] = "Vinicius";

        //there is other way of doing a for loop in java, which follows bellow

        for (String person : persons) {
            System.out.println(person);
        }

        System.out.println("---------------------");

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }
    }
}


