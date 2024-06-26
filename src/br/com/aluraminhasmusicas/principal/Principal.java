package br.com.aluraminhasmusicas.principal;

import br.com.aluraminhasmusicas.modelos.MinhasPreferidas;
import br.com.aluraminhasmusicas.modelos.Musica;
import br.com.aluraminhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();

        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.Reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.Curti();
        }

        Podcast meuPodcast = new Podcast();

        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcos Mendes");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.Reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.Curti();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);

    }
}
