import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int contNulo = 0;
        int contBranco = 0;
        int contTotal = 0;

        int voto = 0;

        do {

            System.out.print("Informe seu voto: ");
            voto = teclado.nextInt();

            contTotal++;

            switch (voto) {
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                case 5:
                    contNulo++;
                    break;
                case 6:
                    contBranco++;
                    break;
                default:
                    System.out.println("Número inválido, informe outro");
                    contTotal--;
                    break;
            }

        } while (voto != 0);

        double nulo = (contNulo / contTotal) * 100;
        double branco = (contBranco / contTotal) * 100;

        System.out.println("Candidato 1: " + cont1);
        System.out.println("Candidato 2: " + cont2);
        System.out.println("Candidato 3: " + cont3);
        System.out.println("Candidato 4: " + cont4);
        System.out.println("Votos nulos: " + contNulo);
        System.out.println("Porcentagem: " + nulo + "%");
        System.out.println("Votos em branco: " + contBranco);
        System.out.println("Porcentagem: " + branco + "%");

        teclado.close();

    }
}
