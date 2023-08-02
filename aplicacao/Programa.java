import entidade.Conta;
import java.util.*;

public class Programa {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		char resposta = 's';
		
		System.out.print("Informe o numero da conta: ");
		int numero = sc.nextInt();	
		System.out.print("Informe o nome do cliente: ");
		sc.nextLine(); // .nestLine() -> criada para consumir a quebra de linha do sc.nextInt() acima...
		String nome = sc.nextLine();

		// Declaração de variável para utilizar o construtor de três argumentos:
		Conta conta;
		
		System.out.print("Deseja efetuar depósito inicial(s/n)?: ");
		resposta = sc.next().charAt(0);
		if(resposta == 's') {
			System.out.print("Informe o valor do depósito inicial: ");
			double depositoInicial = sc.nextDouble();
			// Instanciação da conta:
			conta = new Conta(numero, nome, depositoInicial);
			System.out.print(conta);
		}
		else {
			conta = new Conta(numero, nome);
			System.out.print(conta);
		}

		System.out.print("\nDepositar(s/n)?: ");
		resposta = sc.next().charAt(0);
			if(resposta == 's') {
				System.out.print("Informe o valor do depósito: ");
				double deposito = sc.nextDouble();
				conta.depositar(deposito);
				System.out.print("Dados atualizados!\n" + conta);
			}

		System.out.print ("\nSacar(s/n)?: ");
		resposta = sc.next().charAt(0);
			if(resposta == 's') {
				System.out.print ("Informe o valor do Saque: ");
				double saque = sc.nextDouble();	
				conta.sacar(saque);
				System.out.print ("Dados atualizados!\n" + conta);
			}		
		
		sc.close();
	}

}
