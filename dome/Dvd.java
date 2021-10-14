package dome;

public class Dvd {

	private String comentario;
	private String tiposDvd;
	private boolean emprestado;
	private double tempoDuracao;
	
	public Dvd(String comentario, String tiposDvd, boolean emprestado, double tempoDuracao) {
		this.comentario = comentario;
		this.tiposDvd = tiposDvd;
		this.emprestado = emprestado;
		this.tempoDuracao = tempoDuracao;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getTiposDvd() {
		return tiposDvd;
	}

	public void setTiposDvd(String tiposDvd) {
		this.tiposDvd = tiposDvd;
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
	
	public String toString() {
		
		 return   comentario  + "  -  " + tiposDvd + "  -  " + emprestado + "  -   "   + tempoDuracao;
		}
}
