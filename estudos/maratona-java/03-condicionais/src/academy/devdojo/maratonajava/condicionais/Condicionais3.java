package academy.devdojo.maratonajava.intro;

public class Condicionais3 {
    public static void main(String[] args) {
        double salary = 6000;
        String messageDonate = "Eu vou doar 500 pro DevDojo";
        String messageNoDonate = "Ainda nao tenho condicoes, mas vou ter!";
        String result;

        if (salary > 5000) {
            result = messageDonate;
        } else {
            result = messageNoDonate;
        }
        System.out.println(result);

        //operador ternario --> (condicao) ? verdaderio : falso;

        String result2 = (salary < 5000) ? messageDonate : messageNoDonate;

        System.out.println(result2);

    }
}
