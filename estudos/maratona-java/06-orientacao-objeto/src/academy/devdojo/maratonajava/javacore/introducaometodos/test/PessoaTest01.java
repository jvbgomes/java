package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        // pessoa.name = "jiraya;
        pessoa.setName("Jiraya");
        pessoa.setAge(70);
        // pessoa.print();
        System.out.println(pessoa.getName());
        System.out.println(pessoa.getAge());
    }
}
