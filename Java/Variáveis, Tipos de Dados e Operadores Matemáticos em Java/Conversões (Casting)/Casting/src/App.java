package src;

public class App {
    public static void main(String[] args){
        
        byte b1;

        short s1 = 1000; // Downcast, vai haver perda

        b1 = (byte) s1;


        long l1;

        int i1 = 10; // Upcast, promovemos inteiro para long. Está sobrando espaço.

        l1 = i1;


        int i2;

        long l2 = 100000000000000L; // Downcast, haverá perda.

        i2 = (int) l2;


        int i3;

        long l3 = 10000L; // Downcast, mas não haverá perda.

        i3 = (int) l3;


        double d1;

        float f1 = 10.5f; // Upcast, fará tranquilamente.

        d1 = f1;


        float f2;
        float f3;
        double d2 = 10000.58d; // Downcast, aqui não haverá perda.
        f2 = (float) d2;
        double d3 = 10000.58888888888888888888888888888888888888888888888888888888888d; // Downcast, aqui haverá perda.
        f3 = (float) d3;


        int i4;
        float f4 = 11.5697f; // Downcast, haverá perda da parte fracionaria.
        i4 = (int) f4;

        System.out.println("b1: " + b1);
        System.out.println("l1: " + l1);
        System.out.println("i2: " + i2);
        System.out.println("i3: " + i3);
        System.out.println("d1: " + d1);
        System.out.println("f2: " + f2);
        System.out.println("f3: " + f3);
        System.out.println("i4: " + i4);

        b1 = (byte) d3;

        System.out.println("b1: " + b1);
    }
}
