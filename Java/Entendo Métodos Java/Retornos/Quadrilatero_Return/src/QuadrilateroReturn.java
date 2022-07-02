package Quadrilatero_Return.src;

public class QuadrilateroReturn {
   // Criando método para quadrado
  public static double area(double lado) {
    // Retorna lado * lado e finaliza.
    return lado * lado;
  }
  // Criando método para retângulo com Sobrecarga
  public static double area(double lado1, double lado2) {
    // Retorna lado1 * lado2 e finaliza.
    return lado1 * lado2;
  }

  // Criando método para trapézio com Sobrecarga
  public static double area(double baseMaior, double baseMenor, double altura) {
    // Retorna baseMaior + baseMenor * altura / 2.
    return ((baseMaior + baseMenor) * altura) / 2;
  }

  // Criando método para Losango com Sobrecarga
  public static float area(float diagonal1, float diagonal2) {
    // Retorna diagonal1 * diagonal2 / 2.
    return (diagonal1 * diagonal2) / 2;
  }

}
