package br.com.matriz;

import javax.swing.JOptionPane;

public class MontaMatriz implements Matriz {
	private int[][] mat;

	private int linha;
	private int coluna;
	private int l = 0;
	private int c = 0;

	private String nome;

	public MontaMatriz(MatrizBuilder matriz) {
		this.nome = matriz.nome;
	}

	@Override
	public int getLinha() {
		return linha;
	}

	@Override
	public int getColuna() {
		return coluna;
	}

	@Override
	public int[][] getMat() {
		return mat;
	}

	@Override
	public void valorMatriz() {

		try {
			if (l < linha) {
				if (c < coluna) {

					mat[l][c++] = Integer.parseInt(JOptionPane
							.showInputDialog(new StringBuffer()
									.append("Informe o valor da  ")
									.append(nome).append(" para linha ")
									.append(l).append(" coluna ").append(c)
									.append(" :")));
					valorMatriz();

				}
				c = 0;
				l++;
				valorMatriz();
			}
		} catch (Exception e) {
			--c;
			JOptionPane.showMessageDialog(null, "Valor invalido");
			valorMatriz();
		}

	}

	@Override
	public void tamanhoMatriz() {

		linhaMatriz();
		colunaMatriz();

		mat = new int[linha][coluna];

	}

	@Override
	public void linhaMatriz() {
		try {
			linha = Integer.parseInt(JOptionPane
					.showInputDialog(new StringBuffer()
							.append("Informe o a quantidade de linhas da  ")
							.append(nome).append(" :")));
			if (linha == 0) {
				JOptionPane.showMessageDialog(null, "Tamanho linha invalido");
				linhaMatriz();
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Tamanho linha invalido");
			linhaMatriz();
		}

	}

	@Override
	public void colunaMatriz() {
		try {
			coluna = Integer.parseInt(JOptionPane
					.showInputDialog(new StringBuffer()
							.append("Informe o a quantidade de colunas da   ")
							.append(nome).append(" :")));
			if (coluna == 0) {
				JOptionPane.showMessageDialog(null, "Tamanho linha invalido");
				colunaMatriz();
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Tamanho coluna invalido");
			colunaMatriz();
		}
	}

}
