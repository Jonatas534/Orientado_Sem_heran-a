package dome;

public class Cd {
	private String artista, comentario, titulo;
	private boolean emprestado;
	private int nroMusicas;
	private double tempoDuracao;

	public Cd(String artista, String comentario, String titulo, boolean emprestado, int nroMusicas,
			double tempoDuracao) {
		this.artista = artista;
		this.comentario = comentario;
		this.titulo = titulo;
		this.emprestado = emprestado;
		this.nroMusicas = nroMusicas;
		this.tempoDuracao = tempoDuracao;
	}



	public String getArtista() {
		return artista;
	}



	public String getComentario() {
		return comentario;
	}



	public String getTitulo() {
		return titulo;
	}



	public boolean isEmprestado() {
		return emprestado;
	}



	public int getNroMusicas() {
		return nroMusicas;
	}



	public double getTempoDuracao() {
		return tempoDuracao;
	}



	@Override
	public String toString() {
		
	 return artista  +  "  -  "  +  comentario  + "  -  " + titulo +"  -  " + emprestado +"  -  " + nroMusicas + "  - " + tempoDuracao;
	}

}
