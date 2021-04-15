import java.util.Scanner;

public class Uni4Exe23 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);        

        System.out.println("Informe numero do mês: ");
        int mes = input.nextInt();

        String nomeMes = "";
        switch (mes)
        {
            case 1:
                nomeMes = "Janeiro";
                break;
            
            case 2:
                nomeMes = "Fevereiro";
                break;

            case 3:
                nomeMes = "Março";
                break;
            
            case 4:
                nomeMes = "Abril";
                break;

            case 5:
                nomeMes = "Maio";
                break;

            case 6:
                nomeMes = "Junho";
                break;

            case 7:
                nomeMes = "Julho";
                break;

            case 8:
                nomeMes = "Agosto";
                break;

            case 9:
                nomeMes = "Setembro";
                break;

            case 10:
                nomeMes = "Outubro";
                break;

            case 11:
                nomeMes = "Novembro";
                break;

            case 12:
                nomeMes = "Dezembro";
                break;

            default:
                nomeMes = "Valor inválido!";
                break;
                
        }
        System.out.println(nomeMes);
        

        input.close();
    }
}
