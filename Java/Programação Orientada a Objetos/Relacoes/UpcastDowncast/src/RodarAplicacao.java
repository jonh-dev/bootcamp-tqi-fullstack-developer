public class RodarAplicacao {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        // UpCast implicitos
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        // DownCast deve evitado, pois sempre dará erro
        Vendedor vendedor_ = (Vendedor) new Funcionario();

    }

}
