package repasoExV3;

import java.util.ArrayList;

public class App implements ExamenProgramacion{

	public static void main(String[] args) {
		
		
		//sumaColumnasMatriz
		int[][] m = { {3,4,4,2}, {2,1,1,0}, {7,1,2,3} };		

		int[] vMatriz = sumaColumnasMatriz(m);

		for(int i = 0; i < m.length; i++)
		{
			System.out.print("  ");
			
			for(int j = 0; j < m[0].length; j++)
				System.out.print(m[i][j]+" ");
			
			System.out.println();
		}
			
		
		System.out.println(" --------");
		System.out.print(" ");
		for(int i = 0; i < vMatriz.length; i++)
			System.out.print(vMatriz[i]+" ");
		
		
		//secuenciaMayor
		int[] vVector = {2,2,5,5,5,4,4};
		
		System.out.println("\n\n----------------------");
		System.out.print("\n ");
		
		for(int i=0; i<vVector.length; i++)
				System.out.print(vVector[i]+" ");  
		
		int repeticionesSecuenciales = secuenciaMayor(vVector);
		
		System.out.println("\n\nHay un numero que se repite "+repeticionesSecuenciales+" veces!");
		
		//mediaImparesDesdePrimerPar 
		System.out.println("\n\n----------------------");
		System.out.print("\n "); 
		
		int[] nums = {3,5,2,3,7,4,5};
		
		for(int i=0; i<nums.length; i++)
			System.out.print(nums[i]+" ");
		
		int media = mediaImparesDesdePrimerPar(nums);
		
		System.out.print("\n\nLa media truncada de los impares a partir del primer par es: " + media);
		
	}

	public static int[] sumaColumnasMatriz(int[][] m) {
		int[] newM = new int[m[0].length];
		
		for(int i = 0; i < m[0].length; i++)  //nº de columnas
			for(int j = 0; j < m.length; j++)  // nº de filas	
				newM[i] += m[j][i];
	
		return newM;
	}

	public static void sqlToCsv(String sql, String fichero) {
		
		
	}

	public static int insertaMediaTrabajos(Alumno A) {

		return 0;
	}

	public static int secuenciaMayor(int[] v) {
		 
		int cont = 0, max = 0;
		ArrayList<Integer> aux = new ArrayList<Integer>();
		 for (int i = 0; i < v.length; i++)	
		 {
			 for (int j = 0 ; j < v.length; j++)
		         if(v[i] == v[j])
		        	 cont++;
		   
		    aux.add(cont); 
		    cont = 0;
		 }
		
		 
		 for(Integer Elements : aux)
		 {
			 if(Elements > max)
				 max = Elements;
		 }
	            
		return max; 

	}

	public static int mediaImparesDesdePrimerPar(int[] v) {
		int media = 0, aux = 0, cont = 0;
		boolean check = false;
		
		for (int i = 0; i < v.length; i++)
		{
			if(!check)
			if(v[i]%2 == 0)
			{
				aux = i;
				check = true;
			}
				
		}
		
		for (int i = aux; i < v.length; i++)
		{
			if(v[i]%2 != 0)
			{
				media+= v[i];
				cont++;
			}
			   
		}
	
		return (media/cont);
	}

	public static String mayorEdad(ArrayList<Mascota> mascotas) {
		
		return null;
	}

}
