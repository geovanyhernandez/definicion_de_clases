public class Habitante {

private String nombre;
private String apellido;
private String direccion;
private int edad;
private int dni;

 
public  Habitante (String nombre, String apellido, String direccion, int edad, int dni)
{
  this.nombre=nombre;
  this.apellido=apellido;
  this.direccion=direccion;
  this.edad=edad;
  this.dni=dni;
  
}

 public void setNombre(String nombre)
  {
this.nombre = nombre; 
  }

 public void setApellido(String apellido)
  {
this.apellido = apellido; 
  }

 public void setEdad(int edad)
  {
this.edad = edad; 
  }


public void setDni(int dni)
  {
this.dni = dni; 
  }

public void setDireccion(String direccion)
  {
this.direccion = direccion; 
  }


public String getNombre()
{
  return nombre;
}
public String getApellido()
{
  return apellido;
}
public int getEdad()
{
  return edad;
}

public int getDni()
{
  return dni;
}
public String getDireccion()
{
  return direccion;
}



 //}
}









