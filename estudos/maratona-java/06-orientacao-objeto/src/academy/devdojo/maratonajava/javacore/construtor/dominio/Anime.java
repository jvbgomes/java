package academy.devdojo.maratonajava.javacore.construtor.dominio;

public class Anime {
    private String type;
    private String name;
    private int episodes;
    private String genre;
    private String studio;

    public Anime(String name, String type, int episodes, String genre) {
        //sobrecarga de construtores, sendo esse um construtor vazio
        this();
        this.name = name;
        this.type = type;
        this.episodes = episodes;
        this.genre = genre;
    }

    public Anime(String name, String type, int episodes, String genre, String studio) {
        // sobrecarga de construtores com atributos, assim, colocando so aqueles que nao estao no construtor principal
        this(name, type, episodes, genre); //deve ser sempre a primeira linha do corpo do construtor
        this.studio = studio;
    }

    public Anime() {
        System.out.println("Dentro do construtor sem argumentos");
    }

    public void print() {
        System.out.println(this.type);
        System.out.println(this.name);
        System.out.println(this.episodes);
        System.out.println(this.genre);
        System.out.println(this.studio);
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public String getType() {
        return this.type;
    }

    public String getName(){
        return this.name;
    }

    public int getEpisodes() {
        return this.episodes;
    }

}
