import java.util.Scanner;

public class Uni4Exe27 {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o horário de entrada:");
        int hEntrada = input.nextInt();
        int mEntrada = input.nextInt();

        System.out.println("Informe o horário de saída:");
        int hSaida = input.nextInt();
        int mSaida = input.nextInt();

        int hDuracao = 0;
        int mDuracao = 0;
        double vFinal = 0;

        if (hSaida < hEntrada)
        {
            if (mEntrada < mSaida)
            {
                hDuracao = 24 - hEntrada + hSaida -1;
                mDuracao = mSaida - mEntrada;
            }
            else
            {
                hDuracao = 24 - hEntrada + hSaida - 1;
                mDuracao = (60 - mEntrada) + mSaida;
                if (mDuracao == 60)
                {
                    mDuracao = 0;
                    hDuracao++;
                }
            }
        }
        else
        {
            if (mEntrada < mSaida)
            {
                hDuracao = hSaida - hEntrada;
                mDuracao = mSaida - mEntrada;
            }
            else
            {
                hDuracao = hSaida - hEntrada - 1;
                if (hDuracao  == -1)
                    hDuracao = 23;
                mDuracao = (60 - mEntrada) + mSaida;
                if (mDuracao == 60)
                {
                    mDuracao = 0;
                    hDuracao++;
                }
            }
        }
        
        if (mDuracao >= 30){
            hDuracao++; 
            mDuracao = 0;
        }

        switch (hDuracao)
        {
            case 0:
                vFinal = 5;
                break;

            case 1:
                vFinal = 5;
                break;

            case 2:
                vFinal = 10;
                break;

            case 3:
                vFinal = 17.5;
                break;

            case 4:
                vFinal = 25;
                break;

            default:
                vFinal = 25 + ((hDuracao - 4) * 10);
                break;
        }
        
        System.out.println("Horas estacionado:" + hDuracao);
        System.out.println("Valor Total: R$:" + vFinal);
        input.close();
    }
}
