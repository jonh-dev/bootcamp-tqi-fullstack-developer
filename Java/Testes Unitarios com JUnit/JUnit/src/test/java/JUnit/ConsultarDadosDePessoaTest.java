package JUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class ConsultarDadosDePessoaTest {

    @BeforeAll
    static void configurarConexao(){
        BancoDeDados.iniciarConexao();
        System.out.println("Rodou Configurar Conexão");
    }

    @BeforeAll
    static void insereDadosParaTeste(){
        BancoDeDados.insereDados(new Pessoa("João", LocalDate.of(1991, 5, 26)));
    }

    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void removeDadosParaTeste(){
        BancoDeDados.removeDados(new Pessoa("João", LocalDate.of(1991, 5, 26)));
    }

    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
        System.out.println("Rodou Finalizar Conexão");
    }
}
