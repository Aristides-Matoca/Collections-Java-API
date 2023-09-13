package iphone;

public class ReprodutorMusical {
	private int idMusica;
	private String nomeMusica;

	public ReprodutorMusical(int idMusica, String nomeMusica) {
		this.idMusica = idMusica;
		this.nomeMusica = nomeMusica;
	}

	public void tocar() {
		System.out.println("Musica a tocar");
	}
	
	public void pausar() {
		System.out.println("Musica pausada");
	}
	
	public void selecionarMusica() {
		System.out.println("Musica selecionada");
	}
}