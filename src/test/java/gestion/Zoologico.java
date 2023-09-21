package gestion;
import ZooAnimales.*;
import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona>Zonas;
	public Zoologico() {
		
	}
	
	public Zoologico(String nombre,String ubicacion) {
		this.Zonas=new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public ArrayList<Zona> getZonas() {
		return Zonas;
	}

	public void setZonas(ArrayList<Zona> zonas) {
		Zonas = zonas;
	}
	public void agregarZonas(Zona zona) {
		this.Zonas.add(zona);
	}
	public int cantidadTotalAnimales() {
		 return Animal.getTotalAnimales();
	}
}
	
