package treino.pratica.orientacaoobjetos.atv1;

import java.util.ArrayList;
import java.util.List;

public final class Personagem {
    public static final int ENERGIA_MAXIMA = 100;

    private final String nome;
    private int energia;
    private final List<String> historicoConquistas;

    public Personagem(String nome, int energia) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido.");
        }
        if (energia < 0 || energia > ENERGIA_MAXIMA) {
            throw new IllegalArgumentException("Energia fora dos limites permitidos (0 a " + ENERGIA_MAXIMA + ").");
        }
        this.nome = nome;
        this.energia = energia;
        this.historicoConquistas = new ArrayList<>();
    }

    public Personagem(String nome) {
        this(nome, ENERGIA_MAXIMA);
    }

    public String getNome() {
        return this.nome;
    }

    public int getEnergia() {
        return this.energia;
    }

    public List<String> getHistoricoConquistas() {
        return List.copyOf(this.historicoConquistas);
    }

    public void sofrerDano(int dano) {
        if (dano <= 0) {
            throw new IllegalArgumentException("O dano deve ser positivo.");
        }
        this.energia = Math.max(0, this.energia - dano);
    }

    public void descansar() {
        this.energia = Math.min(ENERGIA_MAXIMA, this.energia + 10);
    }

    public void concluirMissao(Missao missao) {
        if (missao == null) {
            throw new IllegalArgumentException("Missão não pode ser nula.");
        }

        Recompensa r = missao.concluir();

        this.energia = Math.min(ENERGIA_MAXIMA, this.energia + r.getEnergia());
        this.historicoConquistas.add(r.getDescricao());

        System.out.println(this.nome + " concluiu a missão '" + missao.getTitulo() +
                "' e obteve a recompensa '" + r.getDescricao() + "' (+" + r.getEnergia() + " energia)!");
    }
}