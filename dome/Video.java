package dome;

public class Video {
	private String comentario;
	private String diretor;
	private boolean emprestado;
	private double tempoDuracao;

	public Video(String comentario, String diretor, boolean emprestado, double tempoDuracao) {
		super();
		this.comentario = comentario;
		this.diretor = diretor;
		this.emprestado = emprestado;
		this.tempoDuracao = tempoDuracao;
	}

	public String getComentario() {
		return comentario;
	}

	public String getDiretor() {
		return diretor;
	}

	public boolean isEmprestado() {
		return emprestado;
	}

	public double getTempoDuracao() {
		return tempoDuracao;
	}
	public String toString() {
		
		 return   comentario  + "  -  " + diretor +"  -  " + emprestado + " - " + tempoDuracao;
		}
}
