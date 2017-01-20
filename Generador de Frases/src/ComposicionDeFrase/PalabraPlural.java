package ComposicionDeFrase;

public class PalabraPlural {

	
	private String limpiarLetraZ(String palabra)
	{		
		String nuevo="";
		
		for (int i = 0; i < palabra.length()-1; i++)				//recorre toda la palabra, excepto la ultima letra (que es una Z)
		{
			char letra = palabra.charAt(i);
			nuevo=nuevo+letra;
		}
		return nuevo;
	}
	
	
	private String convertirPalabraAPlural(String palabra)
	{
		char ultimaLetra=palabra.charAt(palabra.length()-1);
		
		if(ultimaLetra=='a' || ultimaLetra=='e'|| ultimaLetra=='i'||ultimaLetra== 'o'||ultimaLetra=='u')
		{		return palabra+"s";		}
		
		else if (ultimaLetra=='z')	
		{		return limpiarLetraZ(palabra)+"ces";		}
		
		else
		{ 		return palabra=palabra+"es";				}	
	}
	
	
	public String getPalabra(String palabraSingular)				// dada una palabra singular se retorna la misma pero con su numero en plural.
	{
		return convertirPalabraAPlural(palabraSingular);
	}

}
