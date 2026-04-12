package br.com.minhasMusicas.modelos;

public class Audio {
    private String titulo;
    private double duracao;
    private int totalDeReproducao;
    private int curtidas;
    private int classificacao;


    public void exibirInformacoes(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println("Classificacao: " + classificacao);
        System.out.println("Curtidas: " + curtidas);
        System.out.println("Total de reproduções: " + totalDeReproducao);
    }

    public void curtir(){
        this.curtidas ++;
    }

    public void reproduz(){
        this.totalDeReproducao ++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getClassificacao() {
        return classificacao;
    }


    public int getCurtidas() {
        return curtidas;
    }

    public double getDuracao() {
        return duracao;
    }


    public int getTotalDeReproducao() {
        return totalDeReproducao;
    }

}
