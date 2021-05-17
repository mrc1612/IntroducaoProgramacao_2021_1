import java.util.Scanner;
public class atividade16 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int masculino =0, feminino = 0;
        String sexo;
        double altura = 1; double alturaTotalF =0, alturaTotalM =0; double mediaAlturaFem = 0, mediaAlturaGrupo =0;
        while (altura != 0) {
            System.out.print("Informe a sua altura: ");
            altura = teclado.nextDouble();
            if (altura == 0){
            break;
            }
            System.out.print("Informe o seu sexo: M para Masculino e F para feminino ");
            sexo = teclado.next();
        if (sexo.equals("M") || sexo.equals("m")) {
           masculino ++;
           alturaTotalM += altura;
        }
        if (sexo.equals("F") || sexo.equals("f") ){
            feminino ++;
            alturaTotalF += altura;
                }    
            }
            mediaAlturaFem = alturaTotalF / feminino;
            mediaAlturaGrupo = (alturaTotalM + alturaTotalF) / (masculino + feminino);
        System.out.println("A média da altura das mulheres é de: " + mediaAlturaFem);
        System.out.println("A média da altura total do grupo é de: " + mediaAlturaGrupo);
    }
}    