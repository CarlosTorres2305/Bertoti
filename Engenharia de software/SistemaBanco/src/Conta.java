
public class Conta {
	//Atributos
	private String cliente;
	private int numConta;
	private float saldo;
	private String senha;
	private boolean aberta;
	
	//Métodos personalizados
	public void abrirConta() {
		this.setAberta(true);
	}
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta não pode ser fechada pois tem dinheiro!");
		} else if (this.getSaldo() < 0) {
			System.out.println("Conta não pode ser fechada pois está negativada!");
		} else {
			this.setAberta(true);
		}
	}
	public void mostrarStatus() {
		System.out.println("Cliente: " + this.getCliente());
		System.out.println("Saldo: R$" + this.getSaldo());
		if (this.getAberta()== false) {
			System.out.println("Conta Fechada");
		} else {
			System.out.println("Conta Aberta");
		}
	}
	//Métodos especiais
	public Conta(String cliente, int numConta, String senha) {
		this.cliente = cliente;
		this.numConta = numConta;
		this.senha = senha;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean getAberta() {
		return aberta;
	}
	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}
	
	
	
}
