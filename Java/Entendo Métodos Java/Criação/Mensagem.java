public class Mensagem {
  // Criando método para obter a hora do dia.
  public static void obterMensagem(int hora) {
    // Criando switch para indicar parametros de cada hora e por fim dizer a frase de acordo com o horário.
    switch (hora) {
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
        mensagemBomDia();
        break;
      case 13:
      case 14:
      case 15:
      case 16:
      case 17:
        mensagemBoaTarde();
        break;
      case 18:
      case 19:
      case 20:
      case 21:
      case 22:
      case 23:
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
        mensagemBoaNoite();
        break;
      default:
        // Caso o elemento não esteja dentro do case será exibido a mensagem abaixo
        System.out.println("Hora inválida.");
        break;
    }
  }

  public static void mensagemBomDia() {
    // Criando o método de mensagem de Bom dia.
    System.out.println("Bom Dia!");
  }

  public static void mensagemBoaTarde() {
    // Criando o método de mensagem de Boa tarde.
    System.out.println("Boa Tarde!");
  }

  public static void mensagemBoaNoite() {
    // Criando o método de mensagem de Boa noite.
    System.out.println("Boa Noite!");
  }

}
