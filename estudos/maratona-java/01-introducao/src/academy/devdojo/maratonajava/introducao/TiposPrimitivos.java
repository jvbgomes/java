package academy.devdojo.maratonajava.introducao;

public class TiposPrimitivos {
    static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = (int) 10000000000L; // casting --> forcing the input of a value. It's not interesting doing this
        long bigNum = (long)155.23; // you must chance the type of the value.
        double salaryDouble = 2000D;
        float salaryFloat = (float) 2500.0D;
        byte ageByte = 127; // --> 1 byte = 8 bits
        short ageShort = 32000;
        boolean truly = true;
        boolean falsy = false;
        char character = '\u0041'; //you can put numbers too, like 10. --> 2 bytes = 16 bits. From table ASCII
        String name = "Goku"; // A string its not a primitive type, so u can use a class called String

        System.out.println("The age is " +age+" years");
        System.out.println("The age is " +bigNum+" years");
        System.out.println("The age is " +salaryDouble+" years");
        System.out.println(salaryFloat);
        System.out.println("The age is " +ageByte+" years");
        System.out.println("The age is " +ageShort+" years");
        System.out.println("The age is " +truly);
        System.out.println("The age is " +falsy);
        System.out.println("char " +character);
        System.out.println("My name is "+ name);
    }
}
