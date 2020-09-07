package tp4json;

import java.util.Scanner;

public class GestorCurso {
public static void main(String[] args) {
		
		Docente docente1 = new Docente("Aldo Perez", 1, "20857469", "3438526458", "aldo@gmail.com", "Liniers 425", "Ingeniero en Sistemas");
		Docente docente2 = new Docente("Daniela Cervetti", 2, "178596325", "351897456", "danielacerv@gmail.com", "Guemes 669", "Psicologa");
		Curso curso1 = new Curso("Microsoft Excel", "Para alumnos");
		Curso curso2 = new Curso("Prezi", "Para alumnos");
		Scanner input = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("-----------SE DESEA----------");
			System.out.println("1- Registrar Cursos.");
			System.out.println("2- Asignar docente a un curso.");
			System.out.println("3- Planificar dictado de clases.");
			System.out.println("4- Inscribir alumno.");

			System.out.print("Opción: ");
			opcion = input.nextInt();
			switch(opcion)
			{
			case 1:
				NuevoCurso.agregarCurso();
				NuevoCurso.mostrarCursos();
				break;
			case 2:
				asignarDocente();
				break;
			case 3:
				planificarCurso();
				break;
			case 4:
				GestorAlumnos.registrarAlumno();
				break;
			}
			System.out.println();
		}while(opcion != 5);
		
		
	}
	
	public static void asignarDocente()
	{
		Scanner doc = new Scanner(System.in);
		NuevoCurso.mostrarCursos();
		System.out.print("Opción: ");
		int opcionCurso = doc.nextInt();
		Curso curso = NuevoCurso.cursos.get(opcionCurso - 1);
		System.out.println("-->Docentes registrados:\n");
		GestorDocentes.mostrarDocentes();
		System.out.print("-->Para asignar docente precione 1");
		int opcion = doc.nextInt();
		if(opcion == 1)
		{
			Docente docente = GestorDocentes.retornarDocente();
			GestorDocentes.agregarDocente(docente);
		}
	}
	
	public static void planificarCurso()
	{
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("Planificar curso:");
		NuevoCurso.mostrarCursos();
		System.out.print("Opción: ");
		int opcionCurso = input.nextInt();
		Curso curso = NuevoCurso.cursos.get(opcionCurso); 
		System.out.println("CURSO: " + curso.getNombre());
	
		System.out.print("- Días de clases: ");
		input.nextLine();
		String fechas = input.nextLine();	
		System.out.print("- Horario: ");
		String horario = input.nextLine();
		curso.setHorario(horario);
		System.out.print("- Aula: ");
		String aula = input.nextLine();
		curso.setAula(aula);
		System.out.print("- Cupo mínimo: ");
		int cupoMinimo = input.nextInt();
		curso.setCupoMinimo(cupoMinimo);
		System.out.print("- Cupo máximo: ");
		int cupoMaximo = input.nextInt();
		curso.setCupoMaximo(cupoMaximo);
}
}
