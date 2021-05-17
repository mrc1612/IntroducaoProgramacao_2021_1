import java.util.Scanner;
public class Uni5Ex28 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        char dados = 'S';
        double grupoVencedor = 0;
        int conjunto = 1;
        int conjunto1 = 0, conjunto2 = 0, conjunto3 = 0, conjunto4 =0, conjuntoTotal = 0;
        while (dados == 'S' || dados == 's'){ 
        System.out.println("Qual o melhor conjunto do ano segundo a sua opinião?");
        System.out.println("Digite o número referente a sua resposta");
        System.out.println("\n");
        System.out.println("1 = Nenhum de Nós");
        System.out.println("2 = CPM22");
        System.out.println("3 = Skank");
        System.out.println("4 = Jota Quest");
        conjunto = teclado.nextInt();

        if (conjunto == 1){
            conjunto1 ++;
            conjuntoTotal ++;
        }
        if (conjunto == 2){
            conjunto2 ++;
            conjuntoTotal ++;
        }
        if (conjunto == 3){
            conjunto3 ++;
            conjuntoTotal ++;
        }
        if (conjunto == 4){
            conjunto4 ++;
            conjuntoTotal ++;
        }

             System.out.println("mais um voto: s (SIM) / n (NÃO)?");
    dados = teclado.next().charAt(0);
        }
    int percentualConjunto1 = (conjunto1*100) / conjuntoTotal;
    int percentualConjunto2 = (conjunto2*100) / conjuntoTotal;
    int percentualConjunto3 = (conjunto3*100) / conjuntoTotal;
    int percentualConjunto4 = (conjunto4*100) / conjuntoTotal;

    if(percentualConjunto1 > percentualConjunto2 && percentualConjunto1 > percentualConjunto3 && percentualConjunto1 > percentualConjunto4){
        grupoVencedor = conjunto1;
    }else{
        if(percentualConjunto2 > percentualConjunto1 && percentualConjunto2 > percentualConjunto3 && percentualConjunto2 > percentualConjunto4){
            grupoVencedor = conjunto2;
    }else{
        if(percentualConjunto3 > percentualConjunto1 && percentualConjunto3 > percentualConjunto2 && percentualConjunto3 > percentualConjunto4){  
            grupoVencedor = conjunto3;
    }else{
        if(percentualConjunto4 > percentualConjunto1 && percentualConjunto4 > percentualConjunto2 && percentualConjunto4 > percentualConjunto3){
            grupoVencedor = conjunto4;
        }}}}
    System.out.println("O conjunto 1 recebeu: " +conjunto1 + " votos.");
    System.out.println("O conjunto 2 recebeu: " +conjunto2 + " votos.");
    System.out.println("O conjunto 3 recebeu: " +conjunto3 + " votos.");
    System.out.println("O conjunto 4 recebeu: " +conjunto4 + " votos.");
    System.out.println("\n");
    System.out.println("O percentual dos votos do conjunto 1 é de: " + percentualConjunto1 + "%");
    System.out.println("O percentual dos votos do conjunto 2 é de: " + percentualConjunto2 + "%");
    System.out.println("O percentual dos votos do conjunto 3 é de: " + percentualConjunto3 + "%");
    System.out.println("O percentual dos votos do conjunto 4 é de: " + percentualConjunto4 + "%");
    System.out.println("\n");
    System.out.println("O grupo vencedor é o grupo: " + grupoVencedor);
    }
}