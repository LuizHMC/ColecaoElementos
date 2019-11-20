package colecaoelementos;
import java.util.Scanner;
import java.lang.Math;

public class colecaoElemento {
    private listaPonto lista1;
    private Ponto ponto1;


    public colecaoElemento(listaPonto lista1, Ponto ponto1) {
        this.lista1 = lista1;
        this.ponto1 = ponto1;
    }


    public static void main(String[] args) {
        Ponto p1;
        listaPonto l1;
        colecaoElemento colecao;
        p1 = new Ponto(1,2);

        int escolha;
        Scanner input    = new Scanner(System.in);

        System.out.print("--------------------------------------------\n");
        System.out.print("|");
        System.out.print("                                          |\n");
        System.out.print("|        Coleção de elementos         |\n");
        System.out.print("|");
        System.out.print("                                          |\n");
        System.out.print("--------------------------------------------\n");
        System.out.print("\n");
        System.out.print("Bem-vindo\n");

        while (true) {
            System.out.println("----------------------\n");
            System.out.println("Menu - Calculadora\n");
            System.out.print("1.) Adicionar um elemento no final da coleção.\n");
            System.out.print("2.) Adicionar um elemento no final da coleção.\n");
            System.out.print("3.) Retornar o índice da primeira ocorrência de um elemento especificado na coleção\n");
            System.out.print("4.) Remover um elemento em uma posição na coleção\n");
            System.out.print("5.) Calcular a distância dos dois pontos mais distantes na coleção.\n");
            System.out.print("6.) Retornar uma coleção de pontos contido em uma circunferência.\n");
            System.out.print("0.) Sair\n");
            System.out.print("\nDigite sua opção: ");
            System.out.println("----------------------\n");

            escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Adicionar um elemento no final da coleção. ");
                    break;
                case 2:
                    System.out.println("Adicionar um elemento no final da coleção. ");
                    break;
                case 3:
                    System.out.println("Retornar o índice da primeira ocorrência de um elemento especificado na coleção.");
                    break;

                case 4:
                    System.out.println("Remover um elemento em uma posição na coleção");
                    break;
                case 5:
                    System.out.println("Calcular a distância dos dois pontos mais distantes na coleção.");

                case 6:
                    System.out.println("Retornar uma coleção de pontos contido em uma circunferência.");

                case 0:
                    System.out.println("Ate mais...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcao invalida! Tente novamente.");
                    break;
            }
        }
    }
}
