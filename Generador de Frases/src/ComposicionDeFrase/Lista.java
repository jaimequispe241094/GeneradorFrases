package ComposicionDeFrase;
import java.util.ArrayList;
import java.util.Random;
import ComposicionDeFrase.Genero.miGenero;
import ComposicionDeFrase.Numero.miNumero;

public class Lista {
	
	private ArrayList <String> listaFemenina;
	private ArrayList <String> listaMasculino;
	private PalabraPlural palabraPlural;
	private Random ale;
	
	public Lista()
	{
		this.listaFemenina = new ArrayList<String>();
		this.listaMasculino = new ArrayList<String>();
		this.palabraPlural = new PalabraPlural();
		this.ale = new Random();
	}
	
	public void cargarPalabraMasculina(String palabra)
	{
		listaMasculino.add(palabra);
	}
	
	public void cargarPalabraFemenina(String palabra)
	{
		listaFemenina.add(palabra);
	}
	
	private String getPalabraDeUnaLista(ArrayList<String> lista ,int indice)
	{
		return lista.get(indice);
	}
	
	private int tamañoDeLista(ArrayList<String> lista)
	{
		return lista.size();
	}	

	private int indiceAleatorio(int numero)
	{
		return this.ale.nextInt (numero);
	}
	
	@SuppressWarnings("static-access")
	public String getpalabraPorGenero(miGenero genero)
	{		
		if (genero == genero.Masculino )
		{		
			return getPalabraDeUnaLista( this.listaMasculino, indiceAleatorio( tamañoDeLista (this.listaMasculino) ) );		
		}
		else
		{		
			return getPalabraDeUnaLista( this.listaFemenina, indiceAleatorio( tamañoDeLista (this.listaFemenina) ) );		
		}		
	}
	
	@SuppressWarnings("static-access")
	public String getPalabra(miGenero genero,miNumero numero)
	{															// la funcion devuelve una palabra determinada por un genero y numero					
		if (numero == numero.Singular)
		{		
			return getpalabraPorGenero(genero);											
		}		
		else
		{
			return this.palabraPlural.getPalabra( getpalabraPorGenero(genero) );		
		}		
	}
	
}
