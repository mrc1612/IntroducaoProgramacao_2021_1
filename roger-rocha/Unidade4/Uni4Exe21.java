import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe21 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("BEM-VINDO AO CALCULADOR DE IMC!!");
        System.out.println("Informe em kilogramas a sua massa: ");
        float massa = teclado.nextFloat();
        System.out.println();
        System.out.println("Informe em metros a sua altura: ");
        float altura = teclado.nextFloat();

        float imc = (float) (massa / (altura * altura));
        DecimalFormat df = new DecimalFormat("#.#");
        String texto = "De acordo com o seu imc : ";
        String texto2 = "  Voce esta no grau:";


        if(imc <= 18.5)
        {
            System.out.println(texto + df.format(imc) + texto2 + " Magreza");
        }
        else if(imc > 18.5 && imc <= 24.9)
        {
            System.out.println(texto + df.format(imc) + texto2 + " Saudavel");
        }
        else if(imc >= 25 && imc <= 29.9)
        {
            System.out.println(texto + df.format(imc) + texto2 + " Sobrepeso");
        }
        else if(imc >= 30 && imc <= 34.9)
        {
            System.out.println(texto + df.format(imc) + texto2 + " Obesidade Grau I");
        }
        else if(imc >= 35 && imc <= 39.9)
        {
            System.out.println(texto + df.format(imc) + texto2 + " Obseidade Grau II(severa)");
        }
        else if(imc >= 40)
        {
            System.out.println(texto + df.format(imc) + texto2 + " Obesidade Grau III(morbida");
        }

    }
}
