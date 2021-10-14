package dome;

import java.util.ArrayList;

public class BaseDados {
	private ArrayList<Cd> listaCd;
	private ArrayList<Video> listaVideo;
	private ArrayList<Dvd> listaDvd;

	public BaseDados() {

		listaCd = new ArrayList<Cd>();
		listaVideo = new ArrayList<Video>();
		listaDvd = new ArrayList<Dvd>();
	}

	public void inserirCd(Cd cd) {

		listaCd.add(cd);

	}

	public void inserirVideo(Video video) {

		listaVideo.add(video);

	}

	public void inserirDvd(Dvd dvd) {

		listaDvd.add(dvd);
	}

	public void listarDvd() {

		for (Dvd dvd : listaDvd) {

			System.out.println(dvd);
		}
	}

	public void listarVideos() {

		for (Video video : listaVideo) {

			System.out.println(video);
		}
	}

	public void listarCds() {

		for (Cd cd : listaCd) {

			System.out.println(cd);
		}

	}

	
}
