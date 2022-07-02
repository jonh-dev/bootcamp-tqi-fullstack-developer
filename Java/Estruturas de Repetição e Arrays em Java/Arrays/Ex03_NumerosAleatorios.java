import java.util.Random;

public class Ex03_NumerosAleatorios {

    public static void main(String[] args) {
        // Chamando o elemento Random do Java
        Random random = new Random();

        // Inserindo uma variavel array com 20 posições.
        int [] numerosAleatorios = new int[20];

        // Para o contador que é 0, o mesmo deve ser menor que o tamanho de numerosAleatorios, por fim acrescente 1 ao contador.
        for (int i = 0; i < numerosAleatorios.length; i++) {
            // Pegando um número aleatório de 0 a 100
            int numero = random.nextInt(100);
            // Atribuindo numero a variavel numerosAleatorios.
            numerosAleatorios [i] = numero;
        }
        // Imprimindo Números Aleatórios
        System.out.print("Números Aleatórios: ");
        // Para cada numero dentro do array numeroAleatorios
        for (int numero : numerosAleatorios ) {
            // Imprimindo a variavel numero com espaço.
            System.out.print(numero + " ");
        }
        // Imprimindo Sucessores dos Números Aleatórios.
        System.out.print("\nSucessores dos Números Aleatórios: ");
        // Para cada numero dentro do array numeroAleatorios
        for (int numero : numerosAleatorios ) {
            // Imprimindo a variavel numero acrescentando mais 1 e com espaço.
            System.out.print((numero + 1) + " ");
        }

    }

}
