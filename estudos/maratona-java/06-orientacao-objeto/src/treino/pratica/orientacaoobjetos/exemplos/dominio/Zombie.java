package treino.pratica.orientacaoobjetos.exemplos.dominio;

public class Zombie extends Entity {
    private int damage;

    public Zombie(String name, int health, int damage) {
        super(name, health);
        this.damage = damage;
    }

    public void attack() {
        System.out.println(name + " attacks for " + damage + " damage!");
    }
}
