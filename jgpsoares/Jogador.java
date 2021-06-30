import java.util.Scanner;

public class Jogador {
    
    Mapa mapa;
    private char letra = 'X';
    
    public Jogador(Mapa mapa){ //Classe construtor
        this.mapa = mapa;
    }
    
    public boolean jogar(Scanner teclado){
        
        int linha = -1;//inicia a linha com valor -1
        
        while(linha<0 || linha>2){ //pede a entrada da linha e repete se o valor é invalido
            System.out.print("Linha: ");
            linha = teclado.nextInt();
            if(linha<0 || linha>2){
                System.out.print("Numero Invalido \n");
            }
        }
        
        int coluna = -1; //inicia a coluna com valor -1
        
        while(coluna<0 || coluna>2){//pede a entrada da coluna e repete se o valor é invalido
            System.out.print("Coluna: ");
            coluna = teclado.nextInt();
            if(coluna<0 || coluna>2){
                System.out.print("Numero Invalido \n");
            }
        }
        
        return mapa.jogar(linha, coluna, letra); //retorna se a jogada é possivel
    }
    
}
