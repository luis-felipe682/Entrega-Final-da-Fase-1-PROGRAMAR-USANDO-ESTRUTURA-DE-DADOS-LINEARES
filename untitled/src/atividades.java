import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class atividades {

    public static void main(String[] args) {

        LinkedList<String> fila = new LinkedList<>();


        Stack<String> pilha = new Stack<>();

        Scanner scan = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 6) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Nova atividade");
            System.out.println("2 - Executar proxima atividade");
            System.out.println("3 - Ver atividades na fila");
            System.out.println("4 - Ver historico de realizadas");
            System.out.println("5 - Ver ultima realizada");
            System.out.println("6 - Sair");
            System.out.print("Opcao: ");

            opcao = scan.nextInt();
            scan.nextLine();

            if (opcao == 1) {
                System.out.print("Nome da atividade: ");
                String nome = scan.nextLine();
                fila.add(nome);
                System.out.println("Atividade adicionada!");

            } else if (opcao == 2) {
                if (!fila.isEmpty()) {
                    String atual = fila.poll();
                    pilha.push(atual);
                    System.out.println("Executada: " + atual);
                } else {
                    System.out.println("Fila vazia!");
                }

            } else if (opcao == 3) {
                if (!fila.isEmpty()) {
                    System.out.println("Atividades na fila:");
                    for (String item : fila) {
                        System.out.println("- " + item);
                    }
                } else {
                    System.out.println("Nenhuma atividade na fila.");
                }

            } else if (opcao == 4) {
                if (!pilha.isEmpty()) {
                    System.out.println("Atividades ja feitas:");
                    for (int i = pilha.size() - 1; i >= 0; i--) {
                        System.out.println("- " + pilha.get(i));
                    }
                } else {
                    System.out.println("Nenhuma atividade feita ainda.");
                }

            } else if (opcao == 5) {
                if (!pilha.isEmpty()) {
                    System.out.println("Ultima feita: " + pilha.peek());
                } else {
                    System.out.println("Pilha vazia.");
                }

            } else if (opcao == 6) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opcao invalida!");
            }
        }

        scan.close();
    }
}