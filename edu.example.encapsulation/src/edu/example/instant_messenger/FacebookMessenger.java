package edu.example.instant_messenger;

public class FacebookMessenger extends ServicoMensagemInstantanea {
	@Override
	public void enviarMensagem() {
		coletarDados();
		validarConectadoInternet();
		System.out.println("Recebendo mensagem do FB");
		salvarHistoricoMensagem();
		coletarDados();
	}

	@Override
	public void receberMensagem() {
		coletarDados();
		System.out.println("Recebendo mensagem do FB");
		salvarHistoricoMensagem();
		coletarDados();
	}
	
	private void coletarDados() {
		System.out.println("Alma vendida com sucesso");
	}
}
