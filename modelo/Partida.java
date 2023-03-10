package modelo;

public class Partida {
	private int Val_resultado;
	private superhero Atacante;
	private superhero Victima;
	private Arma arma;
	public int getVal_resultado() {
		return Val_resultado;
	}
	public void setVal_resultado(int val_resultado) {
		Val_resultado = val_resultado;
	}
	public superhero getAtacante() {
		return Atacante;
	}
	public void setAtacante(superhero atacante) {
		Atacante = atacante;
	}
	public superhero getVictima() {
		return Victima;
	}
	public void setVictima(superhero victima) {
		Victima = victima;
	}
	public Arma getArma() {
		return arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	} 
	

}
