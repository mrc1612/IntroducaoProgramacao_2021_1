
/*Uma turma tem n alunos. Dado n, o nome e idade de cada aluno descreva um algoritmo que:
escreva os nomes dos alunos que tem 18 anos;
escreva a quantidade de alunos que tem idade acima de 20 anos.*/

import java.util.Scanner;
public class Uni5Exe09 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o numero de alunos existentes: ");
        int alunos = ler.nextInt();
        String nomes= "";
        String nomes2 = "";
        for (int i=1; i<= alunos; i++){
            System.out.println("Informe o nome do aluno(a): ");
            String nome = ler.next();

           System.out.println("Informe a idade do aluno(a): ");
           int idades = ler.nextInt();

           if(idades == 18){
           nomes += nome + "\n";
           // este "\n" dará um espaço entre os nomes
           }else{
            if(idades > 20){
            nomes2 += nome + "\n";
           // este "\n" dará um espaço entre os nomes
       }}
        System.out.println("Os alunos com 18 são: " + nomes);
        System.out.println("Os alunos com mais de 20 são: " + nomes2);
        }}}
        
        



    

