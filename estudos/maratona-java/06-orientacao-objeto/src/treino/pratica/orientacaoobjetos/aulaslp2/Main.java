package treino.pratica.orientacaoobjetos.aulaslp2;

public class Main {
    static void main(String[] args) {
        Personagem joao = new Personagem("João", 50, 5);
        Recompensa ouro = new Recompensa("ouro", 100);
        Missao entregarPacote = new Missao("Entregar pacote", "Leve até a vila", 1, ouro);

        Personagem sabrina = new Personagem("Sabrina", 40, 4);
        Recompensa pix = new Recompensa("reais", 1000);
        Missao limparCasa = new Missao("Limpar a casa", "Limpe todos os cômodos", 2, pix);

        Recompensa recebida = joao.concluirMissao(entregarPacote);
        System.out.println("Recompensa recebida: " + recebida);

        Recompensa recebida2 = sabrina.concluirMissao(limparCasa);
        System.out.println("Um pix de "+ recebida2 +" feito com sucesso");

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
