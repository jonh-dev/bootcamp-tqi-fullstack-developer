import java.util.*;

public class Map {

    public static void main(String[] args) {

        System.out.println();

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos produtos: ");
        java.util.Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("Hb20", 14.5);
            put("Kwid", 15.6);
        }};

        System.out.println(carrosPopulares.toString());

        System.out.println();

        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("Gol", 16.1);
        System.out.println(carrosPopulares);

        System.out.println();

        System.out.println("Confira se o modelo Tucson está no dicionário: " + carrosPopulares.containsKey("Tucson"));

        System.out.println();

        System.out.println("Exiba o consumo do uno:" + carrosPopulares.get("Uno"));

        System.out.println();

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println();

        System.out.println("Exiba o consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println();

        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());

        Set<java.util.Map.Entry<String, Double>> entries = carrosPopulares.entrySet();

        String modeloMaisEficiente = "";

        for (java.util.Map.Entry<String, Double> entry: entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }

        System.out.println();

        System.out.println("Exiba o modelo menos econômico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";

        for (java.util.Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }

        System.out.println();


        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;

        while (iterator.hasNext()) {
            soma += iterator.next();
        }

        System.out.println("Exiba a soma dos consumos: " + soma);

        System.out.println("Exiba a média dos consumos deste dicionário de carros: " + (soma/carrosPopulares.size()));

        System.out.println();

        Iterator<Double> iterator1 = carrosPopulares.values().iterator();

        while (iterator1.hasNext()) {
            if (iterator1.next().equals(15.6)) iterator1.remove();
        }

        System.out.println(carrosPopulares);


        System.out.println();


        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        java.util.Map<String, Double> carrosPopulares1 = new HashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("Hb20", 14.5);
            put("Kwid", 15.6);
        }};

        System.out.println(carrosPopulares1.toString());

        System.out.println();

        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        java.util.Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);

        System.out.println(carrosPopulares2.toString());

        System.out.println();

        System.out.println("Apague o dicionário de carros: ");
        carrosPopulares.clear();

        System.out.println();

        System.out.println("Confira se o dicionário está vazio: " + carrosPopulares.isEmpty());

    }

}
