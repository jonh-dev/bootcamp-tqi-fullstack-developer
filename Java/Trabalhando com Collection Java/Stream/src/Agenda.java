import java.util.*;
import java.util.function.Function;

public class Agenda {

    public static void main(String[] args) {

        System.out.println();

        System.out.println("--\tOrdem aleatória\t--");
        Map<Integer, Contato> agenda = new HashMap<>() {{
            put(1, new Contato("Sael", 5555));
            put(4, new Contato("Mayara", 1111));
            put(3, new Contato("Jonh", 2222));
        }};

        for (Map.Entry<Integer, Contato> contato : agenda.entrySet()) {
            System.out.println(contato.getKey() + " - " + contato.getValue().getNome());
        }


        System.out.println();


        System.out.println("--\tOrdem Inserção\t--");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>() {{
            put(1, new Contato("Sael", 5555));
            put(4, new Contato("Mayara", 1111));
            put(3, new Contato("Jonh", 2222));
        }};

        for (Map.Entry<Integer, Contato> contato : agenda1.entrySet()) {
            System.out.println(contato.getKey() + " - " + contato.getValue().getNome());
        }

        System.out.println();


        System.out.println("--\tOrdem ID\t--");
        Map<Integer, Contato> agenda2 = new TreeMap<>() {{
            put(1, new Contato("Sael", 5555));
            put(4, new Contato("Mayara", 1111));
            put(3, new Contato("Jonh", 2222));
        }};

        for (Map.Entry<Integer, Contato> contato : agenda2.entrySet()) {
            System.out.println(contato.getKey() + " - " + contato.getValue().getNome());
        }

        System.out.println();


        System.out.println("--\tOrdem Número\t--");
//        Set<Map.Entry<Integer, Contato>> agenda3 = new TreeSet<>(new Comparator <Map.Entry<Integer, Contato>>(){
//            @Override
//            public int compare(Map.Entry<Integer, Contato> c1, Map.Entry<Integer, Contato> c2) {
//                return Integer.compare(c1.getValue().getNumero(), c2.getValue().getNumero());
//            }
//         });

//        Set<Map.Entry<Integer, Contato>> agenda3 = new TreeSet<>(Comparator.comparing(
//                new Function<Map.Entry<Integer,Contato>, Integer>() {
//                    @Override
//                    public Integer apply(Map.Entry<Integer, Contato> cont) {
//                        return cont.getValue().getNumero();
//                    }
//                }));

        Set<Map.Entry<Integer, Contato>> agenda3 = new TreeSet<>(Comparator.comparing(
                cont -> cont.getValue().getNumero()));

        agenda3.addAll(agenda.entrySet());

        for (Map.Entry<Integer, Contato> contato : agenda3) {
            System.out.println(contato.getKey() + " - " + contato.getValue().getNome() + " - " + contato.getValue().getNumero());
        }

        System.out.println();


        System.out.println("--\tOrdem Nome\t--");
//        Set<Map.Entry<Integer, Contato>> agenda4 = new TreeSet<>(new ComparatorNome());

        Set<Map.Entry<Integer, Contato>> agenda4 = new TreeSet<>(Comparator.comparing(
                cont -> cont.getValue().getNome()
        ));
        agenda4.addAll(agenda.entrySet());


        for (Map.Entry<Integer, Contato> contato : agenda4) {
            System.out.println(contato.getKey() + " - " + contato.getValue().getNome() + " - " + contato.getValue().getNumero());
        }



    }

}

class ComparatorNome implements Comparator <Map.Entry<Integer, Contato>> {

    @Override
    public int compare(Map.Entry<Integer, Contato> c1, Map.Entry<Integer, Contato> c2) {
        return c1.getValue().getNome().compareToIgnoreCase(c2.getValue().getNome());
    }
}
