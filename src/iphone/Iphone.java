package iphone;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
	

	@Override
	public void exibirPagina(String url) {
		System.out.println("Acessando...");
		System.out.println("Atualmente no site " + url);	
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("+1 aba");		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Dando um F5...");		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para o número " + numero);
		System.out.println("Chamando..."); 
	}

	@Override
	public void atender() {
		System.out.println("Atendendo o celular");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Reproduzindo mensagens do correio de voz...");
	}

	@Override
	public void tocar() {
		System.out.println("Tocando músicas!");
	}

	@Override
	public void pausar() {
		System.out.println("Música pausada");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Tocando a música " + musica);
	}
}