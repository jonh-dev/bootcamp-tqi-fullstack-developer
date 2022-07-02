import java.util.Scanner;

public class Ex02_Consoantes {
    // Criando método consoantes
    public static void main(String[] args) {

        // Abertura da entrada de fluxo de dados através do teclado
        Scanner scan = new Scanner(System.in);

        // Iniciando um arrays vazio com 6 posições
        String[] consoantes = new String[6];

        int quantConsoantes = 0;

        // Controla o loop
        int count = 0;

        do {

            // Escolha uma letra.
            System.out.println("Letra: ");

            // Guarde a letra escolhida e atribua uma variável a mesma.
            String letra = scan.next();

            // Se a letra for a, e, i, o, u ignore-as.
            if (! (letra.equalsIgnoreCase("a") |
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase("i") |
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u"))
            ) {
                // Atribua a letra o elemento do vetor, para que letra possa ser contada, caso seja consoante.
                consoantes[count] = letra;
                quantConsoantes++;
            }

            // Acrescentando valor 1 ao contador.
            count++;

            // Enquanto o contador for menor que o tamanho da array consoantes. Faça-se o loop.
        } while (count < consoantes.length);

        // Chamando a quantidade de consoantes
        System.out.println("Consoantes: ");

        // Para cada consoante dentro do array consoantes
        for (String consoante : consoantes ) {
            // Se for diferente de null
            if (consoante != null)
                // Imprima a consoante
                System.out.println(consoante + " ");
        }
        // Imprime a quantidade de consoantes.
        System.out.println("Quantidade de consoantes: " + quantConsoantes);
    }

}
