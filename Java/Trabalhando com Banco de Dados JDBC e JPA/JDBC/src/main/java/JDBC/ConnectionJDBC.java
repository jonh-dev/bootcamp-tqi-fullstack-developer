package main.java.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {

    //Construtor declarado como privado. Evitando assim criar instâncias da fábrica.
    private ConnectionJDBC() {
        throw new UnsupportedOperationException();
    }

    public static Connection getConnection() {

        // OBS: NÃO ESQUECER DE BAIXAR O DRIVER PARA O BANCO DE DADOS QUE IRÁ UTILIZAR! (Como demonstrado na parte 1 do curso)

        // 1 - Declarar objeto conexão (irá receber uma conexão após executar os passos abaixo)

        Connection connection = null;

        // 2 - Carregar arquivo de propriedades para pegar parâmetros necessários para se comunicar com o banco de dados.

        String driver = "mysql";
        String dataBaseAddress = "localhost:3305";
        String dataBaseName = "java";
        String user = "root";
        String password = "Mjs27042021";

        // 4 - Construção da string de conexão.

        StringBuilder sb = new StringBuilder("jdbc:")
                .append(driver).append("://")
                .append(dataBaseAddress).append("/")
                .append(dataBaseName);

        String connectionUrl = sb.toString(); //sb.toString() == "jdbc:mysql://localhost:3305/java"

        // 5 - Criar conexão usando o DriverManager, passando como parâmetros a string de conexão, usuário e senha do usuário.
        try {
            connection = DriverManager.getConnection(connectionUrl, user, password);
        } catch (SQLException e) {
            System.out.println("FALHA ao tentar criar conexão");
            throw new RuntimeException(e);
        }


        return connection;
    }
}
