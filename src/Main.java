//Author: Germano Filho
//Coursera Orientacao a Objetos ITA

public class Main {

	public static void main(String[] args) {
		//Criando objetos Paciente
		Paciente paciente = new Paciente(35, 1.71);
		Paciente paciente2 = new Paciente(360, 1.72);
		Paciente paciente3 = new Paciente(80, 1.67);
			
		//printando na tela os o diagnostico dos pacientes
		System.out.println(paciente.diagnostico());
		System.out.println(paciente2.diagnostico());
		System.out.println(paciente3.diagnostico());
	}

}
