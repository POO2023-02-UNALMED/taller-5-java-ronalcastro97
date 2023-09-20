package ZooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal{
	private static ArrayList<Reptil>listado;
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	public Reptil() {
		super();

	}
	public Reptil(String nombre, int edad, String habitat, String genero,String colorEscamas,int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas=colorEscamas;
		this.largoCola=largoCola;
		this.listado= new ArrayList<>();
	}
	public static ArrayList<Reptil> getListado() {
		return listado;
	}
	public static void setListado(ArrayList<Reptil> listado) {
		Reptil.listado = listado;
	}
	public static int getIguanas() {
		return iguanas;
	}
	public static void setIguanas(int iguanas) {
		Reptil.iguanas = iguanas;
	}
	public static int getSerpientes() {
		return serpientes;
	}
	public static void setSerpientes(int serpientes) {
		Reptil.serpientes = serpientes;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getLargoCola() {
		return largoCola;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	public String movimiento(){
		return "reptar";
	
	}	
}
