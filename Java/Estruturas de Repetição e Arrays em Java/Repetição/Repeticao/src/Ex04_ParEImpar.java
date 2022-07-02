import java.util.Scanner;

public class Ex04_ParEImpar {
    // Criando método ParEImpar
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Criando Variáveis
        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        // Pedindo para inserir a quantidade de números
        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        int count = 0;

        do {
            // Pedindo para inserir um número
            System.out.println("Número: ");
            numero = scan.nextInt();

            // Se o número inserido do dividi-lo sobrar 0 aumente a quantidade de pares, caso contrario aumente a divisão de impares
            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            // Aumentando o número do contador dentro do do while.
            count++;

        } while (count < quantNumeros);

        // Mostrando a quantidade de números pares e a quantidade de números impares.
        System.out.println("Quantidade de Pares: " + quantPares);
        System.out.println("Quantidade de Impares: " + quantImpares);
    }

}
