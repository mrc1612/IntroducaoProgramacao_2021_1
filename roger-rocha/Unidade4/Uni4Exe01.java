import java.util.Scanner;

public class Uni4Exe01 
{ 
    public static void main(String[] args) throws Exception
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("BEM-VINDO AO CALCULA SALARIO");
        System.out.println("Para calcular o salario de um funcionario preencha os campos a seguir");
        System.out.print("O preco pela hora trabalhada: ");
        float precoHora = teclado.nextFloat();
        // SE A QUANTIDADE DE HORAS TRABALHADAS SEMANALMENTE FOR MENOR QUE 40HRS DA ERRO NO CALCULO FINAL
        System.out.println("*************** AVISO O FUNCIONARIO PRECISA TER NO MINIMO 40hrs TRABALHADAS SEMANALMENTE ***************");
        System.out.println("Total de horas trabalhadas semanalmente : ");

        int horas = teclado.nextInt();
        int horasExtras = horas - 40 ;
        float precoHoraExtra = (float) (precoHora + (precoHora * 0.5));
        if(horasExtras <= 0)
        {
            precoHoraExtra = 0;
        }
        
        float salarioSemanal, salarioHrsExtras, salarioNormal;
        salarioNormal = ((horas - horasExtras) * precoHora);
        salarioHrsExtras = (precoHoraExtra * horasExtras);
        salarioSemanal = (float) (salarioNormal + salarioHrsExtras);
        System.out.println("O salario do funcionario ja com as horas extras, caso tenham sido trabalhadas, sera de: " + (salarioSemanal * 4));
        
        
        

    }    
}
