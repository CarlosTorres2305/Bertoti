
public class CaixaEletronico {
	//Atributos
	private Conta conta;
	private float dinheiro;
	
	//Métodos personalizados
	public void efetuarSaque(float valor){
		if(this.getDinheiro() > valor) {			
			if(this.getConta().getSaldo() < valor) {
				System.out.println("Saldo insuficiente!");
			} else {
				System.out.println("Saque de: " + valor + "realizado com sucesso");
				valor = this.getConta().getSaldo() - valor;
				this.getConta().setSaldo(valor);
			}
		}else {
			System.out.println("Impossível sacar faltam cédulas!");
		}
	}
	public void efetuarDeposito(float valor){
		if (this.getConta().getAberta()) {
			this.getConta().setSaldo(this.getConta().getSaldo() + valor);
			System.out.println("Depósito de: R$" + valor + " realizado com sucesso!");
			this.getConta().mostrarStatus();
		} else {
			System.out.println("Acesso Negado!");
		}
	}
	public void consultarSaldo() {
		if (this.getConta().getAberta()) {
			System.out.println("SALDO: R$" + this.getConta().getSaldo());
		} else {
			System.out.println("Acesso Negado!");
		}
	}
	public void efetuarTransferencia(float valor, Conta para){
		if (this.getConta().getAberta()) {
			if (this.getConta().getSaldo() > valor) {
				para.setSaldo(para.getSaldo() + valor);
				this.getConta().setSaldo(this.getConta().getSaldo() - valor);
			}
		} else {
			System.out.println("Acesso Negado!");
		}
	}
	public void acessarConta(String password){
		if (password == this.getConta().getSenha()) {
			this.getConta().setAberta(true);
			System.out.println("Seja Bem vindo: " + this.getConta().getCliente());
			this.getConta().mostrarStatus();
		} else {
			System.out.println("Senha incorreta!");
		}
	}
	public void abastecerCaixa(float valor){
		System.out.println("Valor no caixa: R$" + this.getDinheiro());
		this.setDinheiro(this.getDinheiro() + valor);
		System.out.println("Novo valor no caixa: R$" + this.getDinheiro());
	}
	//Métodos especiais
	public CaixaEletronico(){
		this.setDinheiro(2000);
	public Conta getConta() {
		return conta;
	}
	
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	public float getDinheiro() {
		return dinheiro;
	}
	public void setDinheiro(float dinheiro) {
		this.dinheiro = dinheiro;
	}
	
	
}
