package academy.devdojo.maratonajava.javacore.blocosinicializacoes.test;

import academy.devdojo.maratonajava.javacore.blocosinicializacoes.dominio.Anime;

public class AnimeTest01 {
    static void main(String[] args) {
        Anime anime = new Anime();

        for (int episode : anime.getEpisodes()) {
            System.out.print(episode + " ");
        }

    }
}
