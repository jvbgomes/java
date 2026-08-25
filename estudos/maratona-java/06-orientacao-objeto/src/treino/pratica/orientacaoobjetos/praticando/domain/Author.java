package treino.pratica.orientacaoobjetos.praticando.domain;

public class Author extends Person {
    private String work;

    public Author(String name, String work) {
        super(name);
        this.work = work;
    }

    public String getWork() {
        return work;
    }
}
