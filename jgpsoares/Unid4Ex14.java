
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public class Unid4Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Escreva a data desejada (dd/mm/uuuu): ");
        String stringDate = input.nextLine();
        System.out.println("A data é válida? " + isDateValid(stringDate));
    }
        public static boolean isDateValid(String stringDate) {
            String dateFormat = "dd/MM/uuuu";
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(dateFormat).withResolverStyle(ResolverStyle.STRICT);
            try {
                LocalDate date = LocalDate.parse(stringDate, dateTimeFormatter);
                return true;
            } 
            catch (DateTimeParseException e) {
               return false;
            }
        }
    }  