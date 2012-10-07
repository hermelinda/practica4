// constructores si no se crean automaticamente se crea aunque no se vea, pero siempre estan
import java.util.ArrayList;
public class SesionCurso {
	private String departamento;
	private String numero;
	//private int numeroDeEstudiantes;
	private java.util.ArrayList<Estudiante> estudiantes = new java.util.ArrayList<Estudiante>();
	
	SesionCurso(String departamento, String numero){
		this.departamento = departamento;
		this.numero = numero;
		//this.numeroDeEstudiantes = 0;
	}
	String getDepartamento() {
		return departamento;
	}
	void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	String getNumero() {
		return numero;
	}
	void setNumero(String numero) {
		this.numero = numero;
	}
	int getNumeroDeEstudiante() {
		// TODO Auto-generated method stub
		return estudiantes.size();
	}
	void inscribir(Estudiante estudiante) {
		// TODO Auto-generated method stub
		//numeroDeEstudiantes = numeroDeEstudiantes + 1;
		estudiantes.add(estudiante);
	}
	ArrayList<Estudiante> getTodosLosEstudiantes(){
		return estudiantes;
	}

}
