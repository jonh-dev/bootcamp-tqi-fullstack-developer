package JUnit;

public class Conta {

    public String nome;

    public int numeroConta;

    public int agencia;

    public Conta(String nome, int numeroConta, int agencia) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nome='" + nome + '\'' +
                ", numeroConta=" + numeroConta +
                ", agencia=" + agencia +
                '}';
    }
}
