import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner ler = new Scanner(System.in);
        System.out.println("Escreva a data desejada nesse formato dd/MM/uuuu ex: 10/02/2010");
        String stringDate = teclado.nextLine();
        System.out.println(stringDate + " essa data eh valida: " + isDateValid(stringDate));
        public static boolean isDateValid(String stringDate) {
            String dateFormat = "dd/MM/uuuu";
        
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(dateFormat).withResolverStyle(ResolverStyle.STRICT);
            try {
                LocalDate date = LocalDate.parse(stringDate, dateTimeFormatter);
                return true;
            } 
            catch (DateTimeParseException e) //pegar anos bissextos e meses com dias diferentes
            {
               return false;
            } }}
