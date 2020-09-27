package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
System.out.print("[");

for (int tall : tabell) {
	System.out.print(tall + " ");
	
}
System.out.println("]");

	}

	
	
	// b)
	public static String tilStreng(int[] tabell) {
		
		/*String resultat = "";
		for (int i = 0; i< tabell.length; i++) {
			int tall = tabell[i];
			
			resultat = resultat + "," + tall;
			
		}
		System.out.println("[" + resultat + "]");
		
		return resultat;
	}*/
	
	
	//annen versjon av oppgave b
		
	String resultat = "";
		int i = 0;
	
		/*if (tabell.length == 0) {
		return "[]";
		}*/
		
	while (i<tabell.length-1) {
    resultat = resultat + tabell[i]+ ",";
    i++;
		}
	resultat = resultat + tabell[i];
	return ("[" + resultat + "]");

}
	// c)

	public static int summer(int[] tabell) {
int sum = 0;

for (int i = 0; i< tabell.length ; i++) {
     sum += tabell[i];
}
return sum;
	}
	
	
	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		
boolean funnet = false;
int sted = 0;

while (!funnet && sted < tabell.length) {
	if ( tall == tabell[sted]) {
		funnet = true;
		
	}
	sted++;
}
return funnet;
	}
	
	
	
	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		
    boolean funnet = false;
    int posisjon = -1;
    int index = 0;
    
    while (!funnet && index < tabell.length) {
    if (tall == tabell[index]) {
    	posisjon = index;
    	funnet = true;
    	}
    	
    	index++;
    }
    	return posisjon;
    }

	// f)
	public static int[] reverser(int[] tabell) {
		
		/*int v = 0;
		int h = tabell.length -1;
		
		while (v < h) {
			int temp = tabell[v];
			tabell[v] = tabell [h];
			tabell[h] = temp;
			
			v++;
			h++;
		}
		return tabell;
	}*/

		int ny = tabell.length;
		int [] nyTabel = new int [ny];
		
		for (int i =0; i < nyTabel.length; i++) {
			nyTabel[i] = tabell[i];
		}
		for (int r = 0; r < nyTabel.length / 2; r++) {
			
			int t = nyTabel[r];
			
			nyTabel[r] = nyTabel[nyTabel.length - r -1];
			
			nyTabel[nyTabel.length - r - 1] = t;
		}
		return nyTabel;
		}

	
	
	
	
	// g)
	public static boolean erSortert(int[] tabell) {

boolean sortert = true;
int tall = 1; 

while (sortert && tall < tabell.length) {
	if (tabell[tall-1] <= tabell [tall])
		tall++;
	else
		sortert = false;
}
if (!sortert);
	return sortert;
}
	

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int nyLength = tabell1.length + tabell2.length;
		int [] nyTabell = new int [nyLength];
		
		for(int i = 0; i< tabell1.length; i++ ) {
			nyTabell[i] = tabell1[i];
		}
		for (int a = 0; a < tabell2.length; a++) {
			nyTabell [tabell1.length + a] = tabell2[a];
		}
		return nyTabell;
	}
}







