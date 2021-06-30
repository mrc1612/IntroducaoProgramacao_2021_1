import java.util.Scanner;

public class JogoDaVelha {
    
    Mapa jogoMapa;
    PC jogoPC;
    Jogador jogoJogador;
    
    //Classe Construtor, instancia o scanner e as outras classes, tambem controla se o jogo continua
    public JogoDaVelha(){
        Scanner scan = new Scanner(System.in);
        
        jogoMapa = new Mapa();
        jogoPC = new PC(jogoMapa);
        jogoJogador = new Jogador(jogoMapa);
        
        boolean jogando = true;
        
        while(jogando){ //LOOP para continuar jogando
            jogoMapa.limpar();
            jogar(scan);
            System.out.println("\n_______________________________");
            System.out.println("Deseja Jogar Novamente? (s/n)");
            
            if(scan.next().charAt(0) == 'n'){//se a resposta for não, o loop para aqui.
                jogando = false;
            }
        }
    }
    
    //classe que é chamada dentro da classe
    public void jogar(Scanner teclado){
        int Jogadas = 0; //contador de jogadas
        int vezJogador = jogoMapa.sortear(0,2)-1; //define a vez do jogador
        
        boolean emJogo = true;
        
        while(emJogo){ //loop para as jogadas
            
            if(vezJogador == 0){//vez do PC
                
                System.out.print("PC:[");
                
                while(!jogoPC.jogar()){} //executa até ter uma jogada valida
                
                System.out.println("]");
                
                if(jogoMapa.ganhador('O')){ //verifica se ganhou
                    System.out.println("PC Ganhou!!");
                    emJogo = false;
                }
            }
            
            if(vezJogador == 1){ //vez do jogador
                
                System.out.println("Jogador:");
                
                while(!jogoJogador.jogar(teclado)){ //executa até ter uma jogada valida
                    System.out.println("Jogada Invalida!!!");
                }
                
                if(jogoMapa.ganhador('X')){ //verifica se ganhou
                    System.out.println("Jogador Ganhou!!");
                    emJogo = false;
                }
            }
            
            if(vezJogador == 1){ //passa a vez para o jogador ou PC
                vezJogador = 0;
            }
            else{
                vezJogador = 1;
            }
            
            Jogadas++; //incremeta o numero de jogadas
            
            jogoMapa.desenhar(Jogadas); //desenha o jogo
            
            if(Jogadas >= 9){ //verifica o empate
                System.out.println("Empate");
                emJogo = false;
            }
        }
    }
    
    public static void main(String[] args) {
        new JogoDaVelha();//Inicia o codigo
    }
    
}
