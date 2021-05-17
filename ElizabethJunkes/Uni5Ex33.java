import java.util.Scanner;
public class Uni5Ex33 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int voto, voto1 = 0, voto2 = 0, voto3 = 0, voto4 = 0;
        int votoNulo = 0, votoBranco = 0, votoTotal = 1;
        do {
           System.out.print("Digite o seu voto: ");
            voto = teclado.nextInt();
            switch (voto) {
                case 1:
                    voto1++;
                    votoTotal++;
                        break;
                case 2:
                    voto2++;
                    votoTotal++;
                        break;
                case 3:
                    voto3++;
                    votoTotal++;
                        break;
                case 4:
                    voto4++;
                    votoTotal++;
                        break;
                case 5:
                    votoNulo++;
                    votoTotal++;
                        break;
                case 6:
                    votoBranco++;
                    votoTotal++;
                        break;
                default:
                    System.out.print("Número inválido. É necessário informar um novo número. ");
                    votoTotal--;
                    break;
            }
        } while (voto != 0);
        double r_nulo = (votoNulo * 100) / votoTotal;
        double r_branco = (votoBranco * 100) / votoTotal;
        System.out.println("O candidato 1 teve: " + voto1 + " votos.");
        System.out.println("O candidato 2 teve: " + voto2 + " votos.");
        System.out.println("O candidato 3 teve: " + voto3 + " votos.");
        System.out.println("O candidato 4 teve: " + voto4 + " votos.");
        System.out.println("Votos totais: " + votoTotal);
        System.out.println("Votos nulos: " + votoNulo);
        System.out.println("Porcentagem total dos votos nulos: " + r_nulo + "%");
        System.out.println("Votos totais em branco: " + votoBranco);
        System.out.println("Porcentagem dos votos em brancos: " + r_branco + "%");
    }
}