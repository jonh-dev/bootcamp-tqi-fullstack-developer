import java.util.Random;

public class Ex04_ArrayMultidimensional {

    public static void main(String[] args) {
        // Classe random para chamar numeros aleatórios
        Random random = new Random();

        // Declara uma variavel array com matriz multidimensional
        int [][] M = new int [4][4];

        // Para contador i inicia em 0, o contador deve ser menor que o tamanho do array M, então acrescente mais 1 ao contador.
        for (int i = 0; i < M.length; i++){
            // Para contador j inicia em 0, o contador deve ser menor que o tamanho da linha, então acrescente mais 1 a cada loop i.
            for (int j = 0; j < M[i].length; j++){
                // Atribuindo numeros aleatórios de 0 a 9 a variavel array M
                M[i][j] = random.nextInt(9);

            }

        }

        // Imprimi Matriz
        System.out.println("Matriz: ");
        // Para cada linha da matriz M
        for (int[] linhaM : M ) {
            // Pegue a coluna desta linha M
            for (int colunaM : linhaM ) {
                // Imprima está coluna
                System.out.print(colunaM + " ");
            }
            // Para pular linha ao final.
            System.out.println();
        }
    }

}
