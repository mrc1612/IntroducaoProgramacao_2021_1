import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Scanner;

public class Uni4Exe14 
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escreva a data desejada nesse formato dd/MM/uuuu ex: 10/02/2010");
        String stringDate = teclado.nextLine();
        System.out.println(stringDate + " essa data eh valida: " + isDateValid(stringDate));
    }
        public static boolean isDateValid(String stringDate) {
            String dateFormat = "dd/MM/uuuu";
        
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(dateFormat).withResolverStyle(ResolverStyle.STRICT);
            try 
            {
                LocalDate date = LocalDate.parse(stringDate, dateTimeFormatter);
                return true;
            } 
            catch (DateTimeParseException e) //pegar as excecoes que seriam os anos bissextos e meses com dias diferentes
            {
               return false;
            } 
    
    
    
    
    
    
    }

   
}
