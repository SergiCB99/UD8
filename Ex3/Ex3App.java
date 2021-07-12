
public class Ex3App {

	public static void main(String[] args) {
		
		Electrodomestico electrodomestico1 = new Electrodomestico();
		Electrodomestico electrodomestico2 = new Electrodomestico(150.6,100.5);
		Electrodomestico electrodomestico3 = new Electrodomestico(124.9,"Gris",'B',150.4);
	
		System.out.println(electrodomestico1.toString());
		System.out.println(electrodomestico2.toString());
		System.out.println(electrodomestico3.toString());
		
		
	}
	
}
