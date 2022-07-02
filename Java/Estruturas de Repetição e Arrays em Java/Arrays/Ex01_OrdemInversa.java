public class Ex01_OrdemInversa {
    // Criando método Ordem Inversa
    public static void main(String[] args) {
        // Criando variável vetor com 5 elementos.
        int [] vetor = {0, -10, 80, 45, 63, 13};

        // Mostrando na tela todo o vetor.
        System.out.println(vetor);

        // Mostra na tela Vetor:
        System.out.print("Vetor: ");

        int count = 0;

        // Enquanto count for menor ou igual ao tamanho do vetor -1(tamanho do vetor é 6 começando de 1, com isso será 5 começando de 0)
        while (count <= (vetor.length -1)) {
            // Mostre na tela o vetor e o contador em ordem crescente.
            System.out.print(vetor[count] + " ");
            // Acrescente o count.
            count++;
        }

        // Mostrando mais uma vez o vetor.
        System.out.print("\nVetor: ");

        // Para contador ser igual à quantidade do vetor -1, e contador seja maior ou igual 0, decrescente o contador.
        for(int i = vetor.length -1; i >= 0; i--) {
            // Mostra na tela vetor em ordem decrescente. (Com esse for o contador será inverso.)
            System.out.print(vetor[i] + " ");
        }

    }

}
