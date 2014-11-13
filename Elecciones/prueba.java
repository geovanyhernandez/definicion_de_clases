import java.util.*;
import java.io.*;

public class prueba{
	
	public static void main(String args[]){

	


try
		{
			
			BufferedReader br = new BufferedReader(new FileReader("/home/zubiri/ProyectosJava/Definicion_de_clases/Elecciones/ListaPartido.txt"));

			ArrayList <partidos> lista= new ArrayList <partidos>();

		
			String linea = null; 

			while( (linea = br.readLine()) != null)
			{
				
			
				partidos.add(linea.split(", "  )[0]);
				
			}
			

			for(int i=0; i<partidos.size(); i++)
			{
				System.out.println(partidos.get(i));
			}

			partidos.clear();
		
			System.out.println("\nVaciado correctamente. (" + partidos.size() + ")");
			
		}catch(IOException e)
		{
			System.out.println("Error E/S: "+e);
		}
	}
}

