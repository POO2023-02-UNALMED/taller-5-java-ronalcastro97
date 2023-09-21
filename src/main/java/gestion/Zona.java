
import java.util.ArrayList;

import zooAnimales.*;
public class Zona {
	private String nombre;
	private Zoologico Zoo;
	private ArrayList<Animal>animales;
	public Zona() {
		
	}
	public Zona(String nombre, Zoologico Zoo) {
		this.nombre=nombre;
		this.Zoo=Zoo;
		this.animales=new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Zoologico getZoo() {
		return Zoo;
	}

	public void setZoo(Zoologico zoo) {
		this.Zoo = zoo;
	}

	public ArrayList<Animal> getAnimales() {
		return animales;
	}

	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}
	public void agregarAnimales(Animal animal) {
		this.animales.add(animal);
	}
	public int cantidadAnimales() {
		return this.animales.size();
	}
	
}
