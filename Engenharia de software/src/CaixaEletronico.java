import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CaixaEletronico {
	private List<Conta> contas = new LinkedList<Conta>();
	private float dinheiro;
	boolean leitorCartao = false;
	
	Scanner teclado = new Scanner(System.in);
	
	
	public boolean getLeitorCartao() {
		return leitorCartao;
	}

	public void setLeitorCartao(boolean leitorCartao) {
		this.leitorCartao = leitorCartao;
	}
	
	
	public float getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(float dinheiro) {
		this.dinheiro = dinheiro;
	}

	public void cadastrarConta(Conta conta) {
		contas.add(conta);
	}
	
	public void saque(float valor) {
		if (this.getLeitorCartao()){
			for (Conta conta:contas) {
				if (conta.getAcesso()) {
					if(valor <= this.getDinheiro()) {
						if (conta.getSaldo() >= valor){
							conta.setSaldo(conta.getSaldo() - valor);
							this.setDinheiro(this.getDinheiro() - valor);
							break;
						}else {
							System.out.println("Saldo insuficiente!");
						}
					}else {
						System.out.println("Falta dinheiro no caixa!");
					}
				} 
			}
		} else {
			System.out.println("Insira o cartão primeiro!");
		}
	}
	
	public void deposito(float valor) {
		if (this.getLeitorCartao()){
			for (Conta conta:contas) {
				if (conta.getAcesso()) {
					conta.setSaldo(conta.getSaldo() + valor);
					break;
				}else {
					System.out.println("Acesso negado!");
				}
			}
		} else {
			System.out.println("Insira o cartão primeiro!");
		}
	}
	
	public void transferencia(float valor, int para) {
		for (Conta conta:contas) {
			if(conta.getAcesso()) {
				for(Conta destino:contas) {
					if(para == destino.getNumConta()) {
						//verificar saldo
						if (conta.getSaldo() >= valor){
							destino.setSaldo(destino.getSaldo() + valor);
							conta.setSaldo(conta.getSaldo() - valor);
							break;
						} else {
							System.out.println("Saldo insuficiente!");
						}
					}
				}
			} 
		}
	}
	
	

	
	public void abastecerCaixa(float valor) {
		this.setDinheiro(this.getDinheiro() + valor);
	}
	
	public void inserirCartao(int numContaCartao) {
		leitorCartao = true;
	}
	public void acessarConta(int cartao) {
		for (Conta conta:contas) {
			if (conta.getNumConta() == cartao){
				System.out.println("Digite sua Senha:");
				int senha = teclado.nextInt();
					if (senha == conta.getSenha()) {
						conta.acesso = true;
						System.out.println("Acesso Liberado");
						break;
					} else {
						System.out.println("Senha incorreta!");
						break;
					}
			}
		}
	}
	
	public void mostrarSaldo() {
		for (Conta conta:contas) {
			if(conta.getAcesso()) {
				System.out.println("Conta: " + conta.getCliente().getNome() +
						" Saldo: " + "R$" + conta.getSaldo());
				break;
			}
		}
	}
	
	public void encerrar(int numConta) {
		for(Conta conta:contas) {
			conta.setAcesso(false);
			leitorCartao = false;
		}
	}
	// p/ testes
	
	public List<Conta> getContas() {
		return this.contas;
	}
	
}
