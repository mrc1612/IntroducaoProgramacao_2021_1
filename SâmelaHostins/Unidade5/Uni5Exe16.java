/*Dado um determinado grupo de pessoas, descreva um algoritmo que a partir da 
altura e do sexo (sexo = 'M' ou sexo = 'm' para masculino e sexo = 'F' e sexo 
= 'f' para feminino) de cada pessoa informe a média da altura das mulheres e a 
média de altura do grupo. A leitura deve ser finalizada ao digitar 0 para a altura.*/
import java.util.Scanner;
public class Uni5Exe16 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        String sexo;
        double altura=1;
        double alturaTotalF =0, alturaTotalM =0;
        double mediaAlturaF = 0, mediaAlturaGrupo =0;
        int masculino =0, feminino = 0;

        while (altura != 0) {

            System.out.println("Informe a sua altura");
            altura = ler.nextDouble();

            if (altura == 0){
            break;
            }

            System.out.println("Informe seu sexo: M = Masculino, F= feminino:");
            sexo = ler.next();  

            
if (sexo.equals("M") || sexo.equals("m")){
//fará com que cada vez que "m" seja selecionado, diga que há mais um homem no grupo
   masculino ++;
   alturaTotalM += altura;
}
if (sexo.equals("F") || sexo.equals("f")){
    //fará com que cada vez que "m" seja selecionado, diga que há mais uma mulher no grupo
    feminino ++;
    alturaTotalF += altura;
        }    
    }
    mediaAlturaF = alturaTotalF / feminino;
    mediaAlturaGrupo = (alturaTotalM + alturaTotalF) / (masculino + feminino);
System.out.println("A média da altura das mulheres é de: " + mediaAlturaF);
System.out.println("A média da altura dao grupo é de: " + mediaAlturaGrupo);

    }
}    
