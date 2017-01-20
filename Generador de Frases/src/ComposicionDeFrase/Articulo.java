package ComposicionDeFrase;
import ComposicionDeFrase.Genero.miGenero;
import ComposicionDeFrase.Numero.miNumero;

public class Articulo {
	
	private Lista articulosSingulares;
	private Lista articulosPlurales;
	
	public Articulo ()
	{
		this.articulosSingulares = new Lista();
		this.articulosPlurales = new Lista();
		this.cargarListas();
	}
	
	private void cargarListas()
	{		
		this.articulosSingulares.cargarPalabraFemenina("La");
		this.articulosSingulares.cargarPalabraFemenina("Una");
		this.articulosSingulares.cargarPalabraFemenina("Esa");
		this.articulosSingulares.cargarPalabraFemenina("Esta");
		
		this.articulosSingulares.cargarPalabraMasculina("El");
		this.articulosSingulares.cargarPalabraMasculina("Un");
		this.articulosSingulares.cargarPalabraMasculina("Ese");
		this.articulosSingulares.cargarPalabraMasculina("Este");
		
		this.articulosPlurales.cargarPalabraFemenina("Las");
		this.articulosPlurales.cargarPalabraFemenina("Unas");
		this.articulosPlurales.cargarPalabraFemenina( "Esas");
		this.articulosPlurales.cargarPalabraFemenina( "Estas");
		
		this.articulosPlurales.cargarPalabraMasculina("Los");
		this.articulosPlurales.cargarPalabraMasculina("Unos");
		this.articulosPlurales.cargarPalabraMasculina( "Esos");
		this.articulosPlurales.cargarPalabraMasculina("Estos");
	}
	
	@SuppressWarnings("static-access")
	public String getArticulo(miGenero genero, miNumero numero)			// se brinda un articulo dependiendo del tipo de numero y genero
	{
		if (numero == numero.Singular)
		{		
			return articulosSingulares.getpalabraPorGenero(genero);		
		}
		
		else
		{		
			return articulosPlurales.getpalabraPorGenero(genero);
		}
	}
	
}
