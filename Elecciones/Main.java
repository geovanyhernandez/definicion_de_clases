
import java.util.*;

public class Main{
	
	public static void main(String args[]){

		//Habitante

		String nombre = pepe;
		String apellido = hernandez;
		String edad = edad;
		String sexo = hombre;
		String dni = y192424hf;
		String direccion = calle_general;
		String resultadonombre, resultadoapellido, resultadoedad, resultadodni, resultadodireccion, resultadosexo;

		Habitante habitante = new Habitante();

		habitante.setNombre( nombre);
		habitante.setApellido(apellido);
		habitante.setEdad( edad);
		habitante.setdni(dni);
		habitante.setdireccion(direccion);

		resultadonombre = habitante.getNombre();
		resultadoapellido = habitante.getApellido();
		resultadoedad = habitante.getEdad();
		resultadodni = habitante.getDni();
		resultadodireccion = habitante.getDireccion();

		System.out.println("\n el nombre es " + resultadonombre);
		System.out.println("\n el apellido es " + resultadoapellido);
		System.out.println("\n la edad es  " + resultadoedad);
		System.out.println("\n el sexo es  " + resultadosexo);
		System.out.println("\n el dni  es " + resultadodni);
		System.out.println("\n la direccion es " + resultadodireccion);


		//Inmueble
		//Inmueble inmueble = new Inmueble();

		//String departamento = derecha;
		//String garaje = bajo;
		//String trastero = izquierda2;


		//Espaciopublico
		//String nombreespacio = plaza_santa_fe;
		//String direccionespacio = paseo_nuevo;

		//Ayuntamiento
		//String nombreayuntamiento = donostia;
		//String cargo = alcalde;
		//String direccionayuntamiento = bolevard;

		//Partido
		//String nombrepartido = pp;

		//Espaciopublico espaciopublico = new Espaciopublico();
		//Ayuntamiento ayuntamiento = new Ayuntamiento();
		//Partido partido = new Partido();


	}

}








	