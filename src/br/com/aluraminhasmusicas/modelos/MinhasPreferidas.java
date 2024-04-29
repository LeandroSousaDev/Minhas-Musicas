package br.com.aluraminhasmusicas.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio) {

        if(audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + "Essa musica é muito boa");
        } else {
            System.out.println(audio.getTitulo() + "Essa musica teve boas avaliações");
        }
    }
}
