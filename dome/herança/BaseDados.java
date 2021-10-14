package dome.herança;

import java.util.ArrayList;

public class BaseDados {
	private ArrayList<Multimidia> listaMultimidia;


	public BaseDados() {

		listaMultimidia = new ArrayList<Multimidia>();
;
	}

	public void inserir(Multimidia multimidia) {

		listaMultimidia.add(multimidia);

	}

	

	public void listar() {

		for (Multimidia multimidia : listaMultimidia) {

			System.out.println(multimidia);
		}
	
	}
	
}

