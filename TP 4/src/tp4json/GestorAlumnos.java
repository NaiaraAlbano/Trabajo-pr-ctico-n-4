package tp4json;

import static tp4json.Json.JSON_MAPPER;
import java.util.ArrayList;
import java.util.Scanner;
import  java.io.File ;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class GestorAlumnos {
public static ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	
	public static long registrarAlumno()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Nombre: ");
		String nombre = input.nextLine();
		System.out.print("Apellido: ");
		String apellido = input.nextLine();
		System.out.print("DNI: ");
		int dni = input.nextInt();
		System.out.print("Email: ");
		input.nextLine();
		String email = input.nextLine();
		System.out.print("Telefono: ");
		String telefono = input.nextLine();
		NuevoCurso.mostrarCursos();
		System.out.print("Opción: ");
		int opcionCurso = input.nextInt();
		Curso curso = NuevoCurso.cursos.get(opcionCurso -1);
		Alumno alumno = new Alumno (nombre, dni, email, telefono);
		System.out.println("\nAlumno registrado");
		return dni;
	
	
		ObjectMapper mapper = new ObjectMapper();
	
     try
     {
        mapper.writeValue(new File("C://documentos/alumnos.json"), alumnos);
     } catch (JsonGenerationException e)
     {
        e.printStackTrace();
     } catch (JsonMappingException e)
     {
        e.printStackTrace();
     } catch (IOException e)
     {
        e.printStackTrace();
     }
	}
	
	
}
