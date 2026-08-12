package academy.devdojo.maratonajava.intro;

public class Condicionais4 {
    public static void main(String[] args) {
        double salary = 83379;
        double tax1 = 9.70/100;
        double tax2 = 37.35/100;
        double tax3 = 49.50/100;
        double incomeTax;
        if (salary <= 34712) {
            incomeTax = (salary * tax1);
        } else if (salary >= 34713 && salary <= 68507) {
            incomeTax = (salary * tax2);
        } else {
            incomeTax = (salary * tax3);
        }
        System.out.println("Voce tera que pagar "+incomeTax+ "$");

    }
}
