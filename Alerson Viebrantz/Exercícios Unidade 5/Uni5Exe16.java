import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);

        String sexo;
        double alt = 1.0, altmas = 0.0, altfem = 0.0, medaltf = 0.0, medaltg = 0.0;
        int masc = 0, femi = 0;
    
        while (alt != 0){
            System.out.println("Informe seu sexo: (F= Feminino; M= Masculino;)");
            sexo = teclado.next();

            System.out.println("Informe a sua altura: ");
            alt = teclado.nextDouble();

            if (sexo.equals("M") || sexo.equals("m")) {
                masc++;
                altmas += alt;
            }
            if (sexo.equals("F") || sexo.equals("f") ){
                femi++;
                altfem += alt;
            }
        }

        medaltf = altfem/femi;
        medaltg = (altmas + altfem) / (masc+femi);

        System.out.println("A média da altura das mulheres "+ medaltf);
        System.out.println("A média da altura do grupo "+ medaltg);

        teclado.close();
    }
}
