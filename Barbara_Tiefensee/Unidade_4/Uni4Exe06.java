import java.util.*;

public class Uni4Exe06 {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        char caractere;

        System.out.println("Informe o genero: (M) para masculino, (F) para feminino, (I) para nao informado: ");
        caractere = teclado.next().charAt(0);

        caractere = Character.toUpperCase(caractere);

        if(caractere == 'M')
        {
            System.out.println("Masculino");
        }
        else if (caractere == 'F')
        {
            System.out.println("Feminino");
        }
        else if(caractere == 'I')
        {
            System.out.println("Nao informado");
        }
        else
        {
            System.out.println("Entrada incorreta");
        }
    }
}
