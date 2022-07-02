import java.util.Scanner;

public class Ex06_Fatorial {
    // Criando o método fatorial
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Pedindo para inserir o numero que será o fatorial
        System.out.print("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        // Colocando no console que o fatorial do número escolhido é igual a.
        System.out.print(fatorial + "! = ");
        // Contador igual ao fatorial, contador tem que ser maior ou igual a 1, e então decrementa-lo.
        for (int i = fatorial; i >= 1; i--) {
            // Fatorial é o contador vezes a variável de multiplicação.
            multiplicacao = multiplicacao * i;
        }

        // Mostrando o valor da multiplicação do fatorial.
        System.out.print(multiplicacao);
    }

}
