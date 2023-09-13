package iphone;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Navegador nav = new Navegador();
		ReprodutorMusical reprodutor = new ReprodutorMusical(0, "Musica");
		Telefone telefone = new Telefone();
		
		nav.exibirPagina();
		reprodutor.tocar();
		telefone.atender();
		
	}

}
