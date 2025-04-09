package java.musicasecompositores;

import java.util.List;

public class Musica {


    // nome, ano, tipo e compositor

    private String nomeMusica;
    private int anoMusica;
    private String tipoMusica;
    private List<Compositor> compositores;

    //Construtor


    public Musica(String nomeMusica, int anoMusica, String tipoMusica, List<Compositor> compositores) {
        this.nomeMusica = nomeMusica;
        this.anoMusica = anoMusica;
        this.tipoMusica = tipoMusica;
        this.compositores = compositores;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public int getAnoMusica() {
        return anoMusica;
    }

    public void setAnoMusica(int anoMusica) {
        this.anoMusica = anoMusica;
    }

    public String getTipoMusica() {
        return tipoMusica;
    }

    public void setTipoMusica(String tipoMusica) {
        this.tipoMusica = tipoMusica;
    }

    public List<Compositor> getCompositores() {
        return compositores;
    }

    public void setCompositores(List<Compositor> compositores) {
        this.compositores = compositores;
    }


    public String toString() {
        return "Música: " + nomeMusica +
                " (" + anoMusica + ", " + tipoMusica + ")" +
                "\n Compositores: " + compositores;
    }

}
