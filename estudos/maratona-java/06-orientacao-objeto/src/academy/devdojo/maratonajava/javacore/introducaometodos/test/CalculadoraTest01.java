package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    static void main(String[] args) {
        Calculadora calculador = new Calculadora();
        calculador.somaDoisNumeros();
        System.out.println("Finalizando CalculadoraTest01");
        calculador.subtraiDoisNumeros();
    }
}
