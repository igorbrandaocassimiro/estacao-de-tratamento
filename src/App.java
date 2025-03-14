import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        EstacaoTratamento minhaEstacao = new EstacaoTratamento();

        while (true) {
            System.out.println("*** ESTAÇÃO DE TRATAMENTO ***\n");
            System.out.println("Escolha uma das etapas para conhecer ou digite 7 para sair.\n");
            System.out.println("1- Gradeamento.");
            System.out.println("2- Desaneração.");
            System.out.println("3- Tratamento Biológico.");
            System.out.println("4- Decantação.");
            System.out.println("5- Descarte.");
            System.out.println("6- Leito de Secagem.");
            System.out.println("7- Sair.");

            String entrada = leitor.nextLine(); // Lê a entrada como uma string
            int escolha = -1;

            // Tenta converter a entrada para um número inteiro
            try {
                escolha = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida, tente novamente.");
                continue; // Volta ao menu se a entrada não for um número válido
            }

            // Verifica a escolha do usuário
            if (escolha == 1) {
                minhaEstacao.gradeamento();
            } else if (escolha == 2) {
                minhaEstacao.desaneracao();
            } else if (escolha == 3) {
                minhaEstacao.tratamentoBiologico();
            } else if (escolha == 4) {
                minhaEstacao.decantacao();
            } else if (escolha == 5) {
                minhaEstacao.descarte();
            } else if (escolha == 6) {
                minhaEstacao.leitoDeSecagem();
            } else if (escolha == 7) {
                minhaEstacao.encerrarPrograma();
                break; // Sai do loop e encerra o programa
            } else {
                System.out.println("Opção inválida, tente novamente.");
            }

            // Após cada etapa, pede para pressionar qualquer tecla para voltar ao menu
            System.out.println("\nPressione Enter para voltar ao menu...");
            leitor.nextLine();
        }

        leitor.close();
    }
}
