import java.util.Scanner;

public class Ex01_NomeIdade {

    public static void main(String[] args) {
        // Linha abaixo usado para escrever valores
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {
            System.out.println("Nome: ");
            // Scan usado para escrever o valor da variavel nome
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            // Scan usado para escrever o valor da variavel idade
            idade = scan.nextInt();
        }

        System.out.println("Continua aqui...");

    }

}
