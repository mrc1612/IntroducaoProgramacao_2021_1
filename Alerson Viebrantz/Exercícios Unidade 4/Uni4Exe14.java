import java.util.Scanner;

public class Uni4Exe14 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int d, m, a;
        boolean datevalid = true; 
        boolean bis = false; /*ano bisexto*/


        System.out.println("Digite o dia:");
        d = teclado.nextInt();

        System.out.println("Digite o mês:");
        m = teclado.nextInt();
    
        System.out.println("Digite o ano:");
        a = teclado.nextInt();

        if (m > 12 || m < 1) {
            System.out.println("O mês digitado não é válido!!!");
        } else {
            if (m == 2)
            {
                if (a % 4 == 0) {
                    if (a % 100 == 0){
                        
                        if (a % 400 == 0)
                            bis = true;
                        else
                            bis = false;
                    }
                    else
                        bis = true;
                }
                else
                    bis = false;

                if ((bis && d > 29) || (!bis && d > 28))
                {
                    System.out.println("O dia digitado não é válido!!!");
                    datevalid = false;
                }
            }
            else
            {
                if (((m < 8 && m % 2 != 0) || (m > 7 && m % 2 == 0))&& d > 31)
                {
                    System.out.println("O dia digitado não é válido!!!");
                    datevalid = false;

                }
                else if (d > 30)
                {
                    System.out.println("O dia digitado não é válido!!!");
                    datevalid = false;
                }
            }
        }

        if (datevalid)
        {
            System.out.println("A data digitado é válida!!!");
        }
        else
        {
            System.out.println("A data digitada não é válida!!!");
        }
        
        teclado.close();
    }
}

