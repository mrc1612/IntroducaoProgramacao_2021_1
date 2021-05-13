/*Em uma eleição para presidência, existem 4 candidatos. Os votos são informados 
através de código. Os dados utilizados para votação obedecem a seguinte codificação:
    1, 2, 3, 4 = voto para o respectivo candidato
    5 = voto nulo
    6 = voto em branco
Elabore um programa que calcule e escreva:
    total de votos para cada candidato;
    total de votos nulos;
    total de votos em branco;
    percentual dos votos em branco e nulos sobre o total.
Se o usuário informar um número de operação incorreto, emitir a mensagem
 “Opção incorreta” e persistir solicitando um número de opção correto. 
 Para interromper a operação, o usuário poderá fornecer o número 0.*/

import java.util.Scanner;
public class Uni5Exe33 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int voto, voto1 = 0, voto2 = 0, voto3 = 0, voto4 = 0;
        int votoNulo = 0, votoBranco = 0, votoTotal = 1;
        
        do {
           System.out.print("Informe seu voto: ");
            voto = ler.nextInt();

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
                    System.out.println("Número inválido, informe outro");
                    votoTotal--;
                    break;
            }

        } while (voto != 0);
 
        
        double nulo = (votoNulo * 100) / votoTotal;
        double branco = (votoBranco * 100) / votoTotal;

        System.out.println("Candidato 1 teve: " + voto1 + " votos.");
        System.out.println("Candidato 2 teve: " + voto2 + " votos.");
        System.out.println("Candidato 3 teve: " + voto3 + " votos.");
        System.out.println("Candidato 4 teve: " + voto4 + " votos.");
        System.out.println("Voto total: " + votoTotal);
        System.out.println("Votos nulos: " + votoNulo);
        System.out.println("Porcentagem dos votos nulos: " + nulo + "%");
        System.out.println("Votos em branco: " + votoBranco);
        System.out.println("Porcentagem dos votos em brancos: " + branco + "%");

    }
}
