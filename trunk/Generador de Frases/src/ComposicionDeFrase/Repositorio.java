package ComposicionDeFrase;
import ComposicionDeFrase.Genero.miGenero;
import ComposicionDeFrase.Numero.miNumero;

public class Repositorio {

	private Lista sustantivos;
	private Lista adjetivos;
	private Articulo articulo;
	private Fichero fichero;
	
	public Repositorio (String tema) 
	{
		this.articulo= new Articulo();
		this.sustantivos= new Lista();
		this.adjetivos= new Lista();
		this.fichero= new Fichero();
		this.cargarListas(tema);
	}
	
	private boolean esTemaAmor(String s)
	{												// se determina el tema con el trabajara el repositorio
		return s.equals("Amor");
	}
	
	private boolean esTemaAnimales(String s)
	{
		return s.equals("Animales");
	}
	
	private boolean esTemaDeportes(String s)
	{
		return s.equals("Deportes");
	}
	
	private boolean esTemaTecnologia(String s)
	{
		return s.equals("Tecnologia");
	}
	
	private boolean esTemaMusica(String s)
	{
		return s.equals("Musica");
	}
	
	private void cargarTemaAmor()
	{																	// se cargan las palabras de amor en las listas desustantivos 			
		this.sustantivos.cargarPalabraFemenina("enamorada");			// y adjetivos (dependiendo de su genero iran a determinada lista)
		this.sustantivos.cargarPalabraFemenina("amada");
		this.sustantivos.cargarPalabraFemenina("mirada");
		this.sustantivos.cargarPalabraFemenina("novia");
		this.sustantivos.cargarPalabraFemenina("amante");
		this.sustantivos.cargarPalabraFemenina("poeta");
		this.sustantivos.cargarPalabraFemenina("mujer");
		this.sustantivos.cargarPalabraFemenina("niña");
		this.sustantivos.cargarPalabraFemenina("caricia");
		this.sustantivos.cargarPalabraFemenina("pasión");
		
				
		this.sustantivos.cargarPalabraMasculina("corazon");
		this.sustantivos.cargarPalabraMasculina("amante");
		this.sustantivos.cargarPalabraMasculina("cariño");
		this.sustantivos.cargarPalabraMasculina("beso");
		this.sustantivos.cargarPalabraMasculina("enamorado");
		this.sustantivos.cargarPalabraMasculina("poeta");
		this.sustantivos.cargarPalabraMasculina("amado");
		this.sustantivos.cargarPalabraMasculina("suspiro");
		this.sustantivos.cargarPalabraMasculina("alma");
		this.sustantivos.cargarPalabraMasculina("novio");
		
		
		this.adjetivos.cargarPalabraMasculina("lindo");
		this.adjetivos.cargarPalabraMasculina("cariñoso");
		this.adjetivos.cargarPalabraMasculina("apasionado");
		this.adjetivos.cargarPalabraMasculina("profundo");
		this.adjetivos.cargarPalabraMasculina("deseado");
		this.adjetivos.cargarPalabraMasculina("tierno");
		this.adjetivos.cargarPalabraMasculina("intenso");
		this.adjetivos.cargarPalabraMasculina("inmenso");
		this.adjetivos.cargarPalabraMasculina("sincero");
		this.adjetivos.cargarPalabraMasculina("romantico");
		
		
		this.adjetivos.cargarPalabraFemenina("deseada");
		this.adjetivos.cargarPalabraFemenina("amable");
		this.adjetivos.cargarPalabraFemenina("sincera");
		this.adjetivos.cargarPalabraFemenina("apasionada");
		this.adjetivos.cargarPalabraFemenina("profunda");
		this.adjetivos.cargarPalabraFemenina("adorable");
		this.adjetivos.cargarPalabraFemenina("tierna");
		this.adjetivos.cargarPalabraFemenina("agradable");
		this.adjetivos.cargarPalabraFemenina("caprichosa");
		this.adjetivos.cargarPalabraFemenina("romantica");
	}
	
	private void cargarTemaAnimales()
	{
		this.sustantivos.cargarPalabraFemenina("tortuga");
		this.sustantivos.cargarPalabraFemenina("serpiente");
		this.sustantivos.cargarPalabraFemenina("jirafa");
		this.sustantivos.cargarPalabraFemenina("gallina");
		this.sustantivos.cargarPalabraFemenina("araña");
		this.sustantivos.cargarPalabraFemenina("paloma");
		this.sustantivos.cargarPalabraFemenina("ave");
		this.sustantivos.cargarPalabraFemenina("avestruz");
		this.sustantivos.cargarPalabraFemenina("ballena");
		this.sustantivos.cargarPalabraFemenina("foca");
		
		this.sustantivos.cargarPalabraMasculina("tigre");
		this.sustantivos.cargarPalabraMasculina("perro");
		this.sustantivos.cargarPalabraMasculina("gato");
		this.sustantivos.cargarPalabraMasculina("buho");
		this.sustantivos.cargarPalabraMasculina("caballo");
		this.sustantivos.cargarPalabraMasculina("calamar");
		this.sustantivos.cargarPalabraMasculina("canguro");
		this.sustantivos.cargarPalabraMasculina("mono");
		this.sustantivos.cargarPalabraMasculina("delfin");
		this.sustantivos.cargarPalabraMasculina("flamenco");
		this.sustantivos.cargarPalabraMasculina("elefante");
		this.sustantivos.cargarPalabraMasculina("guepardo");
		this.sustantivos.cargarPalabraMasculina("gorilla");
		this.sustantivos.cargarPalabraMasculina("puma");
		this.sustantivos.cargarPalabraMasculina("zorro");
		
		this.adjetivos.cargarPalabraMasculina("fuerte");
		this.adjetivos.cargarPalabraMasculina("agil");
		this.adjetivos.cargarPalabraMasculina("rapido");
		this.adjetivos.cargarPalabraMasculina("obediente");
		this.adjetivos.cargarPalabraMasculina("alargado");
		this.adjetivos.cargarPalabraMasculina("soso");
		this.adjetivos.cargarPalabraMasculina("peludo");
		this.adjetivos.cargarPalabraMasculina("sagaz");
		this.adjetivos.cargarPalabraMasculina("astuto");
		this.adjetivos.cargarPalabraMasculina("apestozo");
		
		
		this.adjetivos.cargarPalabraFemenina("lenta");
		this.adjetivos.cargarPalabraFemenina("sosa");
		this.adjetivos.cargarPalabraFemenina("rapida");
		this.adjetivos.cargarPalabraFemenina("alargada");
		this.adjetivos.cargarPalabraFemenina("olorosa");
		this.adjetivos.cargarPalabraFemenina("apestosa");
		this.adjetivos.cargarPalabraFemenina("ruidosa");
		this.adjetivos.cargarPalabraFemenina("desobediente");
		this.adjetivos.cargarPalabraFemenina("rebelde");
		this.adjetivos.cargarPalabraFemenina("delgada");
	}
	
	private void cargarTemaDeportes()
	{
		this.sustantivos.cargarPalabraFemenina("pelota");
		this.sustantivos.cargarPalabraFemenina("hinchada");
		this.sustantivos.cargarPalabraFemenina("camiseta");
		this.sustantivos.cargarPalabraFemenina("cancha");
		this.sustantivos.cargarPalabraFemenina("raqueta");
		this.sustantivos.cargarPalabraFemenina("boxeadora");
		this.sustantivos.cargarPalabraFemenina("carrera");
		this.sustantivos.cargarPalabraFemenina("jugada");
		this.sustantivos.cargarPalabraFemenina("bocha");
		this.sustantivos.cargarPalabraFemenina("barra");
		
		
		this.sustantivos.cargarPalabraMasculina("jugador");
		this.sustantivos.cargarPalabraMasculina("hincha");
		this.sustantivos.cargarPalabraMasculina("campeonato");
		this.sustantivos.cargarPalabraMasculina("boxeador");
		this.sustantivos.cargarPalabraMasculina("futbolista");
		this.sustantivos.cargarPalabraMasculina("atleta");
		this.sustantivos.cargarPalabraMasculina("entrenador");
		this.sustantivos.cargarPalabraMasculina("tecnico");
		this.sustantivos.cargarPalabraMasculina("futbolista");
		this.sustantivos.cargarPalabraMasculina("arco");
		this.sustantivos.cargarPalabraMasculina("referi");
		this.sustantivos.cargarPalabraMasculina("futbolista");
	
		this.sustantivos.cargarPalabraMasculina("Rugby");
		this.sustantivos.cargarPalabraMasculina("Tenista");
		this.sustantivos.cargarPalabraMasculina("Futbol");;
		this.sustantivos.cargarPalabraMasculina("Automovilismo");
		this.sustantivos.cargarPalabraMasculina("Baloncesto");
		this.sustantivos.cargarPalabraMasculina("Boxeo");
		this.sustantivos.cargarPalabraMasculina("Beisbol");
		this.sustantivos.cargarPalabraMasculina("Esgrima");
		this.sustantivos.cargarPalabraMasculina("Polo");

		
		this.adjetivos.cargarPalabraMasculina("estrategico");
		this.adjetivos.cargarPalabraMasculina("agil");
		this.adjetivos.cargarPalabraMasculina("apasionado");
		this.adjetivos.cargarPalabraMasculina("intenso");
		this.adjetivos.cargarPalabraMasculina("rudo");
		this.adjetivos.cargarPalabraMasculina("acertado");
		this.adjetivos.cargarPalabraMasculina("entretenido");
		this.adjetivos.cargarPalabraMasculina("riduculo");
		this.adjetivos.cargarPalabraMasculina("rapido");
		this.adjetivos.cargarPalabraMasculina("peligroso");
		
		this.adjetivos.cargarPalabraFemenina("ruda");
		this.adjetivos.cargarPalabraFemenina("pesada");
		this.adjetivos.cargarPalabraFemenina("agil");
		this.adjetivos.cargarPalabraFemenina("intensa");
		this.adjetivos.cargarPalabraFemenina("estrategica");
		this.adjetivos.cargarPalabraFemenina("atrapante");
		this.adjetivos.cargarPalabraFemenina("ruidosa");
		this.adjetivos.cargarPalabraFemenina("molesta");
		this.adjetivos.cargarPalabraFemenina("inquieta");
		this.adjetivos.cargarPalabraFemenina("ridicula");
		
	}
	
	private void cargarTemaTecnologia()
	{
		this.sustantivos.cargarPalabraFemenina("multifunción");
		this.sustantivos.cargarPalabraFemenina("memoria");
		this.sustantivos.cargarPalabraFemenina("camara");
		this.sustantivos.cargarPalabraFemenina("consola");
		this.sustantivos.cargarPalabraFemenina("computadora");
		this.sustantivos.cargarPalabraFemenina("impresora");
		this.sustantivos.cargarPalabraFemenina("televisión");
		this.sustantivos.cargarPalabraFemenina("scaner");
		this.sustantivos.cargarPalabraFemenina("fotocopiadora");
		this.sustantivos.cargarPalabraFemenina("pantalla");
		
		
		this.sustantivos.cargarPalabraMasculina("monitor");
		this.sustantivos.cargarPalabraMasculina("teclado");
		this.sustantivos.cargarPalabraMasculina("mouse");
		this.sustantivos.cargarPalabraMasculina("parlante");
		this.sustantivos.cargarPalabraMasculina("dvd");
		this.sustantivos.cargarPalabraMasculina("celular");
		this.sustantivos.cargarPalabraMasculina("juego");
		this.sustantivos.cargarPalabraMasculina("home theatre");
		this.sustantivos.cargarPalabraMasculina("reproductor");
		this.sustantivos.cargarPalabraMasculina("router");
		this.sustantivos.cargarPalabraMasculina("amplificador");
		this.sustantivos.cargarPalabraMasculina("iphone");
		
		this.adjetivos.cargarPalabraFemenina("pequeña");
		this.adjetivos.cargarPalabraFemenina("util");
		this.adjetivos.cargarPalabraFemenina("antigûa");
		this.adjetivos.cargarPalabraFemenina("cara");
		this.adjetivos.cargarPalabraFemenina("simple");
		this.adjetivos.cargarPalabraFemenina("valiosa");
		this.adjetivos.cargarPalabraFemenina("importante");
		this.adjetivos.cargarPalabraFemenina("avanzada");
		this.adjetivos.cargarPalabraFemenina("veloz");
		this.adjetivos.cargarPalabraFemenina("nueva");
		this.adjetivos.cargarPalabraFemenina("grande");
		
		this.adjetivos.cargarPalabraMasculina("pequeño");
		this.adjetivos.cargarPalabraMasculina("util");
		this.adjetivos.cargarPalabraMasculina("antigûo");
		this.adjetivos.cargarPalabraMasculina("caro");
		this.adjetivos.cargarPalabraMasculina("simple");
		this.adjetivos.cargarPalabraMasculina("valioso");
		this.adjetivos.cargarPalabraMasculina("importante");
		this.adjetivos.cargarPalabraMasculina("avanzado");
		this.adjetivos.cargarPalabraMasculina("veloz");
		this.adjetivos.cargarPalabraMasculina("nuevo");
		this.adjetivos.cargarPalabraMasculina("grande");
		
	}
	
	private void cargarTemaMusica()
	{
		this.sustantivos.cargarPalabraFemenina("armonica");
		this.sustantivos.cargarPalabraFemenina("arpa");
		this.sustantivos.cargarPalabraFemenina("canción");
		this.sustantivos.cargarPalabraFemenina("bateria");
		this.sustantivos.cargarPalabraFemenina("melodia");
		this.sustantivos.cargarPalabraFemenina("trompeta");
		this.sustantivos.cargarPalabraFemenina("viola");
		this.sustantivos.cargarPalabraFemenina("banda");
		this.sustantivos.cargarPalabraFemenina("nota");
		this.sustantivos.cargarPalabraFemenina("cantante");
		
		this.sustantivos.cargarPalabraMasculina("instrumento");
		this.sustantivos.cargarPalabraMasculina("sonido");
		this.sustantivos.cargarPalabraMasculina("bajo");
		this.sustantivos.cargarPalabraMasculina("organo");
		this.sustantivos.cargarPalabraMasculina("saxofón");
		this.sustantivos.cargarPalabraMasculina("tambor");
		this.sustantivos.cargarPalabraMasculina("teclado");
		this.sustantivos.cargarPalabraMasculina("piano");
		this.sustantivos.cargarPalabraMasculina("platillo");
		this.sustantivos.cargarPalabraMasculina("ritmo");
		this.sustantivos.cargarPalabraMasculina("violinista");
		this.sustantivos.cargarPalabraMasculina("guitarrista");
		this.sustantivos.cargarPalabraMasculina("timbal");
		
		this.adjetivos.cargarPalabraFemenina("fuerte");
		this.adjetivos.cargarPalabraFemenina("suave");
		this.adjetivos.cargarPalabraFemenina("relajante");
		this.adjetivos.cargarPalabraFemenina("debil");
		this.adjetivos.cargarPalabraFemenina("dulce");
		this.adjetivos.cargarPalabraFemenina("simple");
		this.adjetivos.cargarPalabraFemenina("acertada");
		this.adjetivos.cargarPalabraFemenina("armoniosa");
		this.adjetivos.cargarPalabraFemenina("insoportable");
		this.adjetivos.cargarPalabraFemenina("ridicula");

		this.adjetivos.cargarPalabraMasculina("potente");
		this.adjetivos.cargarPalabraMasculina("armonioso");
		this.adjetivos.cargarPalabraMasculina("energico");
		this.adjetivos.cargarPalabraMasculina("alocado");
		this.adjetivos.cargarPalabraMasculina("violento");
		this.adjetivos.cargarPalabraMasculina("ruidoso");
		this.adjetivos.cargarPalabraMasculina("agresivo");
		this.adjetivos.cargarPalabraMasculina("molesto");
		this.adjetivos.cargarPalabraMasculina("alegre");
		this.adjetivos.cargarPalabraMasculina("festivo");
		this.adjetivos.cargarPalabraMasculina("triste");
			
	}
	
	private void cargarListas(String tema)
	{													// se cargan en el repositorio las palabras del tema pasado como parametro
		if (esTemaAmor(tema))
		{		this.cargarTemaAmor();		}
		
		else if (esTemaAnimales(tema))
		{		this.cargarTemaAnimales();		}
		
		else if(esTemaMusica(tema))
		{		this.cargarTemaMusica();		}
		
		else if (esTemaTecnologia(tema))
		{		this.cargarTemaTecnologia();		}
		
		else if(esTemaDeportes(tema))
		{		this.cargarTemaDeportes();		}	
	
	}

	public String getArticulo(miGenero genero, miNumero numero)
	{
		return this.articulo.getArticulo(genero, numero);
	}
	
	public String getSustantivo(miGenero genero, miNumero numero)
	{
		return this.sustantivos.getPalabra(genero, numero);
	}
	
	public String getAdjetivo(miGenero genero, miNumero numero)
	{
		return this.adjetivos.getPalabra(genero, numero);
	}
		
	@SuppressWarnings({ "static-access" })
	public String getVerbo(miNumero numero)
	{ 														 //se brinda un verbo dependiendo de su numero (singular o plural)
		if (numero == numero.Singular)
			return "es";
		return "son";
	} 
	
	public void almacenarFrase(String frase)
	{
		this.fichero.escribirFichero(frase,true);
	}
	
	public String leerFrasesGuardadas()
	{
		return fichero.leerFicheroCompleto();
	}
	
}	
