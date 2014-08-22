package br.com.matriz;

public class MatrizBuilder  {
	public String nome;
	public int[][] mat;

	public MatrizBuilder(String nome) {
		super();
		this.nome = nome;
	}

	public MatrizBuilder setNome(String nome) {
		this.nome = nome;
		return this;
	}
	
	public Matriz build() {
		return new MontaMatriz(this);

	}

}
