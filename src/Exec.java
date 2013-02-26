import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Exec {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Random rand = new Random();
		
		List<Individum> wesen = new ArrayList<Individum>();
		
		//Initialisierung der Eltern
		for(int i = 0; i < 30; i++) {
			Individum ind = new Individum();
			for(int j = 0; j < 5; j ++) {
				ind.getD()[j] = rand.nextInt(2);
				ind.getH()[j] = rand.nextInt(2);
			}
			wesen.add(ind);
		}
		
		List<Individum> highScore = new ArrayList<Individum>();
		double topFlaeche = 99999999999d;
		
		/*
		 * 1. Wertet aus
		 * 2. notiert besten wert
		 * 3. reproduziert
		 * 4. mutiert
		 */
		for(int y = 0; y < 100; y++) {
			
			//Auswerten und gueltige selektieren
			wesen = CalcHelper.getAusgewerteteList(wesen);
			
			highScore.add(wesen.get(0));
			if(wesen.get(0).getFlaeche() < topFlaeche) {
				topFlaeche = wesen.get(0).getFlaeche();
			}
			System.out.println(wesen.size());
//			System.out.println(wesen.get(0).getFlaeche() + "     " + topFlaeche);
			
			List<Individum> nachkommen = new ArrayList<Individum>();
			//Kiner erzeugen
			for(int i = 0; i < 30; i+=2) {
				nachkommen.addAll(GenerateNachkommen.getNachkommen(wesen.get(rand.nextInt(wesen.size()-1)), wesen.get(rand.nextInt(wesen.size()-1))));
			}
			
			wesen = new ArrayList<Individum>();
			wesen.addAll(nachkommen);
			//Mutation der Wesen
			for(Individum ind : wesen) {
				Mutieren.mutieren(ind);
				
			}
		}
	}

}
