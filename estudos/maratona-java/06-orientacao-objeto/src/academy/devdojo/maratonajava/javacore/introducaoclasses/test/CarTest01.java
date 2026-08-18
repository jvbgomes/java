package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Car;

public class CarTest01 {
    static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.name = "Fusca Bala";
        car1.model = "Sport";
        car1.year = 1969;

        car2.name = "Mustang";
        car2.model = "GT 500";
        car2.year = 1968;

        System.out.println("Carro 1");
        System.out.println(car1.name);
        System.out.println(car1.model);
        System.out.println(car1.year);

        System.out.println("\nCarro 2");
        System.out.println(car2.name);
        System.out.println(car2.model);
        System.out.println(car2.year);

    }
}
