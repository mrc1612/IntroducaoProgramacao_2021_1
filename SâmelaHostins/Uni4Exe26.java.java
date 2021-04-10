import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int areaT, base, altura, areaQ, lado, areaR, base2, altura2;
        double areaC, raio;
        String o;
        System.out.println("T: calcular a área de um triângulo de base b e altura h");
        System.out.println("Q: calcular a área de um quadrado de lado l");
        System.out.println("R: calcular a área de um retângulo de base b e altura h");
        System.out.println("C: calcular a área de um círculo de raio r");

System.out.println("Informe a operação que você quer em letra maiuscula.");
o = ler.next();

switch (o){

    case "T":
    System.out.println("Informe o valor da base");
    base = ler.nextInt();
    System.out.println("Informe o valor da altura");
    altura = ler.nextInt();
    areaT = (base * altura)/2;
        System.out.println("area do triângulo= "+areaT);
            break;
    
    case "Q":
    System.out.println("Informe o valor do lado");
    lado = ler.nextInt();
    areaQ = (lado * lado);
        System.out.println("area do quadrado= "+areaQ);
            break;
    
    case "R":
    System.out.println("Informe o valor da base");
    base2 = ler.nextInt();
    System.out.println("Informe o valor da altura");
    altura2 = ler.nextInt();
    areaR = (base2 * altura2);
        System.out.println("area do triângulo= "+areaR);
            break;

    case "C":
    System.out.println("Informe o valor do raio");
    raio = ler.nextDouble();
    areaC = 3.14*(raio * raio);
        System.out.println("area do quadrado= "+areaC);
            break;
        
    default:
    System.out.println("Nenhuma opção foi selecionada");  
}
}
    }
