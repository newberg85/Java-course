package oo_composicao;

public class CursoTeste {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("Java completo");
        Curso curso2 = new Curso("Javascript completo");
        Curso curso3 = new Curso("Python completo");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);
        
        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        for (Aluno aluno: curso1.alunos) {
            System.out.println("Estrou matriculado no curso 1...");
            System.out.println("...E o meu nome é " + aluno.nome);
            System.out.println();
        }
    }

}
