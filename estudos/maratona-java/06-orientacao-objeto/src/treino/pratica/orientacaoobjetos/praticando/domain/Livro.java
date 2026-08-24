package treino.pratica.orientacaoobjetos.praticando.domain;

public class Livro {
    private final String title;
    private final int page;
    private Autor autor;
    private boolean available;

    public Livro(String title, int page, Autor autor, boolean available) {
        this.title = title;
        this.page = page;
        this.autor = autor;
        this.available = true;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getPage() {
        return page;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void marcarComoEmprestado() {
        this.available = false;
    }

    public void marcarComoDisponivel() {
        this.available = true;
    }

}
