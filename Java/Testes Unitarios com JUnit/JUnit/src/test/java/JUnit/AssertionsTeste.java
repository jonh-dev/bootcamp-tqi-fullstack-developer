package JUnit;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

public class AssertionsTeste {

    @Test
    void validarLancamentos(){

        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {-1, 5, 2, 3, 10};

        assertNotEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarSeObjetoEstaNulo(){

        Pessoa pessoa = null;

        assertNull(pessoa);

        pessoa = new Pessoa("Jonh", LocalDate.now());

        assertNotNull(pessoa);
    }

    @Test
    void ValidarNumerosDeTiposDiferentes(){

        double valor = 5.0;
        double outroValor = 5.0;

        assertEquals(valor, outroValor);
    }

}
