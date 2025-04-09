package java.escola;

public class Departamento {

    private String nomeDepartamento;
    private String siglaDepartamento;

    public Departamento(String nomeDepartamento, String siglaDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
        this.siglaDepartamento = siglaDepartamento;
    }

    public String getNomeDepartamento() {
        return nomeDepartamento;
    }

    public void setNomeDepartamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }

    public String getSiglaDepartamento() {
        return siglaDepartamento;
    }

    public void setSiglaDepartamento(String siglaDepartamento) {
        this.siglaDepartamento = siglaDepartamento;
    }

    public String toString() {
        return "Departamento: " + nomeDepartamento + " (" + siglaDepartamento + ")";
    }



}
