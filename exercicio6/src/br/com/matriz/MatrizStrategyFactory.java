package br.com.matriz;

public class MatrizStrategyFactory {

	public static MatrizStrategy createMatrizStrategy(ResultadoMatriz type) {

		return new MatrizStrategy(type);
	}
}
