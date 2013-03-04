package first;

public class Individum {
	
	private int id;
	private double flaeche;

	private int[] d = new int[5];
	private int[] h = new int[5];
	
	private float f;
	private float g;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int[] getD() {
		return d;
	}
	public void setD(int[] d) {
		this.d = d;
	}
	public int[] getH() {
		return h;
	}
	public void setH(int[] h) {
		this.h = h;
	}
	public float getF() {
		return f;
	}
	public void setF(float f) {
		this.f = f;
	}
	public float getG() {
		return g;
	}
	public void setG(float g) {
		this.g = g;
	}
	
	public int getReelH() {
		return getReelZahl(h);
	}
	
	public int getReelD() {
		return getReelZahl(d);
	}
	
	public String getBinHToString() {
		StringBuilder sb = new StringBuilder();
		for(int i : h) {
			sb.append(i);
		}
		return sb.toString();
	}

	public String getBinDToString() {
		StringBuilder sb = new StringBuilder();
		for(int i : d) {
			sb.append(i);
		}
		return sb.toString();
	}
	
	public String getDHToString() {
		return getBinDToString()+"'"+getBinHToString();
	}
	
	private int getReelZahl(int[] zahl) {
		
		int retVal = 0;
		for(int i = 0; i < zahl.length; i++) {
			retVal = retVal + (zahl[i]*(int)(Math.pow(2,(4-i))));
		}
		
		return retVal;
	}
	public double getFlaeche() {
		return flaeche;
	}
	public void setFlaeche(double flaeche) {
		this.flaeche = flaeche;
	}
	
	
}
