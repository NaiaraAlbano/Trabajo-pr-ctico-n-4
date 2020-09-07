package tp4json;

import static tp4json.Json.JSON_MAPPER;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.ObjectMapper;

import java.util.ArrayList;
import java.util.Scanner;

public class NuevoCurso {
public static ArrayList<Curso> cursos = new ArrayList<Curso>();
	
	public static void mostrarCursos()
	{
		int i = 1;
		System.out.println("\n\tCURSOS DISPONIBLES: ");
		for(Curso curso: cursos)
		{
			System.out.println(i++ + "- " + curso.getNombre());
		}
	}
	public static void agregarCurso()
	{
		Scanner cur = new Scanner(System.in);
		String nombre;
		String descripcion;
		System.out.println("------NUEVO CURSO------\n");
		System.out.print("- Nombre: ");
		nombre = cur.nextLine();
		System.out.print("\n- Descripción: ");
		descripcion = cur.nextLine();
		Curso cursoN = new Curso(nombre, descripcion);
		
		System.out.println("Curso registrado.");
	
	
	ObjectMapper mapper = new ObjectMapper();
	
    try
    {
       mapper.writeValue(new File("C://documentos/alumnos.json"),cursos);
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
