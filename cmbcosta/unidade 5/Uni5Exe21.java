public class Uni5Exe21 
{
    public static void main(String[] args) 
    {
        double chico = 1.50;
        double ze = 1.10;
        int ano = 0;
        while(chico > ze)
        {
            chico += 0.02;
            ze += 0.03;
            ano++;
        }
        System.out.println("Serao necessarios " + ano + " anos para ze ser maior que chico");

    
        
    }
    

}