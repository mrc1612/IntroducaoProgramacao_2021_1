import java.util.*;

public class Uni4Exe14 {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        int dia;
        int mes;
        int ano;
        boolean dataValida = true; 
        boolean anoBisexto = false;

        System.out.println("Informe o dia: ");
        dia = teclado.nextInt();

        System.out.println("Informe o mes: ");
        mes = teclado.nextInt();
    
        System.out.println("Informe o ano: ");
        ano = teclado.nextInt();

        if (mes > 12 || mes < 1)
        {
            System.out.println("O mes digitado nao eh valido");
        } 
        else{
            if (mes == 2)
            {
                if (ano % 4 == 0) 
                {
                    if (ano % 100 == 0)
                    {
                        if (a % 400 == 0)
                        {
                            anoBisexto = true;
                        }
                        else
                        {
                            anoBisexto = false;
                        }
                    }

                    else
                    {
                        anoBisexto = true;
                    }
                }

                else
                {
                    anoBisexto = false;
                }

                if ((anoBisexto && dia > 29) || (!anoBisexto && dia > 28))
                {
                    System.out.println("O dia informado nao eh valido");
                    dataValida = false;
                }
            }
            else
            {
                if (((mes < 8 && mes % 2 != 0) || (mes > 7 && mes % 2 == 0))&& dia > 31)
                {
                    System.out.println("O dia informado nao eh valido");
                    dataValida = false;
                }
                else if (dia > 30)
                {
                    System.out.println("O dia informado nao eh valido");
                    dataValida = false;
                }
            }
        }

        if (dataValida)
        {
            System.out.println("A data informada ehh valida");
        }
        else
        {
            System.out.println("A data informada nao eh valida");
        }
    }
}