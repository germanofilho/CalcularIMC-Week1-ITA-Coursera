import java.text.DecimalFormat;

public class Paciente {
	private double altura;
	private double peso;
	private double imc;

	public Paciente(double peso, double altura){
		this.peso = peso;
		this.altura = altura;
	}

	//Calculate IMC
	public void calcularIMC(){
		imc = peso/(altura*altura);
	}
	
	//Returns String with diagnostic
	public String diagnostico(){
		
		calcularIMC();
		
		//Formatar double para apenas 2 casas decimais
		DecimalFormat df = new DecimalFormat("##.##");
		String imcFormated = df.format(imc);
		String result = null;
		if(imc <= 16) 					result = "Baixo peso muito grave. IMC: " + imcFormated;
		
		if(imc >= 16 && imc <= 16.99) 	result = "Baixo peso grave. IMC: " + imcFormated;
		
		if(imc >= 17 && imc <= 18.49)	result = "Baixo peso. IMC: " + imcFormated;
		
		if(imc >= 18.50 && imc <= 24.99)result = "Peso normal. IMC: " + imcFormated;
		
		if(imc >= 25 && imc <= 29.99) 	result = "Sobrepeso. IMC: " + imcFormated;
		
		if(imc >= 30 && imc <= 34.99) 	result = "Obesidade grau I. IMC: " + imcFormated;
	
		if(imc >= 35 && imc <= 39.99)	result = "Obesidade grau II. IMC: " + imcFormated;
		
		if(imc >= 40)					result = "Obesidade grau III (obesidade mórbida). IMC: " + imcFormated;
		
		return result;
	}
}
