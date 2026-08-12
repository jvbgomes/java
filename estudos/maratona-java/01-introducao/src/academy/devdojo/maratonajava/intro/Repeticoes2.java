package academy.devdojo.maratonajava.intro;

public class Repeticoes2 {
    public void main(String[] args) {
        //imprima todos os numeros pares de 0 ate 1000000
        //num par --> resto 0
        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println("NUMEROS PARES: "+ i);
            }
        }
    }
}
