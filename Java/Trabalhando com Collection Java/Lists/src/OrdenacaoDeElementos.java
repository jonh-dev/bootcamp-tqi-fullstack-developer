import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoDeElementos {

    public static void main(String[] args) {
        // Criando uma list
        List<Gato> meusGatos = new ArrayList<>(){{
            // Criando um array
            add(new Gato("Jon", 18, "Preto"));
            add(new Gato("Simba", 6, "Tigrado"));
            add(new Gato("Jon", 12, "Amarelo"));
        }};

        System.out.println("--\tOrdem de Inserção\t--");
        System.out.println(meusGatos);

        System.out.println("--\tOrdem aleatória\t--");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Natural (Nome)\t--");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Idade\t--");
        Collections.sort(meusGatos, new ComparatorIdade());
//      meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Cor\t--");
//      Collections.sort(meusGatos, new ComparatorCor());
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Nome/Cor/Idade\t--");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);

    }

}

class Gato implements Comparable<Gato>{ // Criando classe Comparable
    // Chamando as 3 variaveis em modo private
    private String nome;
    private Integer idade;
    private String Cor;
    // Chamando a classe gato em modo constructor
    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        Cor = cor;
    }
    // Chamando cada dado em operação get
    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return Cor;
    }
    // Chamando a classe gato em to String
    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", Cor='" + Cor + '\'' +
                '}';
    }
    // Finalizando com o método compareTo
    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato>{ // Iniciando classe comparator

    @Override
    public int compare(Gato g1, Gato g2) { // Método comparator para a idade dos gatos
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato>{ // Iniciando método comparator cor

    @Override
    public int compare(Gato g1, Gato g2) { // Método comparator para a cor dos gatos
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato>{ // Iniciando método comparator para Nome Cor e Idade dos gatos

    @Override
    public int compare(Gato g1, Gato g2) { // Começando pelo nome, cor e por ultimo idade para ordenar os gatos.
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}
