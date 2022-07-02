import java.util.Scanner;

public class Ex05_Tabuada {
    // Criando Método
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Pedindo para inserir qual tabuada deseja ver o resultado.
        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        // Mostrando a tabuada que foi escolhida.
        System.out.println("Tabuada de " + tabuada);

        // Se contador for menor ou igual a 10 então acrescente 1 ao contador.
        for (int i = 1; i <= 10; i++) {
            // Mostre na tela numero da tabuada escolhido vezes contador atual = resultado.
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
        }
    }

}
