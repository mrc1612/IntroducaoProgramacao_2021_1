package eduardozortea.Unidade4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Scanner;

public class atividade14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String date = scanner.nextLine();
        System.out.println("A data é válida? " + isDateValid(date));

        scanner.close();
    }

    public static boolean isDateValid(String date) {
        String dateFormat = "dd/MM/uuuu";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(dateFormat).withResolverStyle(ResolverStyle.STRICT);
        try {
            LocalDate.parse(date, dateTimeFormatter);
            return true;
        } 
        catch (DateTimeParseException e) {
            return false;
        }
    }
}


