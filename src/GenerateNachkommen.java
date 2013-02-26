import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class GenerateNachkommen {

	public static List<Individum> getNachkommen(Individum par1, Individum par2) {
		
		List<Individum> retVal = new ArrayList<Individum>();
		
		Random rand = new Random();
		
		int zahl = rand.nextInt(10); 
		while(zahl == 0) {
			zahl = rand.nextInt(10);
		}
		
		Individum child1 = new Individum();
		Individum child2 = new Individum();
		
		
		for(int i = 0; i < 10; i++) {
			if(i < 5) {
				child1.getD()[i] = i<zahl ? par1.getD()[i] : par2.getD()[i];
				child2.getD()[i] = i>=zahl ? par1.getD()[i] : par2.getD()[i];
			}
			else {
				child1.getH()[i-5] = i<zahl ? par1.getH()[i-5] : par2.getH()[i-5];
				child2.getH()[i-5] = i>=zahl ? par1.getH()[i-5] : par2.getH()[i-5];
			}
		}

		retVal.add(child1);
		retVal.add(child2);
		
		return retVal;
	}
}
