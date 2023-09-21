package zooAnimales;

import gestion.Zona;

public class Animal {
	private static int totalAnimales=0;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private static Zona zona;
	
	public Animal(){
		
		}
	public Animal(String nombre, int edad, String habitat,String genero) {
		this.nombre=nombre;
		this.edad=edad;
		this.habitat=habitat;
		this.genero=genero;
		this.zona=zona;
		Animal.totalAnimales++;
		}
	public static int getTotalAnimales() {
		return totalAnimales;
	}
	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public static Zona getZona() {
		return zona;
	} 
	public  static void setZona(Zona zona) {
		Animal.zona = zona; 
	}
	public  static String  totalPorTipo() {
		return ("Mamiferos:" + Mamifero.getListado().size() + "\n" +
				"Aves:" + Ave.getListado().size() + "\n" +
				 "Reptiles:" + Reptil.getListado().size() + 
				 "Peces:" + Pez.getListado().size() + 
				 "Anfibios:" + Anfibio.getListado().size());

		 	}
	@Override
	public String toString() { 
		return "mi nombre es" + this.nombre + ", tengo una edad de " + this.edad + ", habito en" + this.habitat +
				"y mi genero es" + this.genero;
	}

	public String  movimiento() {
		return "desplazarse";
	}
	
}
