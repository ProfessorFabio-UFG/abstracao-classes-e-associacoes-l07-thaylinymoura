package java.musicasecompositores;

public class Compositor {

    private String nome;
    private String nascionalidadeCompositor;

    public Compositor(String nome, String nascionalidadeCompositor) {
        this.nome = nome;
        this.nascionalidadeCompositor = nascionalidadeCompositor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascionalidadeCompositor() {
        return nascionalidadeCompositor;
    }

    public void setNascionalidadeCompositor(String nascionalidadeCompositor) {
        this.nascionalidadeCompositor = nascionalidadeCompositor;
    }

    public String toString() {
        return nome + " (" + nascionalidadeCompositor + ")";
    }
}
