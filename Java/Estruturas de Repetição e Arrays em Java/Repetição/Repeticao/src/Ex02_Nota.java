import java.util.Scanner;

public class Ex02_Nota {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        // Se a nota for menor que 0 ou maior que 10 a frase nota invalida! digite novamente aparece.
        while (nota < 0 || nota > 10){
            System.out.println("Nota inválida! Digite novamente: ");
            nota = scan.nextInt();
        }
    }
}
