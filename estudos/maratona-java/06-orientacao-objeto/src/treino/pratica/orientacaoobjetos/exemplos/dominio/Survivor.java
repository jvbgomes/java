package treino.pratica.orientacaoobjetos.exemplos.dominio;

public class Survivor {
    private String name;
    private int health;
    private int hunger;

    public Survivor(String name, int health, int hunger) {
        this.name = name;
        this.health = health;
        this.hunger = hunger;
    }

    public void eat(int amount) {
        hunger -= amount;
        if (hunger < 0) hunger = 0;
    }

    public void printStatus() {
        System.out.println(name + " - Health: " + health + ", Hunger: " + hunger);
    }
}
