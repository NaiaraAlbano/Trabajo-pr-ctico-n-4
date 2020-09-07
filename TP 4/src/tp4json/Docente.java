package tp4json;

public class Docente {
	String nombre;
	int legajo;
	String dni;
	String telefono;
	String email;
	String direccion;
	String titulo;
	
	public Docente(String nombre, int legajo, String dni, String telefono, String email, String direccion, String titulo)
	{
		this.nombre = nombre;
		this.legajo = legajo;
		this.dni = dni;
		this.telefono = telefono;
		this.email = email;
		this.direccion = direccion;
		this.titulo = titulo;
		GestorDocentes.docentes.add(this);
	}
	public static int getLegajo() {return legajo;}
	public String getNombre() {return nombre;}
	
	@Override
	   public String toString()
	   {
	      return "GestorDcoentes [Nombre=" + nombre + ", Título=" + titulo + ", " +
	            "Legajo=" + legajo + "Email="+ email+"]";
	   }
}
