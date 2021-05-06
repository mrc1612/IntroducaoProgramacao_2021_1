
public class Uni5exe11 
{
    public static void main(String[] args) 
    {             
        int biscoitosQuebrados = 0;
        for(int hr = 0; hr <= 16; hr++)
        {
            biscoitosQuebrados += Math.pow(3, hr); // como tem 16 hrs a cada hora multiplica 3 do resultado anterior entao eh 3 elevado ao um numero
        }
        System.out.println("A quantidade de biscoitos quebrados foi de: " + biscoitosQuebrados);    
    
        
    }    
}
