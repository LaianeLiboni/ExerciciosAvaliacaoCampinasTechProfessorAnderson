package Semana3;

public class ContaCorrente extends Conta {

	private Double limiteChequeEspecial = 0.0;

	public ContaCorrente(Double saldo, Cliente cliente) {
		super(saldo, cliente);
	}

	public void adicionarLimiteChequeEspecial(Double valorLimite, String senhaGerente) {
		this.verificaContaAtiva();

		if (this.contaAtiva) {
			if (senhaGerente.equals("1234")) {
				this.limiteChequeEspecial = valorLimite;
			}
		}
	}

	@Override
	public void listarExtratoComSaldo() {
		super.listarExtratoComSaldo();
		System.out.printf("Limite de cheque especial %f\n", this.limiteChequeEspecial);
		System.out.printf("Saldo e limite: %f\n", this.getSaldo() + this.limiteChequeEspecial);

	}

	@Override
	public void realizarSaque(Double valorSaque) {

		this.verificaContaAtiva();

		if (this.contaAtiva) {
			if (valorSaque <= this.getSaldo()) {
				this.atualizaSaldo(-valorSaque);
				this.addMovimentacao(-valorSaque);
				System.out.printf("Saque no valor %f realizado com sucesso\n", valorSaque);
			} else if (valorSaque <= this.getSaldo() + this.limiteChequeEspecial) {
				this.atualizaSaldo(-valorSaque);
				this.addMovimentacao(-valorSaque);
				System.out.printf("Saque no valor %f relizado com sucesso utilizando o valor do cheque especial\n",
						valorSaque);
			} else {
				System.out.println("Saque não permitido, não há valor disponível na conta");
			}
		}
	}
	
	public void debito(double valor){
		super.debito(valor);
	}
	
	@Override
	public void transfere(Conta destino, double valorTransferencia){		
		
		this.verificaContaAtiva();

		if (this.contaAtiva) {
			if (valorTransferencia <= this.getSaldo()) {
				this.atualizaSaldo(-valorTransferencia);
				this.addMovimentacao(-valorTransferencia);
				System.out.printf("Transferência no valor %f realizada com sucesso\n", valorTransferencia);
			} else {
				System.out.println("Transferência não permitida, não há valor disponível na conta");
			}
		}
	}
		

}