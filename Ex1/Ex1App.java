
public class Ex1App {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona ("Sergi",21,"11111111X",'H',1.80,85.4);
		Persona persona2 = new Persona ("Anna",27,'M');
		Persona persona3 = new Persona ();
		
		System.out.println(persona1.toString());
		System.out.println(persona2.toString());
		System.out.println(persona3.toString());
		
	}
	
}
