import java.util.Scanner;

public class Atividade28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num_codigo = 0;
        int nenhum_de_nos = 0;
        int cpm22 = 0;
        int skank = 0;
        int jota_quest = 0;
        int perc_nenhum_de_nos = 0;
        int perc_cpm22 = 0;
        int perc_skank = 0;
        int perc_jota_quest = 0;
        int total_votos = 0;
        String adicionar_voto = "";

        System.out.print("Mais um voto? :");
        adicionar_voto = scanner.next();

        while (adicionar_voto.equalsIgnoreCase("sim")) {
            System.out.print("Digite o codigo do voto :");
            num_codigo = scanner.nextInt();

            if (num_codigo == 1) {
                nenhum_de_nos += 1;
            } else {
                if (num_codigo == 2) {
                    cpm22 += 1;
                } else {
                    if (num_codigo == 3) {
                        skank += 1;
                    } else {
                        if (num_codigo == 4) {
                            jota_quest += 1;
                        }
                    }
                }
            }
            System.out.print("Mais um voto? :");
            adicionar_voto = scanner.next();
        }
        System.out.println("O numero total de votos para Nenhum de Nós foi: " + nenhum_de_nos + "votos");
        System.out.println("O numero total de votos para Spm22 foi:" + cpm22 + "votos");
        System.out.println("O numero total de votos para Skank foi:" + skank + "votos");
        System.out.println("O numero total de votos para Jota Quest foi:" + jota_quest + "votos");

        total_votos = nenhum_de_nos + cpm22 + skank + jota_quest;

        perc_nenhum_de_nos = (nenhum_de_nos * 100) / 20;
        System.out.println("O percentual de votos do Nenhum de Nós é: " + perc_nenhum_de_nos + "votos");
        perc_cpm22 = (cpm22 * 100) / 20;
        System.out.println("O percentual de votos do cpm22 é: " + perc_cpm22 + "votos");
        perc_skank = (skank * 100) / 20;
        System.out.println("O percentual de votos do skank é: " + perc_skank + "votos");
        perc_jota_quest = (jota_quest * 100) / 20;
        System.out.println("O percentual de votos do jota_quest é: " + perc_jota_quest + "votos");

        if (nenhum_de_nos > cpm22 && nenhum_de_nos > skank && nenhum_de_nos > jota_quest) {
            System.out.println("O vencedor é o Nenhum de nós com:" + nenhum_de_nos + "votos");
        } else {
            if (cpm22 > nenhum_de_nos && cpm22 > skank && cpm22 > jota_quest) {
                System.out.println("O vencedor é o cpm22 com:" + cpm22 + "votos");
            } else {
                if (skank > nenhum_de_nos && skank > cpm22 && skank > jota_quest) {
                    System.out.println("O vencedor é o cpm22 com:" + skank + "votos");
                } else {
                    if (jota_quest > nenhum_de_nos && jota_quest > cpm22 && jota_quest > jota_quest) {
                        System.out.println("O vencedor é o cpm22 com:" + jota_quest + "votos");
                    }
                }
            }
        }
        scanner.close();
    }
}