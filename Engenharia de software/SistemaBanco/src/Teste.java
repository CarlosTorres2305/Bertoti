import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void test() {
		Conta c1 = new Conta("Carlos",2323,"1234");
		Conta c2 = new Conta("Maria",2304,"5678");
		
		CaixaEletronico cx1 = new CaixaEletronico();
		
		cx1.acessarConta("1234", c1);
		cx1.efetuarDeposito(5000, c1);
		cx1.consultarSaldo(c1);
		cx1.efetuarTransferencia(300, c1, c2);
		
		//cx1.acessarConta("5678", c2);
		cx1.efetuarSaque(100, c2);
		cx1.getConta().fecharConta();
	}

}
