public class Main {
  // Criando Método main para execução do código.
  public static void main(String[] args) {
    // Códigos para execução do método calculadora
    System.out.println("Exercício calculadora");
    // Chamando métodos da calculadora.
    Calculadora.soma(3, 6);
    Calculadora.subtracao(9, 1.8);
    Calculadora.multiplicacao(7, 8);
    Calculadora.divisao(5, 2.5);


    // Códigos para execução do método mensagem
    System.out.println("Exercício mensagem");
    // Chamando métodos da mensagem.
    Mensagem.obterMensagem(9);
    Mensagem.obterMensagem(14);
    Mensagem.obterMensagem(1);

    // Códigos para execução do método empréstimo
    System.out.println("Exercício empréstimo");
    // Chamando métodos do empréstimo
    Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
    Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
    Emprestimo.calcular(1000, 5);

  }

}
