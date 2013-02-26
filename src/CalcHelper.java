import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class CalcHelper {
	
	private static List<Integer> retVal;
	
	public static List<Integer> getRangList() {
		return retVal;
	}

	public static AuswertenUndChecken auswertung(Individum ind) {
		
		AuswertenUndChecken auc = new AuswertenUndChecken();
		
		auc.setFunktionsWert(Math.PI*(Math.pow(ind.getReelD(), 2))/2+Math.PI*ind.getReelD()*ind.getReelH());
		
		auc.setNebenBedErf(((Math.PI*Math.pow(ind.getReelD(), 2)*ind.getReelH())/4 >= 300 ? true : false));
		
		return auc;
		
	}
	
	/**
	 * Sortiert die gueltigen Individuen und wirft die ungueltigen raus
	 * @param wesen
	 * @return
	 */
	public static List<Individum> getAusgewerteteList(List<Individum> wesen) {
			
			LinkedList<Individum> sorted = new LinkedList<Individum>();
			
			int totRaenge = 0;
//			for(Individum ind : wesen) {
			for(int y = wesen.size()-1; y >= 0; y--) {
				Individum ind = wesen.get(y);
				AuswertenUndChecken auc = CalcHelper.auswertung(ind);
				if(auc.isNebenBedErf()) {
					totRaenge ++;
					ind.setFlaeche(auc.getFunktionsWert());
	
					boolean isInserted = false;
					for(int i = 0; i < sorted.size(); i ++) {
						if(sorted.get(i).getFlaeche() > auc.getFunktionsWert()) {
							isInserted = true;
							sorted.add(i, ind);
							break;
						}
					}
	
					if(!isInserted) {
						sorted.addLast(ind);
					}
				}
			}
			
			retVal = new ArrayList<Integer>();
			for(Individum iv : sorted) {
//				System.out.println(totRaenge +" "+iv.getFlaeche());
				for(int i = 0; i < totRaenge; i ++) {
					retVal.add(iv.getId());
				}
				totRaenge --;
			}
			
			return sorted;
		}
}
