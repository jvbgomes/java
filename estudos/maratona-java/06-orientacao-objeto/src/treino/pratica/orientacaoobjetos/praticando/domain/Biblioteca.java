package treino.pratica.orientacaoobjetos.praticando.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private static final int DIAS_EMPRESTIMO = 15;
    private List<Livro> livros = new ArrayList<>();
    private Emprestimo emprestimo;


    public Biblioteca(List<Livro> livros, Emprestimo emprestimo){
        this.livros = new ArrayList<>();
        this.emprestimo = emprestimo;
    }

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
    }

    public Emprestimo emprestarLivro(Livro livro, Pessoa pessoa) {
        if (!livro.isAvailable()) {
            throw new LivroIndisponivelException("Livro já está emprestado");
        }
        LocalDate dataRetirada = LocalDate.now();
        LocalDate dataPrevistaDevolucao = dataRetirada.plusDays(DIAS_EMPRESTIMO);

        Emprestimo emprestimo = new Emprestimo(livro, pessoa, dataRetirada ,dataPrevistaDevolucao);

        livro.marcarComoEmprestado();

        return emprestimo;
    }





}
