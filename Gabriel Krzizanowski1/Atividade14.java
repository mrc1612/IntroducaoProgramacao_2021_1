package AtividadesFurb;

import java.util.Scanner;


public class Atividade14 {

    public static void main(String[] args) {

      
                Scanner teclado = new Scanner(System.in);
                
                double VelocidadeM, tempo, distancia, QTDCombustivel;
        
                System.out.println("Informe a distância em km, que você percorreu e o tempo em horas, que levou para percorrê-la");
                distancia = teclado.nextDouble();
                tempo = teclado.nextDouble();
        
                VelocidadeM = (distancia / tempo);
                
                QTDCombustivel = (distancia / 12);
                
                System.out.println("A velocidade média foi de: " + VelocidadeM);

                System.out.println("Quantidade de combustivel gasta foi de: " + QTDCombustivel);
        
                teclado.close();
            }
        }