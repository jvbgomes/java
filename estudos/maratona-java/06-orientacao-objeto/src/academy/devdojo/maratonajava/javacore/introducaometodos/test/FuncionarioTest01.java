package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setName("Sanji");
        funcionario.setAge(23);
        funcionario.setSalarys(new double[]{1200, 987.32, 2000});
        funcionario.printData();
        System.out.println("Media " + funcionario.getAvg());
    }
}
