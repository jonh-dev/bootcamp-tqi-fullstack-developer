package JUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void validarCalculoDeIdade() {
        Pessoa joao = new Pessoa("João", LocalDate.of(1991, 5, 26));
        Assertions.assertEquals(31, joao.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade(){
        Pessoa mayara = new Pessoa("Mayara", LocalDate.of(1990, 12, 6));
        Assertions.assertTrue(mayara.ehMaiorDeIddade());

        Pessoa sael = new Pessoa("Sael", LocalDate.of(2021, 4, 27));
        Assertions.assertFalse(sael.ehMaiorDeIddade());
    }

}
