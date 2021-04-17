import java.util.Scanner;

public class Uni4Exe14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            
        System.out.println("Dígite o Dia");

        double dia = scanner.nextDouble();

        System.out.println("Dígite o Mês");

        double mes = scanner.nextDouble();

        System.out.println("Dígite o Ano");

        double ano = scanner.nextDouble();

        boolean valida = false;

        if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12)
        {
            if(dia <= 31);
            valida = true;
            
        }else if(mes==4 || mes==6 || mes==9 || mes==11)
        {
            if(dia <= 30);
            valida = true;
        }else if(mes==2)
        {
            if ((ano%4==0 &&  ano%100!=0) || (ano%400==0))
            {
                if(dia<=29){
                valida = true;
                }else if(dia<=28){
                    valida = true;
                }
            }  
        }
        if(valida){
                System.out.println("Data válida");
        }else{
                System.out.println("Inválida");
        }
        

        scanner.close();
    }
}