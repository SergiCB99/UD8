
public class Ex4App {

	public static void main(String[] args) {
		
		Serie serie1 = new Serie ();
		Serie serie2 = new Serie ("Simpsons","Matt Groening");
		Serie serie3 = new Serie ("Futurama",22,"Ciencia Ficcion","Matt Groening");
	
		System.out.println(serie1.toString());
		System.out.println(serie2.toString());
		System.out.println(serie3.toString());
		
	}
	
}
