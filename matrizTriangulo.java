package arraysImplementacion.model;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class matrizTriangulo {

	public static void main(String[] args) {

		int tamanio1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño 1 positivo: "));
		int tamanio2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño 2 positivo: "));
		if(tamanio1 <= 0 || tamanio2 <= 0){
			System.out.println("Le dije que positivo");
		}
		
		char[][] matrizTriangulo = crearMatrizTriangulo(tamanio1, tamanio2);
		System.out.println(Arrays.deepToString(matrizTriangulo));
	}

	public static char[][] crearMatrizTriangulo (int tamanio1, int tamanio2){
		char[][] matrizTriangulo = new char[tamanio1][tamanio2];
		int var1 = (matrizTriangulo.length-1)/2;
		int var2 = (matrizTriangulo.length-1)/2;		
		
		if (tamanio2 % 2 != 0){
			for (int i = 0; i < matrizTriangulo.length || var2 < matrizTriangulo.length; i++) {
				
				for (int j = var1; j < var2; j++) {
					matrizTriangulo[i][j] = '*';
					var1--;
					var2++;
				}
				
			}		
			
		}
		else{
			System.out.println("Las columnas no son impares");
		}

		
		return matrizTriangulo;
	}
	
}
