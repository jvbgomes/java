package treino.pratica.orientacaoobjetos.praticando.domain;

public class LivroIndisponivelException extends RuntimeException {
    public LivroIndisponivelException(String livroJaEstaEmprestado) {
        super(livroJaEstaEmprestado);
    }
}
