import java.util.Scanner;

public class atividade10 {
    Scanner teclado;
  
    public static void main(String[] args) {
        new atividade10();
    }
  
    public atividade10() {
        teclado = new Scanner(System.in);
        int[] vetor = new int[50];
        int total = 0;
        int opcao = 0;
        do {
            System.out.print("Digite opção: \n1 - Inserir valor\n2 - Pesquisar valor\n"
                    + "3 - Alterar valor\n4 - Excluir valor\n5 - Mostrar valores\n6 - Ordenar valores\n"
                    + "7 - Sair do sistema: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    if (inserir(vetor, total)) {
                        System.out.println("Valor inserido");
                        total++;
                    } else {
                        System.out.println("Vetor está cheio");
                    }
                    break;
                case 2:
                    pesquisar(vetor, total);
                    break;
                case 3:
                    alterar(vetor, total);
                    break;
                case 4:
                    total = excluir(vetor, total);
                    break;
                case 5:
                    mostrar(vetor, total);
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente...");
                    break;
            }

        } while (opcao != 7);
    }

    public boolean inserir(int[] vetor, int total) {
        // nesta opção inclua o valor no fim do vetor, se houver espaço.

        System.out.print("Digite um valor para incluir no vetor: ");
        int numero = teclado.nextInt();

        if (total < 5) {
            vetor[total] = numero;
            return true;
        }
        return false;
    }

    public int pesquisar(int[] vetor, int total) {
        System.out.print("Digite um valor a ser pesquisado: ");
        int valor = teclado.nextInt();

        for (int posicao = 0; posicao < total; posicao++) {
            if (vetor[posicao] == valor) {
                System.out.println("Valor encontrado na posição " + posicao);
                return posicao;
            }
        }
        System.out.println("Valor não encontrado no vetor.");
        return -1;
    }

    public void mostrar(int vetor[], int total) {
        for (int posicao = 0; posicao < total; posicao++) {
            System.out.print("[" + vetor[posicao] + "] ");
        }
    }

    public void alterar(int vetor[], int total) {
        int indice = pesquisar(vetor, total);
        if (indice != -1) {
            System.out.print("Informe o novo valor para essa posição: ");
            int valor = teclado.nextInt();
            vetor[indice] = valor;
            System.out.println("O valor foi alterado");
        } 
    }


    public int excluir(int[] vetor, int total){
        int indice = pesquisar(vetor, total);
        if (indice > -1) {
            
            
            for (int i = indice; i < total; i++) {
                vetor[i] = vetor[i+1];
            }

            
            total--;
            System.out.println("Número excluído com sucesso!");
        }
        return total;
    }
}
