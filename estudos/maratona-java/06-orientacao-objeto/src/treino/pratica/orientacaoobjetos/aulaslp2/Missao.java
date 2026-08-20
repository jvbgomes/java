package treino.pratica.orientacaoobjetos.aulaslp2;

public class Missao {
    private String title;
    private String description;
    private boolean concluded;
    private int minLevel;
    private Recompensa recompensa;

    public Missao(String title, String description, int minLevel, Recompensa recompensa) {
        this.title = title;
        this.description = description;
        this.minLevel = minLevel;
        this.recompensa = recompensa;
        this.concluded = false;
    }

    public Missao(String title, String description, int minLevel) {
        this(title, description, minLevel, null);
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
