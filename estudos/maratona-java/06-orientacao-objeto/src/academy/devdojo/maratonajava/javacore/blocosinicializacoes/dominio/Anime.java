package academy.devdojo.maratonajava.javacore.blocosinicializacoes.dominio;

public class Anime {
    private String name;
    private int[] episodes;
    // 1- Alocado espaco em memoria pro objeto
    // 2- Cada atributo de classe e criado e inicializado com valores default ou o que for passada
    // 3- Bloco de inicializacao e executado
    // 4- construtor e executado
    {
        System.out.println("Dentro do bloco de inicializacao");
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        for (int episode : this.episodes) {
            System.out.println(episode + " ");
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}
