/*Foi feita uma pesquisa de audiência de canal de TV em n casas de um determinado 
bairro de uma cidade, em um certo dia do mês. Na pesquisa foi utilizado um coletor 
de dados portátil. Para cada casa visitada, foi fornecido o número do canal 
(4, 5, 9, 12) e o número de pessoas que estavam assistindo a TV naquele horário, 
considerando que em cada casa só existia uma televisão. Em casas onde a televisão 
estava desligada, foi registrado zero para o número do canal e para o número de 
pessoas. Baseado nisto descreva um algoritmo que calcule e escreva, para cada 
emissora, o percentual de audiência. A leitura deve ser finalizada quando for 
informado canal 0.*/
import java.util.Scanner;
public class Uni5Exe18 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int canal = 1;
        int pessoas = 0, totalDePessoas = 0;
        int canal4 = 0, canal5 = 0, canal9 = 0, canal12 =0;
        int pessoasCanal4 = 0, pessoasCanal5 = 0, pessoasCanal9 = 0, pessoasCanal12 = 0;

    while (canal != 0){
        System.out.println("Qual canal você está assistindo 4, 5, 9, 12 ou nenhum(zero)?");
        canal = ler.nextInt();
        System.out.println("Quantas pessoas estão vendo TV? Se estiver vendo sozinho informe 1");
        System.out.println("Se a tv estava desligada, informe zero");
        pessoas = ler.nextInt();

        if (canal == 4){
            canal4 ++;
            pessoasCanal4 += pessoas;
        }
        if (canal == 5){
            canal5 ++;
            pessoasCanal5 += pessoas;
        }
        if (canal == 9){
            canal9 ++;
            pessoasCanal9 += pessoas;
        }
        if (canal == 12){
            canal12 ++;
            pessoasCanal12 += pessoas;
        }
             totalDePessoas += pessoas;
    }
int percentualCanal4 = (pessoasCanal4*100) / totalDePessoas;
int percentualCanal5 = (pessoasCanal5*100) / totalDePessoas;
int percentualCanal9 = (pessoasCanal9*100) / totalDePessoas;
int percentualCanal12 = (pessoasCanal12*100) / totalDePessoas;

System.out.println("O percentual de audiência do canal 4 é de: " + percentualCanal4 + "%");
System.out.println("O percentual de audiência do canal 5 é de: " + percentualCanal5 + "%");
System.out.println("O percentual de audiência do canal 9 é de: " + percentualCanal9 + "%");
System.out.println("O percentual de audiência do canal 12 é de: " + percentualCanal12 + "%");
}}