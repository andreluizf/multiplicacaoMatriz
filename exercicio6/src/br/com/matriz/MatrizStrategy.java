package br.com.matriz;

public class MatrizStrategy {
	private ResultadoMatriz resultado;

	public MatrizStrategy(ResultadoMatriz result) {
		super();
		this.resultado = result;
	}

	public void resultado() {
		resultado.imprimeResult();
	}

	public void montar() {
		resultado.montaMatriz();
	}

}
