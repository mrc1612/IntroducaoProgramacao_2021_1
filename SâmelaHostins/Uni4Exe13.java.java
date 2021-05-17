import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int carta, carta2, carta3;
        System.out.println("Insira o valor das suas 3 cartas");
        System.out.println("1 = AS; 2 = 2; 3 = 3; 7 = 7; 11 = Valete; 12 = Dama; 13 = Rei");
        System.out.println("Digite o valor da primerira carta:");
        carta = ler.nextInt();
        System.out.println("Digite o valor da segunda carta:");
        carta2 = ler.nextInt();
        System.out.println("Digite o valor da terceira carta:");
        carta3 = ler.nextInt();

        // UMA CARTA
        if((carta == 1 || carta == 2 || carta == 3) && (carta2 != 1 && carta2 != 2 && carta2 != 3) && (carta3 != 1 && carta3 != 2 && carta3 != 3)){
            System.out.println("TRUCO");
        }if((carta != 1 && carta != 2 && carta != 3) && (carta2 == 1 || carta2 == 2 || carta2 == 3) && (carta3 != 1 && carta3 != 2 && carta3 != 3)){
            System.out.println("TRUCO");
        }if((carta != 1 && carta != 2 && carta != 3) && (carta2 != 1 && carta2 != 2 && carta2 != 3) && (carta3 == 1 || carta3 == 2 || carta3 == 3)){
            System.out.println("TRUCO");
        }



        // 2 CARTAS
        if((carta == 1 || carta == 2 || carta == 3) && (carta2 == 1 || carta2 == 2 || carta2 == 3) && (carta3 != 1 && carta3 != 2 && carta3 != 3)){
            System.out.println("SEIS");
        }else{
             if((carta == 1 || carta == 2 || carta == 3) && (carta2 != 1 && carta2 == 2 && carta2 == 3) && (carta3 == 1 || carta3 == 2 || carta3 == 3)){
            System.out.println("SEIS");
        }else{ 
        if((carta != 1 && carta != 2 && carta != 3) && (carta2 == 1 || carta2 == 2 || carta2 == 3) && (carta3 == 1 || carta3 == 2 || carta3 == 3)){
            System.out.println("SEIS");
        }
         // 3 CARTAS
        if(((carta == 1 || carta == 2 || carta == 3) && (carta2 == 1 || carta2 == 2 || carta2 == 3) && (carta3 == 1 || carta3 == 2 || carta3 == 3))){
            System.out.println("NOVE");
        }
        
        
    }    
}}
    }