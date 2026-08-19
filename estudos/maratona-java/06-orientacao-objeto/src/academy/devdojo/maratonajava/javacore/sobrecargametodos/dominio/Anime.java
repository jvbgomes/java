package academy.devdojo.maratonajava.javacore.sobrecargametodos.dominio;

public class Anime {
    private String type;
    private String name;
    private int episodes;
    private String genre;

    public Anime() {
    }

    public void init(String name, String type, int episodes) {
        this.name = name;
        this.type = type;
        this.episodes = episodes;
    }

    public void init (String name, String type, int episodes, String genre) {
        //sobrecarga de metodos
        this.init(name, type, episodes);
        this.genre = genre;
    }

    public void print() {
        System.out.println(this.type);
        System.out.println(this.name);
        System.out.println(this.episodes);
        System.out.println(this.genre);
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
