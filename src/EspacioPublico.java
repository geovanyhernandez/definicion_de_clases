public class EspacioPublico {
  protected int id;
  private String nombreespacio;
  private String direccionespacio;
  
  
  public void setId(int id )
  {
    this.id=id;
  }
  public void setNombreespacio(String nombreespacio)
    {
  this.nombreespacio = nombreespacio; 
    }
  
  public void setDireccionespacio(String direccionespacio)
    {
  this.direccionespacio = direccionespacio; 
    }
  
  public int getId()
  {
    return id;
  }
    public String getNombreespacio()
  {
  	return nombreespacio;
  }
  public String getDireccionespacio()
  {
  	return direccionespacio;
  }

  
}
