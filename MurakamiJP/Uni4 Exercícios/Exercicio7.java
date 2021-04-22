import java.util.Scanner;

public class Exercicio7 {
    
  public static void main(String[] args) {
        
      Scanner teclado = new Scanner(System.in);

        double PesoG = scanner.nextDouble();

        if(PesoG <= 50){
            
                System.out.println("O custo do celo será de: R$0,45 centavos");
        }
        else{
            
                double peso_a_mais = (PesoG - 50);
            
          if(pesoExtra >= 20){
                
                double peso_a_mais = peso_a_mais / 20;
                double preco_selo = peso_a_mais * 0.45 + 0.45;
                System.out.println("O custo do celo será de: R$" + preco_selo);
            }
            
          else{
                System.out.println("O custo do celo será de: R$0,45 centavos");
            }
         }
        
      teclado.close();
    }
}
