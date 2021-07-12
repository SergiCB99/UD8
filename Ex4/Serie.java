
public class Serie {

	private String titulo;
	private int numero_temporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	private final int numero_temporadas_default = 3;
	private final boolean entregado_default = false;
	private final String titulo_default = "";
	private final String genero_default = "";
	private final String creador_default = "";
	
	public Serie () {
		this.titulo = titulo_default;
		this.numero_temporadas = numero_temporadas_default;
		this.entregado = entregado_default;
		this.genero = genero_default;
		this.creador = creador_default;
	}
	
	public Serie (String titulo, String creador) {
		this.titulo = titulo;
		this.numero_temporadas = numero_temporadas_default;
		this.entregado = entregado_default;
		this.genero = genero_default;
		this.creador = creador;
	}
	
	public Serie (String titulo, int numero_temporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numero_temporadas = numero_temporadas;
		this.genero = genero;
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numero_temporadas=" + numero_temporadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + "]";
	}
	
	
	
}
