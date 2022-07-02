package part2;

import classes.Aluno;
import classes.Estado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ExecutionPart2 {
    public static void main(String[] args) {

        // OBS: Esse codigo deve executar SEM ERROS com a implementacao JPA que foi definida no "persistence.xml".
        // Se estiver somente com o JPA baixado, o codigo NAO IRA funcionar.

        // O ideal é que nessa parte (Parte 2) o codigo EXECUTE SEM ERROS, pois aqui tera uma implementacao JPA sendo utilizada.

        // 1 - Passos iniciais para criar um gerenciadop de entidades com o banco de dados especificado no arquivo  "persistence.xml"
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("part2-DIO");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // 2.1 - Criar instancias para serem adicionadas no banco de dados
        Estado estadoParaAdicionar = new Estado("Paraná", "PR");
        Aluno alunoParaAdicionar1 = new Aluno("Mayara", 31, estadoParaAdicionar);
        Aluno alunoParaAdicionar2 = new Aluno("Joao", 31, estadoParaAdicionar);

        // 2.2 - Iniciar uma trasacao para adiconar as instancias no banco de dados
        entityManager.getTransaction().begin();

        entityManager.persist(estadoParaAdicionar);
        entityManager.persist(alunoParaAdicionar1);
        entityManager.persist(alunoParaAdicionar2);

        entityManager.getTransaction().commit();

        // 3 - Resgatar instâncias no banco de dados
        Estado estadoEncontrado = entityManager.find(Estado.class, 1);
        Aluno alunoEncontrado = entityManager.find(Aluno.class, 1);

        System.out.println(estadoEncontrado);
        System.out.println(alunoEncontrado);

        // 4 - Alterar uma entidade
        entityManager.getTransaction().begin();

        alunoEncontrado.setNome("Igor");
        alunoEncontrado.setIdade(24);

        entityManager.getTransaction().commit();

        // 5 - Remover uma entidade
        entityManager.getTransaction().begin();

        entityManager.remove(alunoEncontrado);

        entityManager.getTransaction().commit();

        // 6 - Encerrar o gerenciador de entidades e encerrar a fabrica de gerenciadores de entidade.
        entityManager.close();
        entityManagerFactory.close();

    }
}