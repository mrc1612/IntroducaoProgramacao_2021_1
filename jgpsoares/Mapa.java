import java.util.Random;

public class Mapa {
    
    private char[][] mapa = new char[3][3];
    
    public void limpar(){ //limpa o jogo
        for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                mapa[x][y] = ' ';
            }
        }
    }
    
    public int sortear(int inicio,int fim){//sorteia um numero com random
        Random r = new Random();
        return inicio + r.nextInt(fim);
    }
    
    public boolean jogar(int l,int c,char jogador){
        boolean pode = false; //variavel de verificação
        
        if(l<0 || l>2 || c<0 || c>2){ //verifica se os valores estão dentro do limite
            return pode;
        }
        
        if(mapa[l][c] == ' '){ //verifica se existe espaço
            mapa[l][c] = jogador; //preenche o espaço com o char do jogador
            pode = true; 
        }
        return pode;
    }
    
    public boolean ganhador(char jogador){
        boolean ganhou = false;
        
        //VERIFICA HORIZONTAL
        for(int x=0;x<3;x++){
            if(mapa[x][0] == jogador && mapa[x][1] == jogador && mapa[x][2] == jogador ){
                ganhou = true;
            }
        }
        
        //VERIFICA VERTICAL
        for(int x=0;x<3;x++){
            if(mapa[0][x] == jogador && mapa[1][x] == jogador && mapa[2][x] == jogador ){
                ganhou = true;
            }
        }
        
        //VERIFICA CRUZADOS
        if(mapa[0][0] == jogador && mapa[1][1] == jogador && mapa[2][2] == jogador ){
            ganhou = true;
        }
        if(mapa[0][2] == jogador && mapa[1][1] == jogador && mapa[2][0] == jogador ){
            ganhou = true;
        }
        
        return ganhou;
    }
    
    public void desenhar(int jogada){
        System.out.print("-------------  Jogada: "+jogada); //Imprime o topo
        for(int x=0;x<3;x++){ //imprime as linhas
            System.out.print("\n| ");
            for(int y=0;y<3;y++){ // imprime as colunas de cada linha
                System.out.print(mapa[x][y]+" | "); // imprime o valor de casa campo do jogo
            }
            System.out.print("\n-------------");
        }
        System.out.print("-------------\n");
    }
    
}
