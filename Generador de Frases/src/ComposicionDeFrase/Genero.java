package ComposicionDeFrase;
import java.util.Random;

public class Genero {

	private Random ale=new Random(); 
	private boolean genero;
	
	public enum miGenero
	{
		Masculino , Femenino									// tipos de genero
	}			
	
	public miGenero determinarGenero()
	{
		this.genero = generoAleatorio();
		if (this.genero)						//TRUE = masculino, FALSE = femenino
			return miGenero.Masculino;
		return miGenero.Femenino;
	}
	
	private boolean generoAleatorio()
	{
		return ale.nextBoolean();				
	}
	
}
