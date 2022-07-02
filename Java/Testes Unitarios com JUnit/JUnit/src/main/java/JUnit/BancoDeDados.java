package JUnit;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());
    // Iniciou a conexão
    public static void iniciarConexao(){
        LOGGER.info("Iniciou conexão");
    }
    // Finalizou a Conexão
    public static void finalizarConexao(){
        LOGGER.info("Finalizou conexão");
    }

    public static void insereDados(Pessoa pessoa){
        //Insere pessoa no DB
        LOGGER.info("Inseriu Dados");
    }

    public static void removeDados(Pessoa pessoa){
        //Remove pessoa no DB
        LOGGER.info("Remove Dados");
    }
}
