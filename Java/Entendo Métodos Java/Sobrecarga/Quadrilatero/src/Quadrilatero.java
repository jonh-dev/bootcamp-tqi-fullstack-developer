package Quadrilatero.src;
public class Quadrilatero {
   // Criando método para quadrado
  public static void area(double lado) {
    // Mostrando a area do quadrado que é lado * lado.
    System.out.println("Área do quadrado:" + lado * lado);
  }
  // Criando método para retângulo com Sobrecarga
  public static void area(double lado1, double lado2) {
    // Mostrando a area do retângulo que é lado1 * lado2. Pois possuem lados diferentes em pares.
    System.out.println("Área do retângulo:" + lado1 * lado2);
  }

  // Criando método para trapézio com Sobrecarga
  public static void area(double baseMaior, double baseMenor, double altura) {
    // Mostrando a area do trapézio que é baseMaior + baseMenor * altura / 2. 
    System.out.println("Área do trapézio:" + ((baseMaior+baseMenor)*altura) / 2);
  }

  // Criando método para Losango com Sobrecarga
  public static void area(float diagonal1, float diagonal2) {
    // Mostrando a area do Losango que é Losango * Losango / 2. 
    System.out.println("Área do Losango:" + (diagonal1 * diagonal2) / 2);
  }

}
