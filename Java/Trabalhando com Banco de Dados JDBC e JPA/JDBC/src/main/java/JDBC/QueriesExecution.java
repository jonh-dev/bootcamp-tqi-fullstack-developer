package main.java.JDBC;

import java.util.List;

public class QueriesExecution {

    public static void main(String[] args) {

        AlunoDAO alunoDAO = new AlunoDAO();

        // =========================== 1 - Consulta =================================================
        List<Aluno> alunos = alunoDAO.list();

        //alunos.forEach(System.out::println);


        // ======================= 1.1 - Consulta com filtro ========================================
        Aluno alunoParaConsulta = alunoDAO.getById(3);

        //System.out.println(alunoParaConsulta);


        // =========================== 2 - Inserção =================================================
        Aluno alunoParaInsercao = new Aluno(
                "Matheus",
                43,
                "SP"
        );

        //alunoDAO.create(alunoParaInsercao);


        // =========================== 3 - Delete ===================================================
        //alunoDAO.delete(1);


        // =========================== 4 - Atualizar ================================================
        Aluno alunoParaAtualizar = alunoDAO.getById(4);
        alunoParaAtualizar.setNome("Maria");
        alunoParaAtualizar.setIdade(54);
        alunoParaAtualizar.setEstado("PR");

        alunoDAO.update(alunoParaAtualizar);

        alunoDAO.list().forEach(System.out::println);
    }

}


