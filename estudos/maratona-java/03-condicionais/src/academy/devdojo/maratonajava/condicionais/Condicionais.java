package academy.devdojo.maratonajava.condicionais;

public class Condicionais {
    public static void main(String[] args) {
        int idade = 20;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcolica");
        } else {
            System.out.println("Nao esta autorizado a comprar bebida alcolica");
        }
    }
}
