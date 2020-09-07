package tp4json;

import static tp4json.Json.JSON_MAPPER;
import java.util.ArrayList;
import java.util.Scanner;

import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.ObjectMapper;

public class GestorDocentes {
public static ArrayList<Docente> docentes = new ArrayList<Docente>();

	
	public static int buscarDocente(int legajoDocente)
	{
		int pos = -1;
		int i = 0;
		for(Docente docente: docentes)
		{
			if(legajoDocente == docente.getLegajo())
			{
				pos = i;
			}
			i++;
		}
		return pos;
	}
	public static Docente retornarDocente()
	{
		Scanner input = new Scanner(System.in);
		Docente docente = null;
		int posDocente;
		System.out.print("Legajo de docente: ");
		do {
		int legajoDocente = input.nextInt();
		posDocente = buscarDocente(legajoDocente);
		if(posDocente != -1)
		{
			docente = docentes.get(posDocente);
		}
		else
		{
			System.out.print("Legajo no existente. Vuelva a ingresar: ");
		}
		}while(posDocente == -1);
		return docente;
	}


	public static void agregarDocente(Docente docente)
	{
		docentes.add(docente);
		System.out.println(docente.getNombre() + " fue asignado correctamente al curso " + Curso.getNombre() + ".");
	}

	public static void mostrarDocentes()
	{
		int i = 1;
		for(Docente docente: docentes)
		{
			System.out.println(i++ + "- " + docente.getNombre() + ".");
		}
	
		ObjectMapper mapper = new ObjectMapper();
	 try
     {
        mapper.writeValue(new File("c://documentos/alumnos.json"), docentes);
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


