package Semana3;

import java.util.Scanner;

public class TestaConta {

	private static Conta destino;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual ser� o tipo de conta Corrente(c) ou Poupan�a(p)");
		String tipoConta = scanner.next();

		System.out.println("Digite o nome do novo correntista");
		String nomeDoCliente = scanner.next();
		Cliente cliente = new Cliente(nomeDoCliente);

		System.out.println("Digite o valor inicial da conta corrente");
		Double saldo = scanner.nextDouble();
		Conta conta;
		
		if (tipoConta.equals("c")) {
			conta = new ContaCorrente(saldo, cliente);
		} else {
			conta = new ContaPoupanca(saldo, cliente);
		}

		Boolean realizarOperacoes = true;
		while (realizarOperacoes) {
			System.out.println("Qual opera��o voc� deseja realizar?");
			System.out.println("[s] Saque");
			System.out.println("[d] Dep�sito");
			System.out.println("[e] Extrato");
			System.out.println("[t] Transfer�ncia");
			System.out.println("[f] Encerrar");
			System.out.println("[c] Cheque especial (gerente)");

			String opcao = scanner.next();

			switch (opcao) {
			case "s":
				System.out.println("Valor do saque: ");
				Double valorSaque = scanner.nextDouble();
				conta.realizarSaque(valorSaque);
				break;
			case "d":
				System.out.println("Valor do dep�sito: ");
				Double valorDeposito = scanner.nextDouble();
				conta.depositar(valorDeposito);
				break;
			case "e":
				conta.listarExtratoComSaldo();			
				break;
			case "t":
				System.out.println("Quanto deseja transferir: ");
	            Double valorTransferencia = scanner.nextDouble();
	            conta.transfere(conta, valorTransferencia);
	           	break;
				
			case "f":
				conta.encerrarConta();
				break;
			case "c":
				if (conta instanceof ContaCorrente) {
					System.out.println("Senha do gerente");
					String senhaDoGerente = scanner.next();
					System.out.println("Novo valor do limite da conta corrente");
					Double novoValorLimite = scanner.nextDouble();
					((ContaCorrente) conta).adicionarLimiteChequeEspecial(novoValorLimite, senhaDoGerente);
				} else {
					System.out.println("N�o � poss�vel fazer opera��es de cheque especial em conta poupan�a");
				}
				
				break;
			default:
				break;
			}
			
			System.out.println("Deseja continuar fazendo opera��es (s)/(n)");
			realizarOperacoes = scanner.next().equals("s");

		}
		scanner.close();

	}

}