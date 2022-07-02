public class RodarAplicacao {

    public static void main(String[] args) {
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        // Comportamento Polimorfico
        for (ClasseMae classe: classes) {
            classe.metodo1();
        }

        System.out.println("");
        // Teve polimorfismo somente no método do da Classe Filha 2
        for (ClasseMae classe: classes) {
            classe.metodo2();
        }

        System.out.println("");

        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
    }

}
