package br.com.matriz;

public class MatrizStrategyFactory {

	public static MatrizStrategy createMatrizStrategy(String type) {
		MatrizStrategy strategy;
		switch (type) {
		case "multiplicacao":
			return strategy = new MatrizStrategy(new Multiplicacao());

		case "adicao":
			System.out.println("adicao");
			return null;

		case "subtracao":
			System.out.println("subtracao");
			return null;

		}
		return null;
	}
}
