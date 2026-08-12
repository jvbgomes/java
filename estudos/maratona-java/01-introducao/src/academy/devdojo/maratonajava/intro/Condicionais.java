package academy.devdojo.maratonajava.intro;

public class Condicionais {
    public static void main(String[] args) {
        int idade = 20;
        int idade2 = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        boolean isAutorizadoComprarBebida2 = idade2 >= 18;
        // !
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcolica");
        }

        if (isAutorizadoComprarBebida2 == false) {
            System.out.println("Nao esta autorizado a comprar bebida alcolica");

        }
    }
}
