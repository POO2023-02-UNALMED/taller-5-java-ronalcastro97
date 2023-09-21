package zooAnimales;
import java.util.ArrayList;
import gestion.*;

public class Animal {
	public static int totalAnimales=0;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private List<Zona> zona = new ArrayList<Zona>(1);
	
	public Animal(){
			Animal.totalAnimales++;
		}
	public Animal(String nombre, int edad, String habitat,String genero) {
		Animal.totalAnimales++;
		this.nombre=nombre;
		this.edad=edad;
		this.habitat=habitat;
		this.genero=genero;

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
	public Zona getZona() {
		return zona;
	} 
	public void setZona(Zona zona) {
		this.zona = zona; 
	}
	public static int totalAnimales() {
		return Animal.totalAnimales;
	}
	public  static String  totalPorTipo() {
		 return ("Mamiferos: " + Mamifero.cantidadMamiferos()+"\nAves: "+ Ave.cantidadAves() + "\nReptiles: " + Reptil.cantidadReptiles() + "\nPeces: " + Pez.cantidadPeces() + "\nAnfibios: " + Anfibio.cantidadAnfibios());
		 	}
	@Override
	public String toString() { 
        if(this.zona == null)
            return "Mi nombre es " + this.getNombre() + ", tengo una edad de " + this.getEdad() + ", habito en " + this.getHabitat() + " y mi genero es " + this.getGenero() ;
            
        return "Mi nombre es " + this.getNombre() + ", tengo una edad de " + this.getEdad() + ", habito en " + this.getHabitat() + " y mi genero es " + this.getGenero() + ", la zona en la que me ubico es" + this.getZona() + ", en el zoo" + this.zona.getZoo();
    }

	public String  movimiento() {
		return "desplazarse";
	}
	
}
