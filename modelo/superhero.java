package modelo;

public class superhero {
   private String hellboy;
   private int Salud ;

public superhero(String hellboy , int Salud) {
	this.hellboy = hellboy;
	this.Salud = Salud;
}
public superhero () {}
public String getHellboy() {
	return hellboy;
}
public void setHellboy(String hellboy) {
	this.hellboy = hellboy;
}
public int getSalud() {
	return Salud;
}
public void setSalud(int salud) {
	Salud = salud;
}
}
