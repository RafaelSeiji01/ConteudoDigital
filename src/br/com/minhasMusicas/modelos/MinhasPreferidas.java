package br.com.minhasMusicas.modelos;

public class MinhasPreferidas {

    public void inclui (Audio audio){
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto e preferido pot todos!");
        } else {
            System.out.println(audio.getTitulo() + " é uma exelente opção!");
        }
    }
}
