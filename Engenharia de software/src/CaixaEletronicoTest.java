import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaixaEletronicoTest {

	@Test
	void test() {
		CaixaEletronico caixa = new CaixaEletronico();
		assertEquals(caixa.getContas().size(), 0);
		assertEquals(caixa.getLeitorCartao(), false);
		
		caixa.cadastrarConta(new Conta(new Cliente("Carlos", 1234), 123, 2305, 4444, new Cartao(2305)));
		caixa.cadastrarConta(new Conta(new Cliente("Maria", 4321), 123, 2405, 3333, new Cartao(2405)));
		assertEquals(caixa.getContas().size(), 2);
		
		assertEquals(caixa.getDinheiro(), 0);
		caixa.abastecerCaixa(5000);
		assertEquals(caixa.getDinheiro(), 5000);
		
		caixa.inserirCartao(2305);
		assertEquals(caixa.getLeitorCartao(), true);
		caixa.acessarConta(2305);
		caixa.deposito(3000);
		caixa.transferencia(2000, 2405);
		caixa.mostrarSaldo();
		caixa.encerrar(2305);
		
		//Acesso 2
		
		assertEquals(caixa.getLeitorCartao(), false);
		caixa.inserirCartao(2405);
		caixa.acessarConta(2405);
		caixa.mostrarSaldo();
		caixa.saque(1000);
		caixa.mostrarSaldo();
		assertEquals(caixa.getDinheiro(), 4000);
		
		
		
		
	}
	

}
