
public class Electrodomestico {

	protected Double precio_base;
	protected String color;
	protected char consumo_energetico;
	protected Double peso;
	
	private final Double precio_base_default = 100.0;
	private final static String color_default = "Blanco"; //Static para el metodo comprovarColor
	private final static char consumo_energetico_default = 'F';//Static para el metodo comprovarConsumo
	private final Double peso_default = 5.0;
	
	public Electrodomestico () {
		this.precio_base = precio_base_default;
		this.color = color_default;
		this.consumo_energetico = consumo_energetico_default;
		this.peso = peso_default;
	}
	
	public Electrodomestico (Double precio, Double peso) {
		this.precio_base = precio;
		this.color = color_default;
		this.consumo_energetico = consumo_energetico_default;
		this.peso = peso;
	}
	
	public Electrodomestico (Double precio, String color, char consumo_energetico, Double peso) {
		this.precio_base = precio;
		this.color = comprovarColor(color);
		this.consumo_energetico = comprovarConsumo(consumo_energetico);
		this.peso = peso;
	}
	
	public static String comprovarColor (String color) {
		
		if(color.equalsIgnoreCase("blanco")||color.equalsIgnoreCase("negro")||color.equalsIgnoreCase("rojo")||color.equalsIgnoreCase("azul")||color.equalsIgnoreCase("gris")) {
			return color;
		}else {
			return color_default;
		}
		
	}
	
	public static char comprovarConsumo (char consumo_energetico) {
		
		if(consumo_energetico=='A'||consumo_energetico=='B'||consumo_energetico=='C'||consumo_energetico=='D'||consumo_energetico=='E'||consumo_energetico=='F') {
			return consumo_energetico;
		}else {
			return consumo_energetico_default;
		}

	}

	@Override
	public String toString() {
		return "Electrodomestico [precio_base=" + precio_base + ", color=" + color + ", consumo_energetico="
				+ consumo_energetico + ", peso=" + peso + "]";
	}
	
	
	
}
