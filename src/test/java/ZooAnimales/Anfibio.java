package ZooAnimales;
import gestion.Zona;
import java.util.ArrayList;

public class Anfibio extends Animal{
	private ArrayList<Anfibio>	listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;

	
	public Anfibio(String nombre,int edad,String habitat,String genero,String colorPiel,boolean venenoso) {
		super(nombre,edad,habitat,genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		this.listado=new ArrayList<>();
	
	}
	public Anfibio() {}
	public  ArrayList<Anfibio> getListado() {
		return listado;
	}
	public void setListado(ArrayList<Anfibio> listado) {
		this.listado = listado;
	}
	public static int getRanas() {
		return ranas;
	}
	public static void setRanas(int ranas) {
		Anfibio.ranas = ranas;
	}
	public static int getSalamandras() {
		return salamandras;
	}
	public static void setSalamandras(int salamandras) {
		Anfibio.salamandras = salamandras;
	}
	public String getColorPiel() {
		return colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	
	
}
