package ZooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal{
	private static ArrayList<Mamifero>	listado;
	public static  int caballos;
	public static int leones;
	private boolean pelaje;
	private  int patas;
	
	public Mamifero() {
	}
	
	public Mamifero(String nombre,int edad,String habitat,String genero,boolean pelaje,int patas){
		super(nombre,edad,habitat,genero);
		this.pelaje=pelaje;
		this.patas=patas;
		this.listado=new ArrayList<>();
	}

	public static ArrayList<Mamifero> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Mamifero> listado) {
		Mamifero.listado = listado;
	}

	public static int getCaballos() {
		return caballos;
	}

	public static void setCaballos(int caballos) {
		Mamifero.caballos = caballos;
	}

	public static int getLeones() {
		return leones;
	}

	public static void setLeones(int leones) {
		Mamifero.leones = leones;
	}

	public boolean isPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
	}
