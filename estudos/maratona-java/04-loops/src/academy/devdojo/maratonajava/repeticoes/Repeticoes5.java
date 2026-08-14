package academy.devdojo.maratonajava.intro;

public class Repeticoes5 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal;parcela >= 1;parcela--) {
            double valorParcela = valorTotal / parcela;
            if (parcela > 30) {
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
