public class Dados {
    public static void main(String[] args) {
      

      byte b1 = 10;

      byte b2 = 20;

      short s1 = 20000;

      // short s2 = 40800; Passando o limite do short

      // int i1 = 1000000000; Inferior ao limite de dados

      int i2 = 28500;

      long l1 = 10000000000000L; // Precisa ter o L ao final da variavel

      long l2 = 20008414210000L; // Precisa ter o L ao final da variavel

      // float f1 = 4.5; Precisa ser posto o f ao final para ser considerado float

      float f2 = 10.68f;

      double d1 = 85.69; // Mesmo não colocar o d, ele ja infere como double em default

      double d2 = 99.04d;



      char c1 = 'w';

      // char c2 = 'Tw'; o char não pode chamar mais de 1 caracter.

      char c3 = '\u0057'; // Neste caso ele chamaria a mesma letra W do c1.



      String st1 = "Fulano";

      String st2 = "Cicrano";

      String st3 = "af dgv asds kkaskdll alsdlas";

      // String dt1 = "26/05/1991"; Não é o correto a se fazer para trabalhar com datas.

      boolean bo1 = true;

      boolean bo2 = false;


      System.out.println(b1);
      System.out.println(b2);
      System.out.println(s1);
      System.out.println(i2);
      System.out.println(l1);
      System.out.println(l2);
      System.out.println(f2);
      System.out.println(d1);
      System.out.println(d2);

      System.out.println(c1);
      System.out.println(c3);

      System.out.println(st1);
      System.out.println(st2);
      System.out.println(st3);

      System.out.println(bo1);
      System.out.println(bo2);

    }
}