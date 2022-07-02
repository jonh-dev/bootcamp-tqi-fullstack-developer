public class App {
    // Criando método para inserir os outros métodos
    public static void main(String[] args) {
        
        // Chamando métodos abaixo do if.
        ifFlecha();
        ifSemFlecha();
        ifFerias();
        ifMenor();

        // Chamando métodos switch abaixo.
        switchSemana();
        switchNumero();
        switchFerias();

    }
    // If com flecha = Não boa prática.
    private static void ifFlecha() {
        
        // Criando o método ifFlecha

        // Variaveis

        int mes = 9;
        
        // Inserindo if

        // Se a variavel mes for igual a 1, mostre janeiro
        if(mes == 1) {
            System.out.println("Janeiro");
        } else 
            // Se a variavel mes for igual a 2, mostre fevereiro
            if (mes == 2) {
                System.out.println("Fevereiro");
            } else 
                // Se a variavel mes for igual a 3, mostre março
                if (mes == 3) {
                    System.out.println("Março");
                } else 
                    // Se a variavel mes for igual a 4, mostre abril
                    if (mes == 4) {
                        System.out.println("Abril");
                    } else 
                        // Se a variavel mes for igual a 5, mostre maio
                        if (mes == 5) {
                            System.out.println("Maio");
                        } else 
                            // Se a variavel mes for igual a 6, mostre junho
                            if (mes == 6) {
                                System.out.println("Junho");
                            } else {}
                                // Se a variavel mes for igual a 7, mostre julho
                                if (mes == 7) {
                                    System.out.println("Julho");
                                } else {
                                    // Se a variavel mes for igual a 8, mostre agosto
                                    if (mes == 8) {
                                        System.out.println("Agosto");
                                    } else {
                                        // Se a variavel mes for igual a 9, mostre setembro
                                        if (mes == 9) {
                                            System.out.println("Setembro");
                                        } else {
                                            // Se a variavel mes for igual a 10, mostre outubro
                                            if (mes == 10) {
                                                System.out.println("Outubro");
                                            } else {
                                                // Se a variavel mes for igual a 11, mostre novembro
                                                if (mes == 11) {
                                                    System.out.println("Novembro");
                                                } else {
                                                    // Se a variavel mes for igual a 12, mostre dezembro
                                                    if (mes == 12) {
                                                        System.out.println("Dezembro");
                                                    } else {
                                                        // Se não mes indefinido.
                                                        System.out.println("Mês indefinido");
                                                   }
                        } 
                    }
                }
            }
        }
    }

    // If ultilizando boas práticas.
    private static void ifSemFlecha() {
        
        // Criando variavel
        int mes = 9;
        
        // Iniciando if else if
        if (mes == 1) {
            // Se mes for igual a 1 mostre Janeiro
            System.out.println("Janeiro");
        } else if (mes == 2) {
            // Se mes for igual a 2 mostre Fevereiro
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            // Se mes for igual a 3 mostre Março
            System.out.println("Março");
        } else if (mes == 4) {
            // Se mes for igual a 4 mostre Abril
            System.out.println("Abril");
        } else if (mes == 5) {
            // Se mes for igual a  mostre Maio
            System.out.println("Maio");
        } else if (mes == 6) {
            // Se mes for igual a 6 mostre Junho
            System.out.println("Junho");
        } else if (mes == 7) {
            // Se mes for igual a 7 mostre Julho
            System.out.println("Julho");
        } else if (mes == 8) {
            // Se mes for igual a 8 mostre Agosto
            System.out.println("Agosto");
        } else if (mes == 9) {
            // Se mes for igual a 9 mostre Setembro
            System.out.println("Setembro");
        } else if (mes == 10) {
            // Se mes for igual a 10 mostre Outubro
            System.out.println("Outubro");
        } else if (mes == 11) {
            // Se mes for igual a 11 mostre Novembro
            System.out.println("Novembro");
        } else{
            // Se mes for igual a 12 mostre Dezembro
            System.out.println("Dezembro");
        } 
    }

    // Criando o método if Ferias
    private static void ifFerias() {

        String mes = "julho";
        // Maneira errada de ultilizar isso e para este caso o melhor seria switch
        if (mes == "julho" || mes == "dezembro" || mes == "janeiro") {
            System.out.println("Férias");
        }
    }

    // Criando método if Menor
    private static void ifMenor() {
        // Criando variaveis
        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        // Se salario Mensal for menor que media salario e quantidade de dependentes for maior ou igual a media de dependentes mostre: Funcionario deve receber auxílio. Solução a ser evitada.
        if ((salarioMensal < mediaSalario ) && (quantidadeDependentes >= mediaDependentes)) {
            System.out.println("Funcionário deve receber auxílio.");
        }

        // Criando variaveis booleanas
        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        // Se salario for baixo e houver muitos dependentes então funcionario deve receber auxilio.
        if ((salarioBaixo) && (muitosDependentes)) {
            System.out.println("Funcionario deve receber auxílio.");
        }

        // Criando outro booleano para faciliar a leitura do código
        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);

        if(recebeAuxilio) {
            System.out.println("Funcionario deve receber auxílio.");
        } else {
            System.out.println("Funcionario não deve receber auxílio.");
        }
    }

    // Criando método switchSemana
    private static void switchSemana() {
        
        // Criando variavel unica para o switch.
        String dia = "Terça";

        // Iniciando o switch para os dias da semana.
        switch (dia) {
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sabádo":
                System.out.println(7);
                break;
            case "Domingo":
                System.out.println(1);
                break;
            default:
 //             System.out.println(8);
                System.out.println("Dia invalido");
                break;
        }
    }

    // Criando método switchNumero
    private static void switchNumero() {
        
        // Criando variavel unica para o switch
        int numero = 4;

        // Iniciando switch
        switch (numero) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            case 6:
                System.out.println("Valor invalido");
                break;
        }
    }

    // Criando método switchFerias
    private static void switchFerias() {
        
        // Criando variavel unica para switch
        String mes = "dezembro";

        // Iniciando switch
        switch (mes) {
            case "dezembro":
            case "julho":
            case "janeiro":
                System.out.println("Férias");
                break;
            default:
                System.out.println("Mês de trabalho");
                break;
        }
    }
}
