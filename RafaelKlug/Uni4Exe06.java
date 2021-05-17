import java.util.Scanner;

public class Uni4Exe06 {
  public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);

    //Entrada
    System.out.println("Informe a letra: ");
    char letra = tec.next().charAt(0);
    letra = Character.toUpperCase(letra);

    //Processo e Saída
    if (letra == 'M') {
      System.out.println("Masculino");
    } else {
      if (letra == 'F') {
        System.out.println("Feminino");
      } else {
        if (letra == 'I') {
          System.out.println("Não Informado");
        } else {
          System.out.println("Entrada Incorreta");
        }
      }
    }

    tec.close();
  }
}