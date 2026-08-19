package academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

public class Funcionario {
    private String name;
    private int age;
    private double[] salarys;
    private double avg;


    public void printData() {
        System.out.println(this.name);
        System.out.println(this.age);
        if (salarys == null) {
            return;
        }
        for (double salary : salarys) {
            System.out.println(salary + " ");
        }

        printAvgSalary();
    }

    public void printAvgSalary() {
        if (salarys == null) {
            return;
        }

        for (double salary : salarys) {
            avg += salary;
        }
        avg /= salarys.length;

        System.out.println("\nMedia Salarial " + avg);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalarys(double[] salarys) {
        this.salarys = salarys;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double[] getSalarys() {
        return salarys;
    }

    public double getAvg() {
        return avg;
    }
}
