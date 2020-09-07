package tp4json;
import java.util.ArrayList;

public class Curso {
	 String nombre;
		String descripcion;
		static ArrayList<Docente> docentes;
		String fecha;
		String horario;
		String aula;
		int cupoMinimo, cupoMaximo;
		
		ArrayList<Alumno> alumnos;
		
		public Curso(String nombre, String descripcion)
		{
			this.nombre = nombre;
			this.descripcion = descripcion;
			docentes = new ArrayList<Docente>();
			fecha = "";
			horario = "";
			aula = "";
			cupoMinimo = 0;
			cupoMaximo = 0;
			
			alumnos = new ArrayList<Alumno>();
			NuevoCurso.cursos.add(this);
		}
	
		public void agregarAlumno(Alumno alumno)
		{
			alumnos.add(alumno);
		}
		
		public String getNombre(){return nombre;}
		public String getDescripcion(){return descripcion;}
		public String getHorario() {return horario;}
		public String getAula(){return aula;}
		public int getCupoMinimo(){return cupoMinimo;}
		public int getCupoMaximo(){return cupoMaximo;}
		public void setHorario(String horario) {this.horario = horario;}
		public void setAula(String aula) {this.aula = aula;}
		public void setCupoMinimo(int cupoMinimo) {this.cupoMinimo = cupoMinimo;}
		public void setCupoMaximo(int cupoMaximo) {this.cupoMaximo = cupoMaximo;}
		
		@Override
		   public String toString()
		   {
		      return "NuevoCurso [Nombre=" + nombre + ", escripcion=" + descripcion + ", " +
		            "Horario=" + horario + "Aula= " + aula+"]";
		   }

}
