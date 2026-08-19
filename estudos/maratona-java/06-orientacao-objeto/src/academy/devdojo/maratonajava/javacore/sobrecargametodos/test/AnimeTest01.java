package academy.devdojo.maratonajava.javacore.sobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.sobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto", "Shonen", 720, "Action");
        anime.setGenre("Action");
        anime.print();

    }
}
