package dome.herança;

public class Cd extends Multimidia {

	private String artista;
	private int nroMusicas;
	private String titulo;

	

	public Cd(String comentario, boolean emprestado, double tempoDuracao, String titulo, String artista, int nroMusicas) {
		super(comentario, emprestado, tempoDuracao);
		this.titulo = titulo;
		this.artista = artista;
		this.nroMusicas = nroMusicas;
	}


	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public int getNroMusicas() {
		return nroMusicas;
	}

	public void setNroMusicas(int nroMusicas) {
		this.nroMusicas = nroMusicas;
	}
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String toString() {

		return artista + "  -  "+ comentario +" -  " + emprestado +"  -" +  "titulo" + "  -  "+tempoDuracao +" - " + nroMusicas;
	}

	
}
