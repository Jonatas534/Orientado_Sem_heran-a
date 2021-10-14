package dome.herança;

public class Dvd extends Multimidia {
 
	private String tiposDvd;

	public Dvd(String comentario, boolean emprestado, double tempoDuracao, String tiposDvd) {
		super(comentario, emprestado, tempoDuracao);
		this.tiposDvd = tiposDvd;
	}

	

	public String getTiposDvd() {
		return tiposDvd;
	}

	public void setTiposDvd(String tiposDvd) {
		this.tiposDvd = tiposDvd;
	}
	public String toString() {
		
		 return comentario  + "  -  " + emprestado + "  -   " + tempoDuracao +"  -  " + tiposDvd ;
		}
}
