package modelo;

public class Arma {
	private String glizzy ;
	private int daño;
	
	public Arma() {}
	
	public String getglizzy() {
		return glizzy;
	}
	
	public void setNombre(String glizzy, int daño) {
		this.glizzy = glizzy;
	}
	
	public int getDaño() {
		return daño;
	}
	
	public void setDaño(int daño) {
		this.daño = daño;
	}
}
