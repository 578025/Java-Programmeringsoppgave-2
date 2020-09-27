package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int[] tabell:matrise) {
			for (int element : tabell) {
			System.out.print(element + " ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String resultat = "" ;
		
		for (int i=0; i<matrise.length; i++) {
			for (int j=0; j<matrise.length; j++)
			  resultat += matrise[i][j] + " ";
			resultat += "\n";
		
			}
			return resultat;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
       int[][] nyMatrise = new int[matrise.length][];
		
	for (int i = 0; i < matrise.length; i++) {
		int[] Ny = new int [matrise[i].length];
			nyMatrise[i] = Ny;
		//nyMatrise[i] = skalerTabell(tall, matrise[i]);
		
		
		}
		return nyMatrise;
	}
	
	/*public static int[] skalerTabell(int tall, int [] tabell) {
		for (int i = 0; i < tall; i++) {  
	            
	} 
	return tabell;
}*/
	
	
	
	
	
	
	// d)
	public static boolean erLik(int[][] a, int[][] b) {
 boolean ulik = false;
 
		if ( a == b) {
			ulik = true;
	}
	return ulik;
		}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		
		   int[][] nyMatrise = new int[matrise.length][matrise.length];
		   
		   for (int i = 0; i< matrise.length; i++) 
			for (int k = 0; k < i; k++) {
				
				int h = matrise[k][i];
				nyMatrise[k][i] = h;
			}
			return nyMatrise;
		}
		
		
		/*int[][] nyMatrise = new int[matrise.length][];
		for (int i=0; i<matrise.length; i++)
			for (int j=0; j<i; j++) {
			  int h = nyMatrise[i][j];
			  nyMatrise[i][j] = h;
			}
			return nyMatrise;*/
	

	
	
	
	
	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		int nyMatrise [] [] = new int [a.length][a.length];

	    for(int i=0;i<a.length;i++){

	        for(int j=0;j<a.length;j++){

	            int sum=0;

	            for(int x=0;x<a.length;x++){
	                sum+=a[i][x]*b[x][j];
	            }
	            nyMatrise[i][j]=sum;
	    }
	}

	return nyMatrise;
	
	}
}
