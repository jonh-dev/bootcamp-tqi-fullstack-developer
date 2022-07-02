import java.util.Scanner;

public class Ex03_MaiorMedia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        int count = 0;

        do {
            // Pedindo um número
            System.out.println("Número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            // se número for maior que a variavel maior, maior será igual a numero.
            if (numero > maior) maior = numero;

            // Aumenta 1 a cada repetição
            count = count + 1;

            // Esse contador é menor que 5? Se sim continue se não finalize.
        } while (count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + soma / 5);
    }
}
