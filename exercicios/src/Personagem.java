import java.util.Objects;

public class Personagem {
    private final String nome;
    private int energia;
    private static int totalCriados;

    public Personagem(String nome) {
        this(nome, 100);
    }

    public Personagem(String nome, int energia) {
        this.nome = Objects.requireNonNull(nome, "nome obrigatório").trim();
        if (this.nome.isEmpty()) {
            throw new IllegalArgumentException("nome não pode ficar vazio");
        }
        if (energia < 0) {
            throw new IllegalArgumentException("energia não pode ser negativa");
        }
        this.energia = energia;
        totalCriados++;
    }

    public void descansar() {
        energia += 10;
    }

    public void receber(Recompensa recompensa) {
        Objects.requireNonNull(recompensa, "recompensa obrigatória");
        energia += recompensa.getEnergia();
    }

    public String getNome() {
        return nome;
    }

    public int getEnergia() {
        return energia;
    }

    public static int getTotalCriados() {
        return totalCriados;
    }

    @Override
    public String toString() {
        return "%s (%d de energia)".formatted(nome, energia);
    }
}
