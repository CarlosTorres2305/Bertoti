
public class Conta {
	Cliente cliente;
	int ag;
	int numConta;
	int senha;
	float saldo;
	boolean acesso;
	boolean status;
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public int getAg() {
		return ag;
	}
	public void setAg(int ag) {
		this.ag = ag;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public boolean getAcesso() {
		return acesso;
	}
	public void setAcesso(boolean acesso) {
		this.acesso = acesso;
	}
	public boolean getStatus() {
		return status;
	}
	public Conta(Cliente cliente, int ag, int numConta, int senha) {
		this.cliente = cliente;
		this.ag = ag;
		this.numConta = numConta;
		this.senha = senha;
		this.setSaldo(0);
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
