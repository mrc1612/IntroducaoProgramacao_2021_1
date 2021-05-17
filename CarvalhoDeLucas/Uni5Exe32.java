import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("-- O mês começa --");
        System.out.println("1 - Domingo");
        System.out.println("2 - Segunda");
        System.out.println("3 - Terça");
        System.out.println("4 - Quarta");
        System.out.println("5 - Quinta");
        System.out.println("6 - Sexta");
        System.out.println("7 - Sábado");
        int dia = teclado.nextInt();

        System.out.print("Quantos dias tem o mês? ");
        int mes = teclado.nextInt();

        int cont = 0;

        switch (dia) {
            case 1:
                System.out.println(" 1 - 2 - 3 - 4 - 5 - 6 - 7 -");
                cont = 7;
                break;
            case 2:
                System.out.println("   - 1 - 2 - 3 - 4 - 5 - 6 -");
                cont = 6;
                break;
            case 3:
                System.out.println("   -   - 1 - 2 - 3 - 4 - 5 -");
                cont = 5;
                break;
            case 4:
                System.out.println("   -   -   - 1 - 2 - 3 - 4 -");
                cont = 4;
                break;
            case 5:
                System.out.println("   -   -   -   - 1 - 2 - 3 -");
                cont = 3;
                break;
            case 6:
                System.out.println("   -   -   -   -   -  1 - 2 -");
                cont = 2;
                break;
            case 7:
                System.out.println("   -   -   -   -   -   - 1 -");
                cont = 1;
                break;
        }

        while (cont <= mes) {

            int semana = 1;

            String texto = "";

            while (semana <= 7) {

                if ((cont + semana) > mes) {
                    break;
                }

                texto += (cont + semana) + " - ";

                semana++;

            }

            semana--;

            System.out.println(texto);

            if (cont >= mes) {
                break;
            }

            cont = cont + semana;

        }

        teclado.close();

    }
}
