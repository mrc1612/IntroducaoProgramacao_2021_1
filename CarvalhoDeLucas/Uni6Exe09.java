import java.util.Scanner;

public class Uni6Exe09 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Numero de pessoas rentrevistadas: ");
        int pessoas = teclado.nextInt();

        String[] sexo = new String[pessoas];
        int[] idade = new int[pessoas];
        int[] nota = new int[pessoas];

        double mediaGeral = 0;
        
        double mediaHomens = 0;
        int contHomem = 0;

        int mulherMaisNova = 1000;
        int notaMulher = 0;

        int contMulherVelhas = 0;

        for (int i = 0; i < pessoas; i++) {

            System.out.println("Seu sexo (F ou M): ");
            sexo[i] = teclado.next().toUpperCase();

            System.out.print("Idade: ");
            idade[i] = teclado.nextInt();

            System.out.println("Nota de 0 à 10: ");
            nota[i] = teclado.nextInt();
            mediaGeral += teclado.nextInt();

        }

        System.out.println("Media geral: " + (mediaGeral / pessoas));

        for (int i = 0; i < pessoas; i++) {

            if (sexo[i].equals("M")) {

                mediaHomens += nota[i];
                contHomem++;

            }

        }

        System.out.println("Media geral: " + (mediaHomens / contHomem));

        for (int i = 0; i < pessoas; i++) {

            if (sexo[i].equals("F")) {

                if (idade[i] < mulherMaisNova) {
                    mulherMaisNova = idade[i];
                    notaMulher = nota[i];
                }

            }

        }

        System.out.println("Nota mulher mais nova: " + notaMulher);

        for (int i = 0; i < pessoas; i++) {

            if (sexo[i].equals("F")) {

                if (idade[i] > 50) {

                    if (nota[i] > (mediaGeral / pessoas)) {
                        contMulherVelhas++;
                    }

                }

            }

        }

        System.out.println(contMulherVelhas + " mulheres com mais de 50 anos votaram acima da média.");

        teclado.close();;

    }
}
