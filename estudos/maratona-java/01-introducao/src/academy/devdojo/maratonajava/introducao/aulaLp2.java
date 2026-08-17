package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;

public class aulaLp2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double n1 = in.nextDouble();
        System.out.println("Digite a segunda nota: ");

        double n2 = in.nextDouble();
        double media = (n1 + n2) / 2.0;

        if (media >= 7.0) {
            System.out.println("Média " + media + " - APROVADO\n");
        } else {
            System.out.println("Média " + media + " - REPROVADO\n");
        }
        System.out.println("-------------------------");
    }
}
