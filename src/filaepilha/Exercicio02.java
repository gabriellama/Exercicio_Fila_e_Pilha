package filaepilha;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio02 {

	public static void main(String[] args) {
		Stack<String> pilhaLivros = new Stack<String>();
        Scanner leia = new Scanner(System.in); 
        int opcao;
        
        System.out.println("❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️\n ");
        System.out.println("1 - Adicionar livro na pilha");
        System.out.println("2 - Listar todos os livros");
        System.out.println("3 - Retirar livro da pilha");
        System.out.println("0 - Sair");
        System.out.println("\n❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️");
        System.out.println("Entre com a opção desejada: ");
        
        do {
            opcao = leia.nextInt();
            leia.nextLine();
            
            switch(opcao) {
                case 1: 
                    System.out.println("Digite o nome do livro: ");
                    String livro = leia.nextLine();
                    pilhaLivros.push(livro);
                    System.out.println("\nPilha: " + pilhaLivros);
                    System.out.println("Livro adicionado! ");
                    break; 
                
                case 2: 
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("\nA pilha está vazia!");
                    } else {
                        System.out.println("\nLista de livros na pilha:");
                        for (String livros : pilhaLivros) {
                            System.out.println(livros);
                        }
                    }
                    break;
                
                case 3:
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("\nA pilha está vazia!");
                    } else {
                        String livroRetirado = pilhaLivros.pop();
                        System.out.println("\nPilha:  " + pilhaLivros);
                        System.out.println("\nUm livro foi retirado da pilha!");
                    }
                    break;
                
                case 0: 
                    System.out.println("\nPrograma Finalizado!");
                    break;
                
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);
        
        leia.close();
	}

}
