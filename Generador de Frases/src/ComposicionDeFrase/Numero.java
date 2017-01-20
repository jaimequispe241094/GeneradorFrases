package ComposicionDeFrase;
import java.util.Random;

public class Numero {

	private boolean numero;
	private Random ale = new Random();

	public enum miNumero
	{
		Singular , Plural		// tipos de numero
	}		

	miNumero determinarNumero()
	{
		this.numero=numeroAleatorio();
		if ( this.numero)					
			return miNumero.Singular;			//TRUE = singular  , FALSE = plural.	
		return miNumero.Plural;
	}
	
	private boolean numeroAleatorio()
	{
		return ale.nextBoolean();
	}

}
