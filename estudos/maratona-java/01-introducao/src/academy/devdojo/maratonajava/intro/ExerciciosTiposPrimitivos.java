package academy.devdojo.maratonajava.intro;

/*
Pratica

Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereco <endereco>,
confirmo que recebi o salario de <salario>, na data <data>
 */

public class ExerciciosTiposPrimitivos {
    public static void main(String[] args) {
        String name = "Kirito";
        String address = "Rua Silvino Jose dos Santos";
        float salary = 2754.69F;
        String dateSalary = "16/06/2005";
        String message = "Eu "+name+ " morando no endereco "+address+", confirmo que recebi o salario de "+salary+ ", na data "+ dateSalary;

        System.out.println(message);
    }
}
