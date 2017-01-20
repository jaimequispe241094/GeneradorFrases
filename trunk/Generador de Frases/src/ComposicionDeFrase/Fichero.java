package ComposicionDeFrase;
import java.io.*;

	public class Fichero {
		
		private File archivo = null;
		private FileReader fileReader = null;
		private BufferedReader bufferedReader = null;
		private FileWriter fichero = null;
		private PrintWriter printWriter = null;
        
		public Fichero()
		{
			archivo = new File ("Historial.txt");	
			try 
			{
				fichero = new FileWriter("Historial.txt",true);
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		
		private void cerrarFileReader(FileReader fi)
		{
			try
			{                    							// cerramos el fichero, para asegurarnos que se
				 if( null != fi )  							// cierra tanto si todo va bien como si salta una excepcion. 
				 {		
					 fi.close();
				 }            		      
	        }
			catch (Exception e2)
			{ 
	            e2.printStackTrace();
	        }
		}
		
		private void cerrarFileWriter(FileWriter fw){
			try
			{                    
	            if( null != fw )							// cerramos el fichero, para asegurarnos que se 
	            {		
	            	fw.close();
	            }                                             // cierra tanto si todo va bien como si salta una excepcion. 
	        }
			catch (Exception e2)
			{ 
	            e2.printStackTrace();
	        }
		}
			
		public String leerFicheroCompleto()
		{													// se retorna un String concantenado todas las frases que contiene el fichero
			String fichero="";
			for (int i = 0; i < cantLineas(); i++) 
			{
				fichero= fichero + leerPorLinea(i)+"\n";
			}
			return fichero;
		}
	
		private String leerPorLinea (int numlinea)
		{							// se lee una determinda linea del fichero!
			String palabra=""; String fraseEnLineaX="";  int cont=1;
		     try
		     {
		    	 fileReader = new FileReader (archivo);
		    	 bufferedReader = new BufferedReader(fileReader);
		    	 while((palabra=bufferedReader.readLine())!=null)
		    	 {
		        	 if (numlinea==cont)					
		        		 fraseEnLineaX=palabra;
		        	 cont++;
		         }
		     }  
		     catch(Exception e)
		     {
		         e.printStackTrace();
		     }
		     finally
		     {
		        cerrarFileReader(fileReader);
		     }
		     return fraseEnLineaX;
		}
		
		public void escribirFichero(String frase,boolean acomodar)
		{				//se escribe el fichero , acomodando cada string //uno debajo del otro
	        try
	        {	fichero = new FileWriter("Historial.txt",acomodar);
	        	printWriter = new PrintWriter(fichero);
	            printWriter. println(frase);
	        } 
	        catch (Exception e) 
	        {
	            e.printStackTrace();
	        } 
	        finally 
	        {
	          cerrarFileWriter(fichero);
	        }
		}
	
		private int cantLineas()
		{												// esta funcion devulve la cantidad de lineas que tiene el fichero! (cantidad de frases )
			int contador=0;
			 try 
			 {	 
				 fileReader = new FileReader (archivo);
			 	 bufferedReader = new BufferedReader(fileReader);
		         while((bufferedReader.readLine())!=null)
		        	 contador++;
		     }
		     catch(Exception e)
			 {
		         e.printStackTrace();
		     }
			 finally
			 {
		       cerrarFileReader(fileReader);
		     }
			return contador;
		}
		
}