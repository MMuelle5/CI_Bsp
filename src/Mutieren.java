
public class Mutieren {

	private final static double PM = 0.1d; //Math.random();
	
	public static void mutieren(Individum ind) {
		ind.setD(mutiereArray(ind.getD()));
		ind.setH(mutiereArray(ind.getH()));
	}
	
	private static int[] mutiereArray(int[] mut) {
		
		for(int i = 0; i< mut.length; i++) {
			if(Math.random() < PM) {
				mut[i] = mut[i] == 1 ? 0 : 1;
			}
		}
		
		return mut;
	}
}
