package treino.pratica.orientacaoobjetos.exemplos.dominio;

public class Entity {
    // o modificador de acesso deve ser o protected para que as subclasses consigam acessar diretamente
    protected String name;
    protected int health;

    public Entity(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int amount) {
        health -= amount;
        if (health < 0) health = 0;
    }

    public void printStatus() {
        System.out.println(name + " - Health " + health);
    }
}
