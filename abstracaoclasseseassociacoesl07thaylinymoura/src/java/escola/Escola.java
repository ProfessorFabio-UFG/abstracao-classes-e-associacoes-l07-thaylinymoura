package java.escola;

public class Escola {

    public static void main(String[] args) {
        //Mostrar (textualmente) os alunos, cursos e departamentos.

        Departamento departamento = new Departamento("Intituto de Informatica", "INF");
        Curso curso = new Curso("Engenharia de Software", "INF", departamento);
        Aluno aluno = new Aluno("Marina ", 123456, 2025, curso);

        System.out.println(aluno);


    }
}
