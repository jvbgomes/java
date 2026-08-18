package treino.pratica.orientacaoobjetos.exemplos.dominio;

public class Zombie {
    private String name;
    private int health;
    private int damage;

    public Zombie(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void attack() {
        System.out.println(name + " attacks for " + damage + " damage!");
    }
}
