package java.escola;

public class Aluno {

    private  String nome;
    private  int matricula;
    private  int ano;
    private  Curso curso;


    public Aluno(String nome, int matricula, int ano,Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.ano = ano;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Curso getCursos() {
        return curso;
    }

    public void setCursos(Curso curso) {
        this.curso = curso;
    }


    public String toString() {
        return "Aluno: " + nome + "\nMatrícula: " + matricula + "\nAno: " + ano + "\n" + curso;
    }
}
