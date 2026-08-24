package treino.pratica.orientacaoobjetos.praticando.domain;

import java.time.LocalDate;

public class Emprestimo {
    private Pessoa pessoa;
    private Livro livros;
    private LocalDate dataRetirada;
    private LocalDate dataPrevistaDevolucao;

    public Emprestimo(Livro livros, Pessoa pessoa, LocalDate dataRetirada, LocalDate dataPrevistaDevolucao) {
        this.pessoa = pessoa;
        this.livros = livros;
        this.dataRetirada = dataRetirada;
        this.dataPrevistaDevolucao = dataPrevistaDevolucao;
    }


}
