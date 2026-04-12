package br.com.minhasMusicas.principal;

import br.com.minhasMusicas.modelos.Audio;
import br.com.minhasMusicas.modelos.MinhasPreferidas;
import br.com.minhasMusicas.modelos.Musica;
import br.com.minhasMusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();

        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");

        for (int i = 0; i < 10000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 500; i++) {
            minhaMusica.curtir();
        }

        Podcast meuPodcast = new Podcast();

        meuPodcast.setTitulo("Bolha dev");
        meuPodcast.setApresentador("Marcos mendes");

        for (int i = 0; i < 40; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 20; i++) {
            meuPodcast.curtir();
        }


        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);

    }
}
