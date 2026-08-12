package academy.devdojo.maratonajava.intro;

public class Condicionais6 {
    public static void main(String[] args) {
        //dados os valores de 1 a 7, imprima se e dua util ou final de semana
        //considerando 1 como domingo

        byte dia = 1;
        switch(dia) {
            case 1:
            case 7:
                System.out.println("FINAL DE SEMANA");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("DIA UTIL");
                break;
            default:
                System.out.println("OPCAO INVALIDA");
                break;

        }
    }
}
