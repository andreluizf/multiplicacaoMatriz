package br.com.matriz;

import javax.swing.JOptionPane;

public class Multiplicacao implements ResultadoMatriz {
	int[][] result;
	int aux = 0;
	Matriz mat1;
	Matriz mat2;

	@Override
	public void montaMatriz() {
		mat1 = new MatrizBuilder("Matriz 1").build();
		mat2 = new MatrizBuilder("Matriz 2").build();
		mat1.tamanhoMatriz();
		mat2.tamanhoMatriz();

		while (mat1.getColuna() != mat2.getLinha()) {
			JOptionPane
					.showMessageDialog(
							null,
							"Nãoo é possivel realizar multiplicação destas matrizes.\n -O numero de colunas da 1 matriz deve ser igual ao numero de linhas da 2 matriz");
			mat1.tamanhoMatriz();
			mat2.tamanhoMatriz();

		}

		mat1.valorMatriz();
		mat2.valorMatriz();

	}

	@Override
	public void imprimeResult() {
		result = new int[mat1.getLinha()][mat2.getColuna()];
		for (int l = 0; l < mat1.getLinha(); l++) {
			for (int c = 0; c < mat2.getColuna(); c++) {
				aux = 0;
				for (int i = 0; i < mat1.getColuna(); i++) {

					aux = aux + (mat1.getMat()[l][i] * mat2.getMat()[i][c]);
				}

				result[l][c] = aux;
				System.out.print(result[l][c] + " ");
			}
			System.out.println("\n");
		}
	}

}