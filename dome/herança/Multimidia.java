package dome.herança;

public class Multimidia {

	protected String comentario;
	protected boolean emprestado;
	protected double tempoDuracao;

	public Multimidia(String comentario, boolean emprestado, double tempoDuracao) {
		this.comentario = comentario;
		this.emprestado = emprestado;
		this.tempoDuracao = tempoDuracao;
	}



	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public boolean isEmprestado() {
		return emprestado;
	}

	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}

	public double getTempoDuracao() {
		return tempoDuracao;
	}

	public void setTempoDuracao(double tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}
	
}
