package atividadesfurbifelse;

import java.util.Scanner;

public class atividade14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o dia: ");

        int day = sc.nextInt();

        System.out.println("Informe o mês: ");

        int month = sc.nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {

            if (day >= 1 && day <= 31) {

                System.out.println("Informe o Ano : ");

                int year = sc.nextInt();

                if (year > 1) {

                    System.out.printf("O ano informado foi : %d, o mês informado foi %d e o dia informado foi %d", year,month, day);

                }

            }

        } else if (month == 4 || month == 6 || month == 9 || month == 11) {

            if (day >= 1 && day <= 30) {

                System.out.println("Informe o Ano: ");

                int year = sc.nextInt();

                if (year > 1) {

                    System.out.printf("O ano informado foi: %d, o mês informado foi %d e o dia informado foi %d", year,month, day);

                }

            }

        } else {

            if (day >= 1 && day <= 29) {

                System.out.println("Informe o Ano: ");

                int year = sc.nextInt();

                if (year > 1 && year % 400 == 0) {

                    System.out.printf("O ano informado foi: %d, o mês informado foi %d e o dia informado foi %d", year,month, day);

                }

            }

            sc.close();

        }

    }

}
