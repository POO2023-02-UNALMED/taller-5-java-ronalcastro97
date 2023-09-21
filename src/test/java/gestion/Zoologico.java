package gestion;
import java.util.ArrayList;

import zooAnimales.*;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona>Zona;
	public Zoologico() {
		
	}
	
	public Zoologico(String nombre,String ubicacion) {
		this.Zona=new ArrayList<>();
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
		return Zona;
	}

	public void setZonas(ArrayList<Zona> zonas) {
		Zona = zonas;
	}
	public void agregarZonas(Zona zona) {
		this.Zona.add(zona);
	}
	public int cantidadTotalAnimales() {
		 return Animal.getTotalAnimales();
	}
}
	
