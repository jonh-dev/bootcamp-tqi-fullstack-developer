public class App {
    // Criando método main
    public static void main(String[] args) {
        
        // Criando variáveis booleanas

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        // b1 e b2 = false / b1 e b3 = true
        System.out.println("b1 && b2 " + (b1 && b2));
        System.out.println("b1 && b3 " + (b1 && b3));

        // b2 ou b3 = true / b2 ou b4 = false
        System.out.println("b2 || b3 " + (b2 || b3));
        System.out.println("b2 || b4 " + (b2 || b4));

        //b1 xor b3 = false / b4 xor b1 = true
        System.out.println("b1 ^ b3 " + (b1 ^ b3));
        System.out.println("b4 ^ b1 " + (b4 ^ b1));

        // b1 não é true = false / b2 não é false = true
        System.out.println(!b1);
        System.out.println(!b2);

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;

        // 10 + 5 é menor que 50 - 20 e é verdadeiro? Sim é menor e é true.
        System.out.println("((i1 + i2) < (f2 - f1)) && true " + (((i1 + i2) < (f2 - f1)) && true));
        // 10 é maior que 5? ou 50 é menor que 20? true pois 10 é maior que 5 e o operador lógico usado é ou. 
        System.out.println("(i1 > i2) || (f2 < f1) " + ((i1 > i2) || (f2 < f1)));

        // Criando variaveis para salario e media salarial
        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        // Criando variaveis para quantidade de dependentes e a media dos mesmos
        int quantidadeDependentes = 4;
        int mediaDepentendes = 2;

        // Salario mensal é menor que media salaria e quantidade de dependentes é maior ou igual a media de dependentes = false pois o salario mensal está acima da media salarial.
        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDepentendes));

        // Criando variaveis booleanas para definir se salario é baixo e se há muitos dependentes
        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes <= mediaDepentendes;

        // Salario é baixo? e possui muitos dependentes? = falso novamente, mesmas descrição acima.
        System.out.println((salarioBaixo) && (muitosDependentes));

        // Criando variavel para conferir se o mesmo recebera auxilio de acordo com a expressão
        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        // Ele receberá o auxilio? Falso, pois o salario é acima da média.
        System.out.println("recebeAuxilio " + recebeAuxilio);




    }
}
