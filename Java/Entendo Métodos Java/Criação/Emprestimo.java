public class Emprestimo {
  // Criando método para resolver emprestimos.

  // Método para 2 parcelas.
  public static int getDuasParcelas() {
    return 2;
  }

  // Método para 3 parcelas.
  public static int getTresParcelas() {
    return 3;
  }

  // Método para saber a taxa de 2 parcelas.
  public static double getTaxaDuasParcelas() {
    return 0.3;
  }

  // Método para saber a taxa de 2 parcelas.
  public static double getTaxaTresParcelas() {
    return 0.45;
  }

  // Método para calcular a taxa dependendo da quantidade de parcelas escolhidas.
  public static void calcular(double valor, int parcelas) {
    
    // Se parcelas for = a 2
    if (parcelas == 2) {
      // o valor final é = valor indicado + (valor indicado * taxa de duas parcelas)
      double valorFinal = valor + (valor * getTaxaDuasParcelas());
      // Chama o valor final do empréstimo para 2 parcelas.
      System.out.println("Valor final do empréstimo para 2 parcelas: R$ " + valorFinal);
      // Se parcelas for == a 3
    } else if (parcelas == 3) {
      // o valor final é = valor indicado + (valor indicado * taxa de três parcelas)
      double valorFinal = valor + (valor * getTaxaTresParcelas());
      // Chama o valor final do empréstimo para 3 parcelas.
      System.out.println("Valor final do empréstimo para 3 parcelas: R$ " + valorFinal);
      // Caso não seja colocado o valor de parcelas exposta nesta classe
    } else {
      // Aparecerá está frase
      System.out.println("Quantidade de parcelas não existe.");
    }
  }
}
