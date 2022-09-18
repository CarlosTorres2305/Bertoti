
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
				valor = this.getConta().getSaldo() - valor;
				this.getConta().setSaldo(valor); 
			}
		}	
	}
	public void efetuarDeposito(){
		
	}
	public void consultarSaldo() {
		
	}
	public void efetuarTransferencia(){
		
	}
	public void acessarConta(){
		
	}
	public void abastecerCaixa(){
		
	}
	//Métodos especiais
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
