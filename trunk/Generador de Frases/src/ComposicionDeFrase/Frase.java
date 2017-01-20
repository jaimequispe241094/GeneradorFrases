package ComposicionDeFrase;
import ComposicionDeFrase.Genero.miGenero;
import ComposicionDeFrase.Numero.miNumero;

public class  Frase {

	private Repositorio repositorio;
	private Numero numero;
	private Genero genero;
	
	public Frase(String tema)  
	{
		this.repositorio= new Repositorio(tema);
		this.numero = new Numero ();
		this.genero = new Genero();
	}
	
	private String armarFrase()
	{			
		miGenero g = genero.determinarGenero();			// se crea la variable g del tipo miGenero para determinar el mismo genero en toda la frase
		miNumero n =  numero.determinarNumero();		// se crea la variable n del tipo miNumero para determinar el mismo numero en toda la frase
		return this.repositorio.getArticulo(g,n)+" "+this.repositorio.getSustantivo(g,n)+" "+this.repositorio.getVerbo(n)+" "+this.repositorio.getAdjetivo(g,n);
	}
	
	public String getFrase() 
	{					
		return armarFrase()+"\n";					// la funcion devuelve un String con frase aleatoria 
	}
	
	public void guardarFrase(String frase)
	{
		this.repositorio.almacenarFrase(frase);
	}
	
	public String historialDeFrases()
	{												// String con todas las frases almacendas , una debajo de la otra!
		return this.repositorio.leerFrasesGuardadas();
	}
}

