
import java.util.*;
import java.io.*;

public class Main{
	
	public static void main(String args[]) throws IOException {

		//System.out.println("\n *********************habitante******************");

		String nombre = "pepe";
		String apellido = "hernandez";
		String direccion = "calle general";
		int edad = 21;
		int dni = 192424;
	
		String resultadonombre, resultadoapellido,   resultadodireccion;
		int resultadodni; int resultadoedad; 

		Habitante habitante = new Habitante("","","",0,0);

		
		habitante.setNombre(nombre);
		habitante.setApellido(apellido);
		habitante.setDireccion(direccion);
		habitante.setEdad(edad);
		habitante.setDni(dni);
		

		resultadonombre = habitante.getNombre();
		resultadoapellido = habitante.getApellido();
		resultadodireccion = habitante.getDireccion();
		resultadoedad = habitante.getEdad();
		resultadodni = habitante.getDni();
		
		
		

		/*System.out.println("\n el nombre es :" + resultadonombre);
		System.out.println("\n el apellido es :" + resultadoapellido);
		System.out.println("\n la direccion es :" + resultadodireccion);
		System.out.println("\n la edad es  :" + resultadoedad);
		System.out.println("\n el dni  es :" + resultadodni);
		*/
		


		//System.out.println("\n *********************Inmueble******************");
		

		String departamento = "2derecha";
		String garaje = "bajo_plaza4";
		String resultadodepartamento, resultadogaraje;
		
		Inmueble inmueble = new Inmueble();

		inmueble.setDepartamento(departamento);
		inmueble.setGaraje(garaje);

		resultadodepartamento = inmueble.getDepartamento();
		resultadogaraje = inmueble.getGaraje();


		//System.out.println("\n el departamento es :" + resultadodepartamento);
		//System.out.println("\n el garaje es :" + resultadogaraje);



		//System.out.println("\n ****************Espaciopublico******************");


		String nombreespacio = "plaza_santa_fe";
		String direccionespacio = "paseo_nuevo";
		String resultadonombreespacio, resultadodireccionespacio;

		EspacioPublico espaciopublico = new EspacioPublico();

		espaciopublico.setNombreespacio(nombreespacio);
		espaciopublico.setDireccionespacio(direccionespacio);

		
		resultadonombreespacio = espaciopublico.getNombreespacio();
		resultadodireccionespacio = espaciopublico.getDireccionespacio();


		//System.out.println("\n el espacio publico es " +resultadonombreespacio);
		//System.out.println("\n la direccion es :" + resultadodireccionespacio);

		//System.out.println("\n ****************Ayuntamiento******************");

		
		String nombreayuntamiento = "donostia";
		String cargo = "alcalde";
		String direccionayuntamiento = "bolevard";
		String resultadodireccionayuntamiento, resultadonombreayuntamiento, resultadocargo;

		Ayuntamiento ayuntamiento = new Ayuntamiento();


		ayuntamiento.setNombreayuntamiento(nombreayuntamiento);
		ayuntamiento.setCargo(cargo);
		ayuntamiento.setDireccionayuntamiento(direccionayuntamiento);

		resultadodireccionayuntamiento = ayuntamiento.getDireccionayuntamiento();
		resultadonombreayuntamiento = ayuntamiento.getNombreayuntamiento();
		resultadocargo = ayuntamiento.getCargo();

		//System.out.println("\n nombre de Ayuntamiento :" + resultadonombreayuntamiento);
		//System.out.println("\n direccion del Ayuntamiento:" + resultadodireccionayuntamiento );
		//System.out.println("\n tipo de cargo : " + resultadocargo );

		//System.out.println("\n ");

		String nombrepartido="pp";
		String presidente="pepe" ;
		int numero=1;
		int partidoedad=67;


		String resultanombrepartido, resultadopresidente;
		int resultadonumero, resultadopartidoedad;


		Partido partido = new Partido("","",0,0);

		partido.setNombre(nombrepartido);
		partido.setPresidente(presidente);
		partido.setNumero(numero);
		partido.setEdad(partidoedad);

		resultanombrepartido=partido.getNombre();
		resultadopresidente=partido.getPresidente();
		resultadonumero=partido.getNumero();
		resultadopartidoedad=partido.getEdad();

		//System.out.println("\n nombre de  partido:" + resultanombrepartido);
		//System.out.println("\n nombde del presidente:" + resultaadopresidente );
		//System.out.println("\n numero de partido : " + resultadonumero );
		//System.out.println("\n edad de presidente: " + resultadopartidoedad);

		FileReader fr = new FileReader("ListaPartido.txt");
    BufferedReader br = new BufferedReader(fr); 

	String contenido;
	
	ArrayList <Partido> parti = new ArrayList <Partido> ();
	String part1="",  part2="";
	int part3=0; int part4=0;
	
	while((contenido = br.readLine()) != null)
	{
		StringTokenizer st = new StringTokenizer(contenido);
		for(int a=0;a<4;a++)
		{
			String part = st.nextToken(",");
			
			if(a==0)
			{
				part1=part;
			}
			else if(a==1)
			{
				part2=part;
			}
			else if (a==3)
			{
				part3=Integer.parseInt(part);
			}
			else 
			{
				part4=Integer.parseInt(part);
			}
		}
	    parti.add(new Partido(part1,part2,part3,part4));
		}
		
		for(int i=0; i<parti.size(); i++)
        {
       System.out.println("nombre del partido: "+parti.get(i).getNombre() +" presidente: "+parti.get(i).getPresidente()+" numero: "+ parti.get(i).getNumero()+ " edad: "+parti.get(i).getEdad());      
    }
            System.out.println("\n ");
 
     		parti.clear();

		
		ArrayList <Habitante> habi = new ArrayList <Habitante> ();
		FileReader fr2 = new FileReader("Censo.txt");
    	BufferedReader br2 = new BufferedReader(fr2); 
	
		 
		String habit1="", habit2="", habit3="";
		int habit4=0; int habit5=0;
		
		while((contenido = br2.readLine()) != null)
		{
		StringTokenizer st2 = new StringTokenizer(contenido);
			for(int b=0;b<5;b++)
			{
			String habit = st2.nextToken(",");
				if(b==0)
				{
					habit1=habit;
				}
				else if(b==1)
				{
					habit2=habit;
				}
				else if(b==2)
				{
					habit3=habit;
				}
				else if(b==3)
				{
					habit4=Integer.parseInt(habit);
				}
				else
				{
					habit5=Integer.parseInt(habit);
				}
			}
			if (habit4>=18)
			{		
			habi.add(new Habitante(habit1,habit2,habit3,habit4,habit5));
			}
		}
		for(int i=0; i<habi.size(); i++)

			{
	            System.out.println("nombre: "+habi.get(i).getNombre() +" primer apellido: "+habi.get(i).getApellido()+" direccion: "+ habi.get(i).getDireccion()
	            +" edad: "+habi.get(i).getEdad()+" dni: "+habi.get(i).getDni());
	     }


				/*try
		            {
			

			FileReader fr = new FileReader("ListaPartido.txt");
    	BufferedReader br = new BufferedReader(fr); 


			ArrayList <String> partidos = new ArrayList <String> ();

			String linea = br.readLine();
			while(linea != null)
			{
				
				partidos.add(linea);
				linea = br.readLine();
			}

			for(int i=0; i<partidos.size(); i++)
			{
				System.out.println(partidos.get(i));
			}

			// Vaciar el ArrayList
			partidos.clear();
			// Comprobamos que se haya vaciado
			System.out.println("\nVaciado correctamente. (" + partidos.size() + ")");
			
		}catch(IOException e)
		{
			System.out.println("Error E/S: "+e);
		}*/

	}
}
		
	
		





	