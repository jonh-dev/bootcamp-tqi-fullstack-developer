public class App {

    public static void main(String[] args) {

        // Exercitando variavéis

        int i;

        // int I; Variaveis do mesmo nome, mesmo sendo sensitivo não é boa prática.

        // int _1a; Não é uma boa prática iniciar com carecteres especiais.

        int $aq;

        i = 5;

        // I = 10;

        // _1a = 20;

        $aq = 7;

        final int j = 10;

         // j = 15; Está variável é final, então não pode ser alterada.

         int asrn24678md = 100;

         int asrn24678_md = 10;

         // int asrn246%78_md = 10; Variavél indevida, pois possui caractere especial reservado.


         int quantidadeProduto = 50;

         // int QuantidadeProduto; Não segue boas praticas de iniciar com letra minuscula.

         final int NUMERO_TENTATIVAS = 5;

         // final int numeroTentativas = 5; Não se pode usar camelCase em variaveis final.

         // int QUANTIDADE_OPCOES = 25; Não pode usar o modelo de uma final em variaveis comuns.

         // int qtdProd; Não é uma boa pratica abreviar a sua expressividade.

         System.out.println(i);
         System.out.println($aq);

         System.out.println(j);
         System.out.println(asrn24678md);
         System.out.println(asrn24678_md);

         System.out.println(quantidadeProduto);
         System.out.println(NUMERO_TENTATIVAS);
         

    }
}
