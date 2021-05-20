import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);
    
        int numalu =  0;
        int idade;
       
        String nomes18 = "";
        String nomes20 = "";

        System.out.println("Informe a quantidade de alunos na turma: ");
        numalu = teclado.nextInt();

        for (int i=1; i<=numalu; i++) {
            System.out.println("Informe o seu nome: ");
            String nome = teclado.next();
            System.out.println("Informe a sua idade: ");
            idade = teclado.nextInt();
        
            if (idade == 18) {
                nomes18 += nome + "; ";
        } else {
            if (idade > 20){
                nomes20 += nome;
            }
        }
    } 

    System.out.println("Os alunos que já possuem 18 anos são: " +nomes18);
    System.out.println("Os alunos que já possuem 20 anos são: " +nomes20);
    
    }
}
