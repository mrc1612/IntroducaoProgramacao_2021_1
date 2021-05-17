import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        double altura = 1;
        double alturaMulheres = 0;
        double alturaGrupo = 0;

        int contMulheres = 0;
        int contGrupo = 0;

        while (altura != 0) {

            System.out.print("Informe seu sexo: ");
            String sexo = teclado.next();

            System.out.print("Informe sua altura: ");
            altura = teclado.nextDouble();

            if (sexo.equals("F") || sexo.equals("f")) {
                alturaMulheres += altura;
                contMulheres++;
            }

            alturaGrupo += altura;
            contGrupo++;

        }

        double mediaMulheres = alturaMulheres / contMulheres;
        double mediaGrupo = alturaGrupo / contGrupo;

        System.out.println("Média mulheres: " + mediaMulheres);
        System.out.println("Média grupo: " + mediaGrupo);

        teclado.close();

    }
}
