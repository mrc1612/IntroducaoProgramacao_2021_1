import java.util.Scanner;

public class Exercicio6 {
    
  public static void main(String[] args) {
        
      Scanner teclado = new Scanner(System.in);
    
      System.out.println("Informe o sexo, use m(M) ou f(F): ")
    
        char sexo = teclado.next().charAt(0);

        if(sexo == 'm' || sexo == 'M'){
            System.out.println("O sexo é Masculino");
        }
        else if(sexo == 'f' || sexo == 'F'){
            System.out.println("O sexo é Feminino");
        }
        else{
            System.out.println("Caracter Invalido, Digite novamente");
        }

        teclado.close();
    }
}
