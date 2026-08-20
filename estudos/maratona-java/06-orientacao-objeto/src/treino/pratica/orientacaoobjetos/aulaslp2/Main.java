package treino.pratica.orientacaoobjetos.aulaslp2;

public class Main {
    static void main(String[] args) {
        Personagem joao = new Personagem("João", 50, 5);
        Recompensa ouro = new Recompensa("ouro", 100);
        Missao entregarPacote = new Missao("Entregar pacote", "Leve até a vila", 1, ouro);

        Recompensa recebida = joao.concluirMissao(entregarPacote);
        System.out.println("Recompensa recebida: " + recebida);

        try {
            joao.concluirMissao(entregarPacote);
        } catch(IllegalStateException e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }

        try {
            Personagem invalido = new Personagem("Bug", 50, 20);
        } catch (IllegalStateException e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }

    }
}
