package evolution;

public class IndividumEvo {
	
	private int id;
	private double flaeche;

	private double[] d = new double[5];
	private double[] h = new double[5];
	
	private float f;
	private float g;
	
	
	
	public double[] getD() {
		return d;
	}
	public void setD(double[] d) {
		this.d = d;
	}
	public double[] getH() {
		return h;
	}
	public void setH(double[] h) {
		this.h = h;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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

	public double getFlaeche() {
		return flaeche;
	}
	public void setFlaeche(double flaeche) {
		this.flaeche = flaeche;
	}
	
	
}
