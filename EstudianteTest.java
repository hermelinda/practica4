

public class EstudianteTest extends junit.framework.TestCase{
	public void testCrear(){
		final String primerNombreEstudiante = "Juan Foo";
		
		Estudiante estudiante = new Estudiante("Juan Foo");
		//String nombreEstudiante = estudiante.getNombre();
		//assertEquals("Juana Foo", nombreEstudiante); //Solo regresa true(paso prueba) entre parentesis (valor esperado y lo que quiero probar) o false
		assertEquals(primerNombreEstudiante, estudiante.getNombre());
		
		
		final String segundoNombreEstudiante="Juana Bar";
		Estudiante segundoEstudiante = new Estudiante("Juana Bar");
		//String segundoNombreEstudiante = segundoEstudiante.getNombre();
		//assertEquals("Juan Bar", segundoNombreEstudiante);
		assertEquals(segundoNombreEstudiante, segundoEstudiante.getNombre());
	}
}
