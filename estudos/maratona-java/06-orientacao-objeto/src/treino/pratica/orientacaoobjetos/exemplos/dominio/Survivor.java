package treino.pratica.orientacaoobjetos.exemplos.dominio;

public class Survivor extends Entity {
    private int hunger;

    public Survivor(String name, int health, int hunger) {
        super(name, health);
        this.hunger = hunger;
    }

    public void eat(int amount) {
        hunger -= amount;
        if (hunger < 0) hunger = 0;
    }

    @Override
    public void printStatus() {
        super.printStatus();
        System.out.println(" - Hunger: " + hunger);
    }
}
