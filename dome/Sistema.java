package dome;

import java.util.Scanner;

public class Sistema {

	private BaseDados dados;
	private Scanner teclado;

	public Sistema() {
		dados = new BaseDados();
		teclado = new Scanner(System.in);

	}

	public static void main(String[] args) {
		Sistema sis = new Sistema();
		sis.exibeMenu();

	}

	private void exibeMenu() { // menu principal
		int opcao = 0;
		do {
			System.out.println("\n\n - Sistema de Multimidias ");
			System.out.println("\n   =========================");
			System.out.println("  1 - Cadastrar Cd |");
			System.out.println("  2 - Listar Cd ");
			System.out.println("  3 - Cadastrar Video ");
			System.out.println("  4 - Listar Video      |");
			System.out.println("  5 - Cadastrar Dvd      |");
			System.out.println("  6 - Listar Dvd   |");
			System.out.println("  0 - Sair          |");
			System.out.println("   =========================\n");
			opcao = teclado.nextInt();
			switch (opcao) {
			case 1:
				cadastrarCd();
				break;
			case 2:
				listarCds();
				break;
			case 3:
				cadastrarVideo();
				break;
			case 4:
				listarVideo();
				break;
			case 5:
				cadastrarDvd();
				break;
			case 6:
				listarDvd();
				break;

			case 0:
				break;
			default:
				System.out.println("Op��o Inv�lida!");
				break;
			}
		} while (opcao != 0);
	}

	private void listarDvd() {

		dados.listarDvd();
	}

	private void cadastrarDvd() {
		teclado.nextLine();
		System.out.println("Informe o coment�rio sobre o Dvd:");
		String comentario = teclado.nextLine();

		System.out.println("Informe o tipo do video:(DVD-RAW, DVD-ROW,DVD-R...");
		String tiposDvd = teclado.nextLine();

		System.out.println(" O video est� emprestado? sim/n�o");
		String estaEmprestado = teclado.nextLine();

		System.out.println("Informe o tempo de Dura��o do video:");
		double tempoDura��o = teclado.nextDouble();

		Dvd dvd = new Dvd(comentario, tiposDvd, estaEmprestado.equals("sim") ? true : false, tempoDura��o);
		dados.inserirDvd(dvd);
	}

	private void listarVideo() {

		dados.listarVideos();
	}

	private void cadastrarVideo() {
		teclado.nextLine();
		System.out.println("Informe o coment�rio sobre o v�deo:");
		String comentario = teclado.nextLine();

		System.out.println("Informe o diretor do video:");
		String diretor = teclado.nextLine();

		System.out.println(" O video est� emprestado? sim/n�o");
		String estaEmprestado = teclado.nextLine();

		System.out.println("Informe o tempo de Dura��o do video:");
		double tempoDura��o = teclado.nextDouble();

		Video video = new Video(comentario, diretor, estaEmprestado.equals("sim") ? true : false, tempoDura��o);
		dados.inserirVideo(video);
	}

	private void listarCds() {

		dados.listarCds();
	}

	private void cadastrarCd() {
		teclado.nextLine();
		System.out.println("Informe o nome do Artista:");
		String artista = teclado.nextLine();

		System.out.println("Informe o coment�rio sobre o CD");
		String comentario = teclado.nextLine();

		System.out.println("Informe o t�tulo do Cd:");
		String titulo = teclado.nextLine();

		System.out.println(" O Cd est� emprestado? sim/n�o");
		String estaEmprestado = teclado.nextLine();

		System.out.println("Informe o numero de m�sicas do Cd:");
		int nroMusicas = teclado.nextInt();

		System.out.println("Informe o tempo de Dura��o do Cd:");
		double tempoDura��o = teclado.nextDouble();

		Cd cd = new Cd(artista, comentario, titulo, estaEmprestado.equals("sim") ? true : false, nroMusicas,
				tempoDura��o);
		dados.inserirCd(cd);
	}
}
