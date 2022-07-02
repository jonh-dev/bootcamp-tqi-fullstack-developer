package Quadrilatero_Return.src;

public class MainReturn {
  // Criando o método main que chama os métodos criados
  public static void main(String[] args) {

    // Retornos Quadrilátero
    System.out.println("Exercício retornos");
    
    // Criando uma variavel areaQuadrado que é = ao método criado.
    double areaQuadrado = QuadrilateroReturn.area(3);
    // Mostrando no console que a área do quadrado é a variavel acima.
    System.out.println("Área do quadrado:" + areaQuadrado);

    // Criando uma variavel areaRetangulo que é = ao método criado.
    double areaRetangulo = QuadrilateroReturn.area(5d, 5d);
    // Mostrando no console que a área do Retângulo é a variavel acima.
    System.out.println("Área do Retângulo:" + areaRetangulo);

    // Criando uma variavel areaTrapezio que é = ao método criado.
    double areaTrapezio = QuadrilateroReturn.area(7, 8, 9);
    // Mostrando no console que a área do Trapézio é a variavel acima.
    System.out.println("Área do Trapézio:" + areaTrapezio);

    // Criando uma variavel areaLosango que é = ao método criado.
    float areaLosango = QuadrilateroReturn.area(5f, 5f);
    // Mostrando no console que a área do Losango é a variavel acima.
    System.out.println("Área do Losango:" + areaLosango);

    
  }
}
