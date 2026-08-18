package treino.pratica.orientacaoobjetos.exemplos.test;
import treino.pratica.orientacaoobjetos.exemplos.dominio.Survivor;
import treino.pratica.orientacaoobjetos.exemplos.dominio.Zombie;

public class Main {
    public static void main(String[] args) {
        Survivor player1 = new Survivor("Alex", 100, 50);
        Survivor player2 = new Survivor("Sam", 90, 30);
        Zombie tank = new Zombie("Tank", 300, 50);
        Zombie runner = new Zombie("Runner", 85, 30);
        Zombie screamer = new Zombie("Screamer", 40, 20);

        Zombie[] zombies = {tank, runner, screamer};

        for (Zombie zombie : zombies) {
            zombie.attack();
            System.out.println("--------------------------→");
        }

        player1.eat(20);
        player1.printStatus();
        System.out.println("---------------------------→");
        player2.printStatus();


    }
}
