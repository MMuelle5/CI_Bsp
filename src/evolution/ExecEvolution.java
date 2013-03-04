package evolution;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import first.CalcHelper;
import first.GenerateNachkommen;
import first.Individum;
import first.Mutieren;


public class ExecEvolution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Random rand = new Random();
		
		List<IndividumEvo> wesen = new ArrayList<IndividumEvo>();
		
		//Initialisierung der Eltern
		for(int i = 0; i < 7; i++) {
			IndividumEvo ind = new IndividumEvo();
			ind.setId(i);
			for(int j = 0; j < 5; j ++) {
				ind.getD()[j] = rand.nextInt(31);
				ind.getH()[j] = rand.nextInt(31);
			}
			wesen.add(ind);
		}
		
		List<IndividumEvo> highScore = new ArrayList<IndividumEvo>();
		double topFlaeche = 99999999999d;
		
		/*
		 * 1. Wertet aus
		 * 2. notiert besten wert
		 * 3. reproduziert
		 * 4. mutiert
		 */
//		for(int y = 0; y < 100; y++) {
//			
//			//Auswerten und gueltige selektieren
//			wesen = CalcHelper.getAusgewerteteList(wesen);
//			List<Integer> rangSel = CalcHelper.getRangList();
//			
//			highScore.add(wesen.get(0));
//			if(wesen.get(0).getFlaeche() < topFlaeche) {
//				topFlaeche = wesen.get(0).getFlaeche();
//			}
//			
////			System.out.println(wesen.size());
//			System.out.println(wesen.get(0).getFlaeche() + "     " + topFlaeche);
//			
//			//Kiner erzeugen
////			List<Individum> nachkommen = new ArrayList<Individum>();
////			for(int i = 0; i < 30; i+=2) {
////				nachkommen.addAll(GenerateNachkommen.getNachkommen(wesen.get(rand.nextInt(wesen.size()-1)), wesen.get(rand.nextInt(wesen.size()-1))));
////			}
////			
////			wesen = new ArrayList<Individum>();
////			wesen.addAll(nachkommen);
//			for(int i = 0; i < 10; i+=2) {
//				int rand1 = rand.nextInt(rangSel.size()-1);
//				int rand2 = rand.nextInt(rangSel.size()-1);
//				Individum rand1Ind = null;
//				Individum rand2Ind = null;
//				
//				for(Individum ind : wesen) {
//					if(ind.getId() == rangSel.get(rand1)) {
//						rand1Ind = ind;
//					}
//					if(ind.getId() == rangSel.get(rand2)) {
//						rand2Ind = ind;
//					}
//				}
//				
//				List<Individum> child = GenerateNachkommen.getNachkommen(rand1Ind, rand2Ind);
//				if(wesen.size() >= 30) {
//					for(int j = rangSel.size()-1; j >= 0; j --) {
//						if(rangSel.get(j) == rand1Ind.getId()) {
//							rangSel.remove(j);
//						}
//					}
//					wesen.remove(rand1Ind);
//				}
//				if(wesen.size() >= 29) {
//					for(int j = rangSel.size()-1; j >= 0; j --) {
//						if(rangSel.get(j) == rand2Ind.getId()) {
//							rangSel.remove(j);
//						}
//					}
//					wesen.remove(rand2Ind);	
//				}
//				
//				wesen.addAll(child);
//			}
//			//Mutation der Wesen
//			for(Individum ind : wesen) {
//				Mutieren.mutieren(ind);
//				
//			}
//		}
	}

}
