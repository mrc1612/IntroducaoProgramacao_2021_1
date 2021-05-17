import java.util.Scanner;
import java.text.DecimalFormat;


public class Uni4Exe21 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.println("Informe sua altura em metros: ");
        double altura = input.nextDouble();
        System.out.println("Informe seu peso em Kg: ");
        double peso = input.nextDouble();


        double imc = ( peso / Math.pow(altura,2) );

        DecimalFormat df = new DecimalFormat("0.00");

        if(imc >= 40){
            System.out.println("IMC: " + df.format(imc) + " Obesidade Grau III (mórbida) ");
        }
        else{
            if(imc >= 35){
                System.out.println("IMC: " + df.format(imc) + " Obesidade Grau II (severa)");
            }
            else{
                if(imc >= 30){
                    System.out.println("IMC: " + df.format(imc) + " Obesidade Grau I  ");
                }
                else{
                    if(imc >= 25){
                        System.out.println("IMC: " + df.format(imc) + " Sobrepeso");
                    }
                    else{
                        if(imc >= 18.5){
                            System.out.println("IMC: " + df.format(imc) + " Saudável ");
                        }
                        else{
                            System.out.println("IMC: " + df.format(imc) + " Magreza  ");
                        }
                    }
                }
            }
        }

        input.close();
    }

}