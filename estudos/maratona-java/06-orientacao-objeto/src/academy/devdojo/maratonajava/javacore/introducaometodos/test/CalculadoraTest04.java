package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int numero1 = 1;
        int numero2 = 2;
        calculadora.alteraDoisNumeros(numero1, numero2);
        System.out.println("Dentro CalculadoraTest04");
        System.out.println(numero1);
        System.out.println(numero2);

    }
}
