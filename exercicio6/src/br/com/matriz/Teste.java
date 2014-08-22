package br.com.matriz;

public class Teste {

	public static void main(String[] args) {
		MatrizStrategy strategy = MatrizStrategyFactory
				.createMatrizStrategy(new Multiplicacao());
		strategy.montar();
		strategy.resultado();
	}
}
