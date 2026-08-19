package academy.devdojo.maratonajava.javacore.construtor.test;

import academy.devdojo.maratonajava.javacore.construtor.dominio.Anime;

public class AnimeTest01 {
    static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "Shonen", 60, "Action", "Production I.G");
        anime.print();
    }
}
