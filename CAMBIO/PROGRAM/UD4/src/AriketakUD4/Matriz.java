package AriketakUD4;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[][] matriz = new char[2][2];
		
		char[][] matriz2 = new char[5][8];
		
		
		for (int fila=0;fila<matriz.length;fila++) {	
			for (int columna=0;columna<matriz[fila].length;columna++) {
				matriz[fila][columna]='#';
				System.out.print(matriz[fila][columna]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int fila=0;fila<matriz2.length;fila++) {	
			for (int columna=0;columna<matriz2[fila].length;columna++) {
				matriz2[fila][columna]='#';
				System.out.print(matriz2[fila][columna]);
			}
			System.out.println();
		}
		
	}

}
