import java.util.Scanner;

public class Uni4Exe14 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o dia: ");
        int dia = input.nextInt();

        System.out.println("Informe o mes: ");
        int mes = input.nextInt();

        System.out.println("Informe o ano: ");
        int ano = input.nextInt();

        boolean Bisexto = false;
        boolean DataValida = true;

        if (mes < 1 || mes > 12)
        {
            System.out.println("Mês inválido informado!");
        }
        else
        {
            if (mes == 2)
            {
                if (ano % 4 == 0) {
                    if (ano % 100 == 0){
                        
                        if (ano % 400 == 0)
                            Bisexto = true;
                        else
                            Bisexto = false;
                    }
                    else
                        Bisexto = true;
                }
                else
                    Bisexto = false;

                if ((Bisexto && dia > 29) || (!Bisexto && dia > 28))
                {
                    System.out.println("Dia inválido informado!");
                    DataValida = false;
                }
            }
            else
            {
                if (((mes < 8 && mes % 2 != 0) || (mes > 7 && mes % 2 == 0))&& dia > 31)
                {
                    System.out.println("Dia inválido informado!");
                    DataValida = false;

                }
                else if (dia > 30)
                {
                    System.out.println("Dia inválido informado!");
                    DataValida = false;
                }
            }
        }

        if (DataValida)
        {
            System.out.println("A data é válida!");
        }
        else
        {
            System.out.println("A data NÃO é válida!");
        }
        
        input.close();
    }
}
