import java.util.Scanner;

public class Uni6Exe05 {

    public Uni6Exe05() {
        int pontos = 0;
        String[] array = new String[5];
        String[] array1 = new String[5];
        String[] perguntas = new String[5];
        readyValueArray(array, array1, perguntas);
        pontos = sumArray(array, array1, perguntas);
        writeArray(pontos);

    }
    // READY
    public void readyValueArray(String[] array, String[] array1, String[] perguntas) {
        System.out.println("Responda só com sim, não ou ind (indiferente)!");
        Scanner scanner = new Scanner(System.in);
        

        perguntas[0] = "Gosta de música sertaneja?";
        perguntas[1] = "Gosta de futebol?";
        perguntas[2] = "Gosta de seriados?";
        perguntas[3] = "Gosta de redes sociais?";
        perguntas[4] = "Gosta da Oktoberfest?"; 

        System.out.println("MENINA");

        for (int i = 0; i < perguntas.length; i++) {

            System.out.print(perguntas[i]);
            array1[i] = scanner.next().toUpperCase();

        }
        System.out.println("MENINO");

        for (int i = 0; i < perguntas.length; i++) {

            System.out.print(perguntas[i]);
            array[i] = scanner.next().toUpperCase();

        }
  
    
            scanner.close();
        }
    public int sumArray(String[] array, String[] array1, String[] perguntas) {   
        int pontos1 = 0; 
        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(array[i]  + " " + array1[1]);
            if (array[i].equals(array1[i])) {
                pontos1 += 3;
            } else if ((array[i].equals("SIM") && array1[i].equals("NaO")
                    || (array[i].equals("NaO") && array1[i].equals("SIM")))) {
                pontos1 -= 2;
            } else {
                pontos1 += 1;
            }
        System.out.println(pontos1);
        } 

        return pontos1;

	}
    
   public void writeArray(int pontos) {
    if (pontos == 15) {
        System.out.println("Casem!");
    } else if (pontos >= 10 && pontos <= 14) {
        System.out.println("Vocês têm muita coisa em comum!");
    } else if (pontos >= 5 && pontos <= 9) {
        System.out.println("Talvez não dê certo :(");
    } else if (pontos >= 0 && pontos <= 4) {
        System.out.println("Vale um encontro.");
    } else if (pontos >= -9 && pontos <= -1) {
        System.out.println("Melhor não perder tempo.");
    } else {
        System.out.println("Vocês se odeiam!");
    }

    }
    public static void main(String[] args) {
        new Uni6Exe05();
    }
}