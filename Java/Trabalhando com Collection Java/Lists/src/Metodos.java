import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Metodos {

    public static void main(String[] args) {

       //  List notas = new ArrayList(); Antes do Java 5
       //  List<Double> notas = new ArrayList<>(); Generics (jdk 5) - Diamond Operator (jdk 7 )
       //  ArrayList<Double> notas = new ArrayList<>(); Não recomendado fazer desta forma.
       //  List<Double> notas = new ArrayList<>(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
       //  List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
       //  notas.add(1d); Método não convencional, pois apresenta erro.
       //  notas.remove(5d);

        // Imprima a frase abaixo
        System.out.println("Crie uma lista e adicione as sete notas: ");

        // Criando uma lista em array com as notas abaixo.
        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        // Imprimindo as notas com toString
        System.out.println(notas.toString());

        // Imprimindo a posição da nota 5
        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        // Adicionando a lista a nota 8.0 na posição 4
        System.out.println("Adicione a lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        // Imprimindo as notas para conferir se a nota 8.0 foi inserida
        System.out.println(notas);

        // Substitui a nota 5.0 pela nota 6.0
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        // Imprimi notas para conferir se a nota 5.0 foi substituida
        System.out.println(notas);

        // Conferindo se a nota 5.0 está na lista
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        // Imprimi todas as notas em na ordem que foram informadas no inicio do método
        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota: notas) System.out.println(nota);

        // Exibe a terceira nota adicionada.
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        // Exibe a menor nota da lista
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        // Exibe a maior nota da lista
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        // Método para fazer a soma das notas
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        // Enquanto tiver proximo elemento o loop continua
        while (iterator.hasNext()){
            // O proximo elemento vira next
            Double next = iterator.next();
            // E aqui se efetua a soma dos 2 elementos
            soma += next;
        }
        // Imprimi os valores da soma total das notas
        System.out.println("Exiba a soma dos valores: " + soma);

        // Imprimi a média das notas
        System.out.println("Exiba a média das notas: " + (soma/ notas.size()));

        // Remove a nota 0
        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        // O mesmo procedimento feito anteriormente
        System.out.println("Remova a nota da posição 0");
        notas.remove(0d);
        System.out.println(notas);

        // Remove as notas menores que 7
        System.out.println("Remova as notas menores que 7 e exiba na lista: ");
        // Cria variavel interator para essa finalidade
        Iterator<Double> iterator1 = notas.iterator();
        // Enquanto tiver proximo elemento o loop continua
        while (iterator1.hasNext()){
            // Aqui o elemento atual se une ao proximo
            Double next = iterator1.next();
            // Se o proximo elemento for menor que 7 então remova-o
            if (next < 7) iterator1.remove();
        }

        // Imprimi notas para conferir o método anterior
        System.out.println(notas);

        // Apaga toda a lista
        System.out.println("Apague toda a lista");
        notas.clear();
        // Imprimi notas para conferir se está vazio
        System.out.println(notas);

        // Confere se a lista está vazia.
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());


    }

}
