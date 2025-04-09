package java.escola;

public class Curso {

    private String curso;
    private String sigla;
    private Departamento departamentos; // na relação 1-> e instanciar o objeto

    public Curso(String curso, String sigla, Departamento departamento) {
        this.curso = curso;
        this.sigla = sigla;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Departamento getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamento departamentos) {
        this.departamentos= departamentos;
    }

    public String toString() {
        return "Curso: " + curso + " (" + sigla + "), " + departamentos;
    }



}
