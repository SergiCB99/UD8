
public class Persona {

	private String nombre;
	private int edad;
	private String DNI;
	private char sexo;
	private Double peso;
	private Double altura;

	private final String nombre_default = "";
	private final int edad_default = 0;
	private final char sexo_default = 'H';
	private final Double peso_default = 0.0;
	private final Double altura_default = 0.0;
	
	public Persona (String nombre, int edad, String DNI, char sexo, Double peso, Double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = DNI;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	public Persona (String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.DNI = "11111111X";
		this.peso = peso_default;
		this.altura = altura_default;
	}
	
	public Persona () {
		this.nombre = nombre_default;
		this.edad = edad_default;
		this.sexo = sexo_default;
		this.DNI = "11111111X";
		this.peso = peso_default;
		this.altura = altura_default;
	}

	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	
	
}
