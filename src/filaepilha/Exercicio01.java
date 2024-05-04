package filaepilha;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Queue<String> filaClientes = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		int opcao;
		
		System.out.println("❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️\n");
		System.out.println(" 1 - Adicionar Cliente na Fila ");
		System.out.println(" 2 - Listar todos os Clientes ");
		System.out.println(" 3 - Retirar Cliente da fila ");
		System.out.println(" 0 - Sair");
		System.out.println("\n❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️\n");
		System.out.println("Entre com a opção desejada: ");
		
		do {
			opcao = leia.nextInt();
		
			switch(opcao) {
			case 1: 
				System.out.println("Digite o nome do cliente: ");
				leia.nextLine();
				String nomeCliente = leia.nextLine();
                filaClientes.offer(nomeCliente);
                System.out.println("\nFila: " + filaClientes);
				System.out.println("Cliente Adicionado!");
				break;
				
			case 2:
				 if (filaClientes.isEmpty()) {
                     System.out.println("\nA fila está vazia!");
                 } else {
                     System.out.println("\nLista de Clientes na Fila:");
                     for (String cliente : filaClientes) {
                         System.out.println(cliente);
                     }
                 }
                 break;
                 
			case 3:
                if (filaClientes.isEmpty()) {
                    System.out.println("\nA fila está vazia!");
                } else {
                    String clienteChamado = filaClientes.poll();
                    System.out.println("\nFila: " + filaClientes);
                    System.out.println("\nO Cliente foi chamado! ");
                }
                break;
            
            case 0: 
                System.out.println("Programa Finalizado!");
                break;
                
            default:
                System.out.println("\nOpção inválida. Tente novamente.");
                break; 
			}
		} while (opcao != 0);
		
		leia.close();
	}
	
}
