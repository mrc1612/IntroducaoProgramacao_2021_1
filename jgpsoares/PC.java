public class PC {
    
    Mapa mapa;
    private char letra = 'O';
    
    public PC(Mapa mapa){ // classe contrutor
        this.mapa = mapa;
    }
    
    public boolean jogar(){
        
        int l = mapa.sortear(0,3); //sorteia uma linha
        int c = mapa.sortear(0,3); //sorteia uma coluna
        
        boolean jogada = mapa.jogar(l, c, letra); //verifica se a jogada é possivel
        
        if(jogada){ //imprime a jogada
            System.out.print(l+","+c);
        }
        
        return jogada;
    }
    
}
