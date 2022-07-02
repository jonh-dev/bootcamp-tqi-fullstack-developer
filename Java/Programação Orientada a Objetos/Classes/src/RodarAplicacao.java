public class RodarAplicacao {

    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("Audio A3");
        carro1.setCapacidadeDoTanque(59);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeDoTanque());
        System.out.println(carro1.totalValorTanque(7.10));

        System.out.println("---------- // ----------");

        Carro carro2 = new Carro("Roxo", "Fox Confort Line", 70);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeDoTanque());
        System.out.println(carro2.totalValorTanque(7.10));


    }

}
