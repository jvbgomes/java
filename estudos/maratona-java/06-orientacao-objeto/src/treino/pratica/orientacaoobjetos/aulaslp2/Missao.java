package treino.pratica.orientacaoobjetos.aulaslp2;

public class Missao {
    private final String title;
    private final String description;
    private boolean concluded; //Estado mutável
    private final int minLevel;
    private final Recompensa recompensa;

    public Missao(String title, String description, int minLevel, Recompensa recompensa) {
        this.title = title;
        this.description = description;
        this.minLevel = minLevel;
        this.recompensa = recompensa;
        this.concluded = false;
    }

    public Missao(String title, String description, int minLevel) {
        this(title, description, minLevel, null); //sobrecarga justificavel
    }

    public void concluir() {
        if (concluded) {
            throw new IllegalStateException("Essa missão já foi concluída");
        }
        concluded = true;
    }

    public boolean isConcluded() { return this.concluded; }
    public Recompensa getRecompensa() { return recompensa; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public int getMinLevel() { return minLevel; }
}
