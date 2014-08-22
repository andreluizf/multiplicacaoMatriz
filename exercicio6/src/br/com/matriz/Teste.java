package br.com.matriz;

public class Teste {

	public static void main(String[] args) {
		MatrizStrategy strategy = MatrizStrategyFactory
				.createMatrizStrategy("multiplicacao");
		strategy.montar();
		strategy.resultado();
	}
}
