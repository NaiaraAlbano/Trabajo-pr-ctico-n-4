package tp4json;

public class Alumno {
	String nombre;
	String apellido;
	int dni;
	String email;
	String telefono;
	
	public Alumno(String nombre, String apellido, int dni, String email, String telefono)
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.email = email;
		this.telefono = telefono;
		GestorAlumnos.alumnos.add(this);
	}
	public int getDni() {return dni;}
	public String getNombre() {return nombre;}
	
	 @Override
	   public String toString()
	   {
	      return "GestorAlumnos [Nombre=" + nombre + ", Apellido=" + apellido + ", " +
	            "Dni=" + dni + "Email=" +email+ "]";
	   }
}

