import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner ler = new Scanner(System.in);
       int admissao;
       System.out.println("Informe a quantidade de meses que você foi admitido");
       admissao = ler.nextInt();
       if(admissao >= 1 && admissao <= 12){
        System.out.println("Você receberá 5% de reajuste em seu salario");   
       }else{
        if(admissao >= 13 && admissao <= 48){
            System.out.println("Você receberá 7% de reajuste em seu salario");   
        }else{
            if(admissao < 1){
                System.out.println("Resposta inadequada");
        }else{
            System.out.println("Converse com seu superior para redefinir seu sálario");
        }
        }
       }
    }
}
