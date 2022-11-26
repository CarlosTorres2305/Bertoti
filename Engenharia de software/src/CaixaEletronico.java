import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CaixaEletronico {
	private List<Conta> contas = new LinkedList<Conta>();
	private List<Cedula> cedulas = new LinkedList<Cedula>();
	boolean leitorCartao;
	
	Scanner teclado = new Scanner(System.in);
	
	
	public boolean getLeitorCartao() {
		return leitorCartao;
	}

	public void setLeitorCartao(boolean leitorCartao) {
		this.leitorCartao = leitorCartao;
	}
	
	
	public void cadastrarConta(Conta conta) {
		contas.add(conta);
	}
	
	public void saque(int valor) {
		if (this.getLeitorCartao()){
			for (Conta conta:contas) {
				if (conta.getAcesso()) {
					if (conta.getSaldo() >= valor){
						conta.setSaldo(conta.getSaldo() - valor);
					}else {
						System.out.println("Saldo insuficiente!");
					}
				}else {
					System.out.println("Acesso negado!");
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
						} else {
							System.out.println("Saldo insuficiente!");
						}
					} else {
						System.out.println("Conta não existe!");
					}
				}
			} else {
				System.out.println("Acesso Negado!");
			}
		}
	}
	
	public void acessarConta(Cartao cartao) {
		for (Conta conta:contas) {
			if (conta.getNumConta() == cartao.getNumContaCartao()){
				System.out.println("Digite sua Senha:");
				int senha = teclado.nextInt();
					if (senha == conta.getSenha()) {
						conta.acesso = true;
					} else {
						System.out.println("Senha incorreta!");
					}
			}else {
				System.out.println("Conta não existe!");
			}
		}
	}

	
	public void carregarCedulas() {
		
	}
	
	public void inserirCartao() {
		leitorCartao = true;
		acessarConta(null);
	}

	// Execução
	
	public static void main(String[] args) {
		
	}
	
}
