package VentanaVisual;

import javazoom.jl.player.* ;
public class Sonido extends Thread {

	 private jlp mReproductor = null ; 
	    
	    public Sonido( String pFileName ) 
	    {
	        try {
	        	String [] args = new String[1];					//se crea el jlp con el archivo pasado como parametro
	        	args[0] = pFileName ; 
	        	mReproductor = jlp.createInstance( args );   
	        } 
	        catch (Exception e) 
	        {
	            e.printStackTrace();
	        }        
	    }
	    
	    public void run() 
	    {	    
	        try 
	        {
	        	while(true) {
	                mReproductor.play();	//reproducir sonido
	                Thread.sleep(1000); // esperar un segundo y volver a reproducir 
	            }
	        }
	        catch (Exception e) 
	        {
	            e.printStackTrace();
	        }
	    }
	    
	}
