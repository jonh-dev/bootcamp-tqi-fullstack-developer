public class Main {

    public static void main(String[] args) {
        Cliente joao = new Cliente();
        joao.setNome("João Carlos");

        ContaCorrente cc = new ContaCorrente(joao);
        ContaPoupanca cp = new ContaPoupanca(joao);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }

}
