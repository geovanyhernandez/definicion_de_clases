
import java.util.*;
import java.io.*;

public class Main{
	
	public static void main(String args[]){

		System.out.println("\n *********************habitante******************");

		String nombre = "pepe";
		String apellido = "hernandez";
		int edad = 21;
		String sexo = "hombre";
		String dni = "y192424hf";
		String direccion = "calle_general";
		String resultadonombre, resultadoapellido,  resultadodni, resultadodireccion, resultadosexo;
		int resultadoedad;

		Habitante habitante = new Habitante();

		habitante.setNombre(nombre);
		habitante.setApellido(apellido);
		habitante.setEdad(edad);
		habitante.setDni(dni);
		habitante.setDireccion(direccion);
		habitante.setSexo(sexo);

		resultadonombre = habitante.getNombre();
		resultadoapellido = habitante.getApellido();
		resultadoedad = habitante.getEdad();
		resultadodni = habitante.getDni();
		resultadodireccion = habitante.getDireccion();
		resultadosexo = habitante.getSexo();

		System.out.println("\n el nombre es :" + resultadonombre);
		System.out.println("\n el apellido es :" + resultadoapellido);
		System.out.println("\n la edad es  :" + resultadoedad);
		System.out.println("\n el sexo es  :" + resultadosexo);
		System.out.println("\n el dni  es :" + resultadodni);
		System.out.println("\n la direccion es :" + resultadodireccion);


		System.out.println("\n *********************Inmueble******************");
		

		String departamento = "2derecha";
		String garaje = "bajo_plaza4";
		String resultadodepartamento, resultadogaraje;
		
		Inmueble inmueble = new Inmueble();

		inmueble.setDepartamento(departamento);
		inmueble.setGaraje(garaje);

		resultadodepartamento = inmueble.getDepartamento();
		resultadogaraje = inmueble.getGaraje();


		System.out.println("\n el departamento es :" + resultadodepartamento);
		System.out.println("\n el garaje es :" + resultadogaraje);



		System.out.println("\n ****************Espaciopublico******************");


		String nombreespacio = "plaza_santa_fe";
		String direccionespacio = "paseo_nuevo";
		String resultadonombreespacio, resultadodireccionespacio;

		EspacioPublico espaciopublico = new EspacioPublico();

		espaciopublico.setNombreespacio(nombreespacio);
		espaciopublico.setDireccionespacio(direccionespacio);

		
		resultadonombreespacio = espaciopublico.getNombreespacio();
		resultadodireccionespacio = espaciopublico.getDireccionespacio();


		System.out.println("\n el espacio publico es " +resultadonombreespacio);
		System.out.println("\n la direccion es :" + resultadodireccionespacio);

		System.out.println("\n ****************Ayuntamiento******************");

		
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

		System.out.println("\n nombre de Ayuntamiento :" + resultadonombreayuntamiento);
		System.out.println("\n direccion del Ayuntamiento:" + resultadodireccionayuntamiento );
		System.out.println("\n tipo de cargo : " + resultadocargo );

		System.out.println("\n ");


		
		try
		{
			
			BufferedReader br = new BufferedReader(new FileReader("/home/zubiri/Java/Definicion_de_clases/Elecciones/ListaPartido.txt"));

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
		}
	}
}














			








	