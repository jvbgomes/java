package treino.pratica.orientacaoobjetos.praticando.domain;

public class Autor extends Pessoa{
    private String work;


    public Autor(String work, String name) {
        super(name);
        this.work = work;

    }

    public String getWork() {
        return work;
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
