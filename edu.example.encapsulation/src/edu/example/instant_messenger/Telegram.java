package edu.example.instant_messenger;

public class Telegram extends ServicoMensagemInstantanea {
	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Recebendo mensagem do Telegram");
		salvarHistoricoMensagem();
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem do Telegram");
		salvarHistoricoMensagem();		
	}
	
	public void criarSuperGrupo() {
		System.out.println("Super grupo criado");
	}
}
