package br.com.matriz;

public class MatrizStrategy {
	private Resultado resultado;

	public MatrizStrategy(Resultado result) {
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
