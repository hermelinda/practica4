import junit.framework.TestCase;
import java.util.ArrayList;
public class SesionCursoTest extends TestCase{
	private SesionCurso sesion;
	public void setUp(){
		sesion = new SesionCurso("ENG", "101");
	}
	
	public void TestCrear(){
		assertEquals("ENGL", sesion.getDepartamento());
		assertEquals("101", sesion.getNumero());
		assertEquals(0, sesion.getNumeroDeEstudiante());
		
	}
	
	public void testInscribirEstudiante(){
		SesionCurso sesion = new SesionCurso("ENG", "101");
		Estudiante estudiante1 = new Estudiante("Juan Lopez");
		sesion.inscribir(estudiante1);
		
		ArrayList<Estudiante> todosLosEstudiantes = sesion.getTodosLosEstudiantes();
		assertEquals(1, todosLosEstudiantes.size());
		
		assertEquals(estudiante1, todosLosEstudiantes.get(0));
		
		Estudiante estudiante2 = new Estudiante("Laura Mora");
		sesion.inscribir(estudiante2);
		
		assertEquals(2, sesion.getNumeroDeEstudiante());
		assertEquals(estudiante1, todosLosEstudiantes.get(0));
		assertEquals(estudiante2, todosLosEstudiantes.get(1));		
	}

}
