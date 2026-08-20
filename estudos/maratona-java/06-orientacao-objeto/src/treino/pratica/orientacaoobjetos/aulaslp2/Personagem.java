package treino.pratica.orientacaoobjetos.aulaslp2;

public class Personagem {
    private String name;
    private int energy;
    private int level;

    public Personagem(String name, int energy, int level) {
        if (level < 1 || level > 15) {
            throw new IllegalStateException("O level deve estar entre 1 e 15.");
        }
        this.name = name;
        this.energy = energy;
        this.level = level;
    }

    public Recompensa concluirMissao(Missao missao) {
        if (energy <= 0) {
            throw new IllegalStateException(name + " não tem energia suficiente.");
        }
        if (level < missao.getMinLevel()) {
            throw new IllegalStateException(name + " não tem nível suficiente para esta missão.");
        }

        missao.concluir();
        System.out.println("Missão Concluída com sucesso");
        return missao.getRecompensa();
    }
}

