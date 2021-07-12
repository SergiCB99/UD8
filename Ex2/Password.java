
public class Password {
	
	private int longitud;
	private String password;
	
	private final int longitud_default = 8;
	
	public Password () {
		this.longitud = longitud_default;
		this.password = crearPassword(longitud_default);
	}
	
	public Password (int longitud) {
		this.longitud = longitud;
		this.password = crearPassword(longitud);
	}
	
	public static String crearPassword (int longitud) {
		String password = "";
		int letra;
		String letras[] = new String [8];
		letras [0] = "A";
		letras [1] = "B";
		letras [2] = "C";
		letras [3] = "D";
		letras [4] = "E";
		letras [5] = "F";
		letras [6] = "G";
		letras [7] = "H";
		
		for(int i=0;i<longitud;i++) {
			letra = 0 + (int)(Math.random() * ((7 - 0) + 1));
			
			password = password.concat(letras[letra]);
		}
		return password;
	}

	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", password=" + password + "]";
	}
	
	
	
}
